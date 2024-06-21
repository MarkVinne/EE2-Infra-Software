public class Main {
    public static void main(String[] args) {
        Transacao cliente1 = new Transacao(1, "Sacar", 20);
        Transacao cliente2 = new Transacao(2, "Depositar", 30);
        Transacao cliente3 = new Transacao(3, "Depositar", 50);
        Transacao cliente4 = new Transacao(4, "Sacar", 100);
        Transacao cliente5 = new Transacao(5, "Sacar", 80);
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
    }
}