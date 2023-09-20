import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.lang.Character;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        int numeroAposta;

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
                    boolean letraValida = false;
                    char letraVencedora = 'O';
                    System.out.println("Digite uma letra de A até Z");
                    char letraAposta = (char) System.in.read();
                    while (!letraValida) {
                        if (Character.isLetter(letraAposta)){
                            letraValida = true;
                        } else {
                            System.out.println("Aposta inválida, tente novamente com uma letra de A até Z");
                            letraAposta = (char) System.in.read();
                        }

                    }
                    letraAposta = Character.toUpperCase(letraAposta);
                    if (letraAposta == letraVencedora){
                        System.out.println("Jackpot! Você ganhou R$500,00");
                    } else {
                        System.out.println("Que pena! Você perdeu, a letra sorteada foi: " +letraVencedora);
                    }
                case 3:
                    int apostaParImpar;
                    System.out.println("Insira um número ímpar ou par");
                    apostaParImpar = scanner.nextInt();
                    if (apostaParImpar % 2 == 0){
                        System.out.println("Jackpot! Você ganhou R$100,00");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares");
                    }


            }
        }
        while (escolha != 0);
    }

}
