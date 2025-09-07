import java.util.random.RandomGenerator;

public class Adivinhacao {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao jogo de Adivinhação! O objetivo é adivinhar o número escolhido pelo computador.");

    int numeroMaximo = 30;
    int numeroMinimo = 1;
    int numeroSecreto = numeroMinimo + (int)(Math.random() * (numeroMaximo - numeroMinimo + 1));
}
}
