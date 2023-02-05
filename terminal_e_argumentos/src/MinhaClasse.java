import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {

    // Primeiro teste
    // public static void main(String[] args) {
    //     System.out.println("Ola usuario, fui executado pelo terminal :)");
    // }

    // Segundo teste
    // public static void main(String[] args) {
    //     String nome = args [0];
    //     String sobrenome = args [1];
    //     int idade = Integer.valueOf(args[2]);
    //     Double altura = Double.valueOf(args[3]);

    //     System.out.println("Ola me chamo " + nome + " " + sobrenome);
    //     System.out.println("Tenho " + idade + " anos ");
    //     System.out.println("Minha altura é " + altura + "cm ");
    // }
    
    // Terceiro teste
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Recebendo valores dos atributos
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();


        //Imprimindo os dados obtidos pelo usuário
        System.out.println("Ola me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        scanner.close();
    }
}