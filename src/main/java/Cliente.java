import lombok.Getter;

import java.util.Scanner;

@Getter
public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;


    Endereco endereco = new Endereco();
    Scanner sc = new Scanner(System.in);

    void informacaoCliente(){
        System.out.print("Nome: " + this.nome);

        System.out.print("\nCpf: " + this.cpf);

        System.out.print("\nTelefone: " + this.telefone);

    }

    void cadastroCliente(){
        System.out.print("Por favor, clique na tecla ENTER");

        sc.nextLine();
        System.out.print("\nNome: ");
        this.nome = sc.nextLine();
        System.out.print("\nCpf: ");
        this.cpf = sc.nextLine();
        System.out.print("\nTelefone: ");
        this.telefone = sc.nextLine();

    }


}
