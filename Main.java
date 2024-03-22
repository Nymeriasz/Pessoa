package Pessoa;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*Pessoa p1 = new Pessoa();
        Pessoa novo = new Pessoa();

        p1.nome = "Gabriel";
        p1.idade = 19;

        novo.nome = "Pâmella";
        novo.idade = 20;

        System.out.println("Nome: "+p1.nome+", Idade: "+p1.idade);
        System.out.println("Nome: "+novo.nome+", Idade: "+novo.idade);

         */
       Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digíte seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digíte sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Nome: "+nome+", Idade: "+idade);
    }
    
}
