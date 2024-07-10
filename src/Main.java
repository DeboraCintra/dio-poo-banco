public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.depositar(100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.transferir(50,poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.sacar(25);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}