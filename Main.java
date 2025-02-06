package trab;


public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setMotor("V6")
                .setRodas(4)
                .setCor("Blue")
                .build();

        System.out.println(car);


        Oficina director = new Oficina();
        Car sportsCar = director.createSportsCar();
        System.out.println(sportsCar);
    }
}