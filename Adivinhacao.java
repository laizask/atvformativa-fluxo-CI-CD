import java.util.Scanner;
public class Adivinhacao {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao jogo de Adivinhação! O objetivo é adivinhar o número escolhido pelo computador.");

    int numeroMaximo = 30;
    int numeroMinimo = 1;
    int numeroSecreto = numeroMinimo + (int)(Math.random() * (numeroMaximo - numeroMinimo + 1));
    int numeroTentativas = 0;

    Scanner scanner = new Scanner(System.in);
    int numeroJogador = 0;

    while (numeroJogador != numeroSecreto) {
    System.out.println("Digite um número de 1 a 30:");
    numeroJogador = scanner.nextInt();
    numeroTentativas++;

        if (numeroJogador < numeroSecreto) {
            System.out.println("Tente um número maior!");
        }
        else if(numeroJogador > numeroSecreto){
            System.out.println("Tente um número menor!");
        }
    }
    System.out.println("Acertou o número em "+ numeroTentativas + " tentativas!");
    scanner.close();
        }
    }


