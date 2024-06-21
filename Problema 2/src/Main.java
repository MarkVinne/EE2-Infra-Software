public class Main {
    public static void main(String[] args) {
        Ponte ponte = new Ponte();
        String carros = "Carro1 esquerdo-Carro2 direito-Carro3 esquerdo-Carro4 direito";
        String[] lista_carros= carros.split("-");

        for(int i = 0; i < lista_carros.length; i++){
            String[] atual = lista_carros[i].split(" ");
            Carro thread = new Carro(atual[0], ponte, atual[1]);
            thread.start();

        }
    }
}