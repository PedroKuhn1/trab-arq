package trab;


public class Oficina {
    public Car createSportsCar() {
        return new Car.CarBuilder()
                .setMotor("V8")
                .setRodas(4)
                .setCor("Vermelho")
                .build();
    }
}
