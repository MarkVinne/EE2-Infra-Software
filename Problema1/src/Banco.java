public class Banco {
    static double saldo = 100;

    static synchronized void sacar(int n_thread, double valor){
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Cliente " + n_thread + " sacou " + valor + '\n' + "Saldo Restante:" + saldo + '\n');
        }
        else {
            System.out.println("Cliente " + n_thread + " não sacou por saldo insuficiente" + '\n' + "Saldo Restante:" + saldo + '\n');
        }
    }

    static synchronized void depositar(int n_thread, double valor){
        saldo += valor;
        System.out.println("Cliente " + n_thread + " depositou " + valor + '\n' + "Saldo Restante:" + saldo + '\n');
    }
}