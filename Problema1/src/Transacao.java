public class Transacao extends Thread {
    int n_thread;
    String comando;
    double valor;
    Banco conta;

    public Transacao(int n_thread, String comando, double valor, Banco conta) {
        this.n_thread = n_thread;
        this.comando = comando;
        this.valor = valor;
        this.conta = conta;
    }

    public void run(){
        System.out.println("Começando Thread" + n_thread);
        if (comando.equals("Sacar")) {
            conta.sacar(n_thread, valor);
        }
        else if (comando.equals("Depositar")) {
            conta.depositar(n_thread, valor);
        }
        else {
            System.out.println(n_thread + "solicitou "+ comando + ", que é desconhecido");
        }

    }
}