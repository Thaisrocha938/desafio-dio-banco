import lombok.Getter;

@Getter
public abstract class Conta {
    protected final int AGENCIA = 0001;
    protected int NUMERO = 1;
    protected int numConta;
    protected double saldo;
    Cliente cliente= new Cliente();

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.numConta += NUMERO;
    }

    void extratoConta(){
        System.out.println("============= Informacoes pessoais ==============\n");
        this.cliente.informacaoCliente();
        System.out.println("\n\n============= Informacoes da Conta ==============\n\nAgencia: "+ this.AGENCIA);
        System.out.println("Conta: "+ getNumConta());
        System.out.println("Saldo: "+ getSaldo());
    }

    void depositar(double valor){
        this.saldo+=valor;

    }

    void sacar (double valor){
        this.saldo-=valor;
    }
    void transferir (double valor, Conta conta){
        this.sacar(valor);
        conta.depositar(valor);
    }

}
