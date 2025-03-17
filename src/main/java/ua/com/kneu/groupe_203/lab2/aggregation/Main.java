package ua.com.kneu.groupe_203.lab2.aggregation;

public class Main {

    // psvm + [Tab]
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setId(1L);
        engine.setName("CRV");
        engine.setSizeEngine(SizeEngine.s1700);
        engine.setDescription("sad asd asd sad asd");

        Car car = new Car();

        car.setId(1L);
        car.setMaker("Honda");
        car.setEngine(engine);
        car.setModel("Sad asd");

        Engine engine1 = new Engine();
        engine1.setId(2L);
        engine1.setName("CRV");
        engine1.setSizeEngine(SizeEngine.s1700);
        engine1.setDescription("sad asd asd sad asd");

        Engine engine2 = car.getEngine();





    }

}
