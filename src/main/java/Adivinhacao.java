import java.util.Scanner;

class Adivinhacao {

    private int numeroSecreto;

    public void setNumeroSecreto(int numero) {
        this.numeroSecreto = numero;
    }

    public Adivinhacao(int minimo, int maximo){
        this.numeroSecreto = minimo + (int)(Math.random() * (maximo - minimo + 1));
    }

    public String tentar(int palpite) {
        if (palpite < numeroSecreto) {
            return "maior";
        } else if (palpite > numeroSecreto) {
            return "menor";
        } else {
            return "acertou";
        }
    }

    public int getNumeroSecreto(){
        return numeroSecreto;
    }
}

class jogoAdivinhacao{
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao jogo de Adivinhação! O objetivo é adivinhar o número escolhido pelo computador.");

        Adivinhacao jogo = new Adivinhacao(1, 30);
        Scanner scanner = new Scanner(System.in);
        int numeroTentativas = 0;
        String resultado = "";

        while (!resultado.equals("acertou")) {
            System.out.println("Digite um número de 1 a 30:");
            int palpite = scanner.nextInt();
            numeroTentativas++;
            resultado = jogo.tentar(palpite);

            if (resultado.equals("maior")) {
                System.out.println("Tente um número maior!");
            } else if(resultado.equals("menor")){
                System.out.println("Tente um número menor!");
            }
        }
        System.out.println("Acertou o número em "+ numeroTentativas + " tentativas!");
        scanner.close();
    }
}

