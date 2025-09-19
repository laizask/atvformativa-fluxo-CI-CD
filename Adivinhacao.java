import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Jogo da Adivinhação!");
        System.out.println("Tente adivinhar o número secreto escolhido pelo computador. Boa sorte!\n");

        int numeroMinimo = 1;
        int numeroMaximo = 30;
        int numeroSecreto = numeroMinimo + (int)(Math.random() * (numeroMaximo - numeroMinimo + 1));
        int numeroTentativas = 0;

        Scanner scanner = new Scanner(System.in);
        int numeroJogador = 0;

        while (numeroJogador != numeroSecreto) {
            System.out.println("Digite um número de " + numeroMinimo + " a " + numeroMaximo + ":");
            numeroJogador = scanner.nextInt();
            numeroTentativas++;

            if (numeroJogador < numeroSecreto) {
                System.out.println("Tente um número maior!");
            } else if (numeroJogador > numeroSecreto) {
                System.out.println("Tente um número menor!");
            }

            if (numeroTentativas > 5 && numeroJogador != numeroSecreto) {
                System.out.println("Ainda não acertou? Continue tentando!");
            }
        }

        System.out.println("\nParabéns! Você acertou o número " + numeroSecreto +
                " em " + numeroTentativas + " tentativas!");
        System.out.println("Obrigado por jogar! Até a próxima!");

        scanner.close();
    }
}
