public class Transacao extends Thread {
    int n_thread;
    String comando;
    double valor;

    public Transacao(int n_thread, String comando, double valor) {
        this.n_thread = n_thread;
        this.comando = comando;
        this.valor = valor;
    }

    public void run(){
        System.out.println("Começando Thread" + n_thread);
        if (comando.equals("Sacar")) {
            Banco.sacar(n_thread, valor);
        }
        else if (comando.equals("Depositar")) {
            Banco.depositar(n_thread, valor);
        }
        else {
            System.out.println(n_thread + "solicitou "+ comando + ", que é desconhecido");
        }

    }
}