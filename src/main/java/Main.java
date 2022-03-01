public class Main {

    public static void main(String[] args) {
        Cliente pessoa1= new Cliente();
        pessoa1.cadastroCliente();
        Conta cc = new ContaCorrente(pessoa1);
        cc.extratoConta();

        Cliente pessoa2= new Cliente();
        pessoa2.cadastroCliente();
        Conta cc2 = new ContaCorrente(pessoa2);
        cc2.depositar(100);
        cc2.extratoConta();
    }
}

