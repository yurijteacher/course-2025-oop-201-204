package ua.com.kneu.lecture.creational.builder;

public class Test {

    public static void main(String[] args) {

        Car car = new BuilderCar()
                .getModel("Sport Car S")
                .getEngine(Engine.l3000)
                .getColor(ColorCar.yellow)
                .getTransmission(Transmission.manual)
                .getTypeByRoad(TypeByRoad.sport)
                .build();

        System.out.println(car);

        Car car1 = new BuilderCar()
                .getEngine(Engine.l2000).build();

        System.out.println(car1);


        Car car2 = new Car();
        System.out.println(car2);
        car2.setColor(ColorCar.blue);

        System.out.println(car2);
    }
}
