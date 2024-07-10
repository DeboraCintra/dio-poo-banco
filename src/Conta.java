public abstract class Conta implements  IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    /*ATRIBUTOS*/
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        agencia = Conta.AGENCIA_PADRAO;
        numero  = SEQUENCIAL++;
    }

    /*IMPLEMENTAÇÃO DOS METODOS*/
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    //    /*METODOS*/
    //    public void sacar(){}
    //    public void depositar(){}
    //    public void transferir(){}

    /*METODOS GET*/
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void ImprimirInfoComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d",this.numero));
        System.out.println(String.format("Saldo: %2f",this.saldo));
    }
}
