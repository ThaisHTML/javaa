
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse programa faz o cadrastro dos clientes de uma loja");
        System.out.println("CADRASTRE 5 CLIENTES POR VEZ");

        Scanner scanner = new Scanner(System.in);
        // Loop para cadastrar 5 clientes; vai aparecer 5 vezes esse trecho na tela
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade do cliente: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o email do cliente: ");
            String email = scanner.next();

            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Email: " + email);

            System.out.println("Esse programa faz o cadastro dos CPFs dos clientes");
            System.out.print("Digite o CPF do cliente: ");
            String cpf = scanner.next();
            System.out.println("CPF: " + cpf);
            if(cpf.length() != 11) {
                System.out.println("CPF inválido. Deve conter 11 dígitos.");
            } else {
                System.out.println("CPF válido.");
            }
        }
        

        scanner.close();
    }
}   