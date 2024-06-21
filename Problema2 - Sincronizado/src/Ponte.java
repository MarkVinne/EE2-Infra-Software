public class Ponte{
    synchronized void passsar_na_ponte(String nome_carro, String direcao) throws InterruptedException {
        System.out.println(nome_carro + " do lado " + direcao + " comecou a atravessar a ponte.");

        Thread.sleep(1000);//
        System.out.println(nome_carro + " do lado " + direcao + " terminou de atravessar a ponte.");

    }
}