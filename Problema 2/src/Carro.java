public class Carro extends Thread  {
    private String nome;
    private Ponte ponte;
    private String direcao;

    public Carro(String nome, Ponte ponte, String direcao) {
        this.nome = nome;
        this.ponte = ponte;
        this.direcao = direcao;
    }

    @Override
    public void run() {
        System.out.println(nome + " " + "Inicializando uma Thread");
        try {
            ponte.passsar_na_ponte(nome, direcao);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}