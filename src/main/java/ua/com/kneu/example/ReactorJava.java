package ua.com.kneu.example;

import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServer;

import java.util.List;

public class ReactorJava {

    public static void main(String[] args) throws InterruptedException {

        Mono.empty();
        Flux.empty();

        Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4);
        integerFlux.subscribe(e -> System.out.println(e));

        Mono.just("Hello").subscribe(System.out::println);
        Mono<Integer> integerMono = Mono.just(1);

        Flux<Integer> integerFlux1 = integerMono.flux();
        Mono<Integer> monoMono = integerFlux.elementAt(0);

        Flux<Integer> integerFlux3 = Flux.range(1, 10);
        integerFlux3.subscribe(e -> System.out.println(e));


        List<Integer> list = List.of(1, 2, 3, 4, 5, 5);

        Flux<Integer> fluxList = Flux.fromIterable(list);


        Flux.<String>generate(el -> el.next("Hello"))
                .take(10)
                .subscribe(System.out::println);


        Flux.generate(
                () -> 2000,
                (state, sink) ->
                {
                    if (state > 2500) {
                        sink.complete();
                    } else {
                        sink.next("Hello :" + state);
                    }
                    return state + 3;

                }).subscribe(System.out::println);


        Flux<User> userFlux = Flux.just(
                new User(1, "Vasya", "Pypkin", 18),
                new User(1, "Iva", "Pypkina", 21),
                new User(1, "Ivanka", "Pypkina", 19)
        );


        userFlux.subscribe(System.out::println);


        HandlerFunction<ServerResponse> helloHandler = serverResponse ->
                ServerResponse.
                        ok()
                        .contentType(MediaType.TEXT_PLAIN)
                        .bodyValue("Hello World");


        HandlerFunction<ServerResponse> usersHandler = serverResponse ->
                ServerResponse
                        .ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(userFlux, User.class);

        RouterFunction<ServerResponse> routers = RouterFunctions
                .route(RequestPredicates.GET("/hello"), helloHandler)
                .andRoute(RequestPredicates.GET("/users"), usersHandler);

        HttpHandler handler = RouterFunctions.toHttpHandler(routers);


        HttpServer
                .create()
                .port(8080)
                .handle(new ReactorHttpHandlerAdapter(handler))
                .bindNow();

        Thread.currentThread().join();

    }


}
