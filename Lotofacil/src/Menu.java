import java.util.Scanner;
import java.util.Random;
import java.lang.Character;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        int numeroAposta;
        char letraAposta;

        do {
            System.out.println("*****************************");
            System.out.println("LOTOFÁCIL!!!");
            System.out.println("1) APOSTAR DE 0 A 100");
            System.out.println("2) APOSTAR DE A ATÉ Z");
            System.out.println("3) APOSTAR EM PAR OU ÍMPAR");
            System.out.println("0) SAIR :(");
            System.out.println("*****************************");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Digite um número de 0 a 100");
                    Random r = new Random();
                    int minimo = 0;
                    int maximo = 100;
                    int vencedorNumero = r.nextInt(maximo-minimo) +minimo;
                    numeroAposta = scanner.nextInt();
                    if (numeroAposta == vencedorNumero){
                        System.out.println("Jackpot! Você ganhou R$1000,00");
                    }
                    else {
                        System.out.println("Que pena! O número correto era: " +vencedorNumero);
                    }
                    break;
                case 2:
                    System.out.println("Digite uma letra de A até Z");
                    char letraVencedor = 'O';
                    letraAposta = scanner.next().charAt(0);
            }
        }
        while (escolha != 0);
    }

}
