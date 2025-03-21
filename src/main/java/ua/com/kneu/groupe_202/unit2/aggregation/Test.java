package ua.com.kneu.groupe_202.unit2.aggregation;

public class Test {

    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.setId(1L);
        engine.setModel("CRW-2000");
        engine.setPower(1600.00);

        Car car = new Car(engine);
        car.setId(1L);
        car.setName("Seat2000");
        car.setSize(2500.00);
        car.setTransmission("manual");

        System.out.println(car);


        Engine engine2 = new Engine(2L, "asdas", 20000.00);

        Engine engine3= car.getEngine();

        car.setEngine(engine2);
        System.out.println(car);



    }

}
