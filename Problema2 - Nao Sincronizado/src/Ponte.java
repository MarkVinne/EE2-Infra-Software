public class Ponte{
    void passsar_na_ponte(String nome_carro, String direcao) throws InterruptedException {
        System.out.println(nome_carro + " comecou a atravessar a ponte partindo do lado " + direcao);
        Thread.sleep(1000);

        if (direcao.equals("esquerdo")){
            System.out.println(nome_carro + " terminou de atravessar a ponte, chegando ao lado direito");
        }
        else if (direcao.equals("direito")){
            System.out.println(nome_carro + " terminou de atravessar a ponte, chegando ao lado esquerdo");
        }
    }
}