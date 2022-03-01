import lombok.Getter;

import java.util.Scanner;

@Getter
public class Endereco {
    private String logradouro;
    private String cep;
    private int numero;

    Scanner sc = new Scanner(System.in);
    void cadastroEndereco(){
        System.out.println("Vamos cadastrar o endereço, por favor clique na tecla ENTER");

        sc.nextLine();
        System.out.print("\nCep: ");
        this.cep = sc.nextLine();
        System.out.print("\nLogradouro: ");
        this.logradouro = sc.nextLine();
        System.out.print("\nNumero: ");
        this.numero = sc.nextInt();

    }
}
