import java.util.Scanner;

public class Mae{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Como é o seu nome, mãe linda? ");
        String nome = sc.nextLine();

        System.out.println("Mãe " + nome + ", você sabia que dia é hoje? ");
        String sabia = sc.nextLine();

        System.out.println("Você está feliz pelo dia de hoje? ");
        String feliz = sc.nextLine();

        System.out.println("O que mais te alegra nesse dia de hoje? ");
        String alegria = sc.nextLine();

        System.out.println();
        System.out.println("Mensagem para minha mãe:");
        System.out.println("Mãe " + nome + ", eu te amo!");
        System.out.println("Hoje seja um excelente dia para você! ❤️");
        System.out.println("Que bom que você respondeu sobre o dia de hoje: " + sabia + ".");
        System.out.println("Você disse que está: " + feliz + ".");
        System.out.println("E o que te alegra hoje é: " + alegria + ".");

        
    }
}