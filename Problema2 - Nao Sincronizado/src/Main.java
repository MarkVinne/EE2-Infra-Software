public class Main {
    public static void main(String[] args) {
        Ponte ponte = new Ponte();
        Carro carro1 = new Carro("Carro 1", ponte, "esquerdo");
        Carro carro2 = new Carro("Carro 2", ponte, "direito");
        Carro carro3 = new Carro("Carro 3", ponte, "esquerdo");
        Carro carro4 = new Carro("Carro 4", ponte, "direito");

        carro1.start();
        carro2.start();
        carro3.start();
        carro4.start();
    }
}
