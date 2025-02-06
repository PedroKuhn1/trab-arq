package trab;

// Produto
public class Carro {
    private String Motor;
    private int rodas;
    private String cor;

    private Carro(CarBuilder builder) {
        this.Motor = builder.Motor;
        this.rodas = builder.rodas;
        this.cor = builder.cor;
    }

    public static class CarBuilder {
        private String Motor;
        private int rodas;
        private String cor;

        public CarBuilder setMotor(String motor) {
            this.Motor = motor;
            return this;
        }

        public CarBuilder setRodas(int rodas) {
            this.rodas = rodas;
            return this;
        }

        public CarBuilder setCor(String cor) {
            this.cor = cor;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car [Motor=" + Motor + ", Rodas=" + rodas + ", Cor=" + cor + "]";
    }
}
