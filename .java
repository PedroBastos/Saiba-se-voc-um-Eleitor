import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a sua idade para o sistema identificar se você é um Eleitor.");
        Scanner ler = new Scanner(System.in);
        int idade = ler.nextInt();

                if (idade >= 16) {
                    System.out.println("Você é um eleitor.");
                }
                else  {
                    System.out.println("Você não é um eleitor");
        }
    }
}
