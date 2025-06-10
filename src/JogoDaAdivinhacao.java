import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static int randomNum = random.nextInt(101);
    static int quantJogadores;
    static String jogador[];
    static int dif[], num[], tentativas[];

    public static void jogar() {
        System.out.print("Qual a quantidade de jogares? ");
        quantJogadores = scan.nextInt();
        scan.nextLine();

        int i;
        tentativas = new int[quantJogadores];
        jogador = new String[quantJogadores];
        dif = new int[quantJogadores];
        num = new int[quantJogadores];

        for (i=0; i<quantJogadores; i++){
            System.out.printf("Digite o nome do jogador %d: ", i+1);
            jogador[i] = scan.nextLine();
        }
        iniciarRodada(); //chama o metodo, como uma espécie de "sub-metodo"
    }

    public static void iniciarRodada(){
        int i;
        for (i=0; i<1; i++){
            System.out.println(jogador[i] + ", adivinhe o número aleatório entre 0 e 100!");
                num[i] = scan.nextInt();
                scan.nextLine();
                dif[i] = Math.abs(num[i] - randomNum); //diferença porém o valor absoluto, sem negativo ou positivo
                if (num[i] < randomNum) {
                    if (dif[i] >= 40) {
                        System.out.println("vish...beeem maior!");
                        tentativas[i]++;
                    }
                    if (dif[i] >= 15 && dif[i] < 40) {
                        System.out.println("maior! tá longe ainda...");
                        tentativas[i]++;
                    }
                    if (dif[i] >= 5 && dif[i] < 15) {
                        System.out.println("é maior, mas tá perto...");
                        tentativas[i]++;
                    }
                    if (dif[i] >= 1 && dif[i] < 5) {
                        System.out.println("um pouco maior! tá quase...");
                        tentativas[i]++;
                    }
                }
                if (num[i] > randomNum) {
                    if (dif[i] >= 40) {
                        System.out.println("vish...beeem menor!");
                        tentativas[i]++;
                    }
                    if (dif[i] >= 15 && dif[i] < 40) {
                        System.out.println("menor! tá longe ainda...");
                        tentativas[i]++;
                    }
                    if (dif[i] >= 5 && dif[i] < 15) {
                        System.out.println("é menor, mas tá perto...");
                        tentativas[i]++;
                    }
                    if (dif[i] >= 1 && dif[i] < 5) {
                        System.out.println("um pouco menor! tá quase...");
                        tentativas[i]++;
                    }
                }
                if (num[i] == randomNum) {
                    tentativas[i]++;
                    System.out.println(jogador[i] + " acertou! Total de tentativas: " + tentativas[i]);
                }
            }
        }

    public static void ranking(){
        System.out.println("ranking");
    }
    public static void main (String[] args){
        System.out.println("----------MENU PRINCIPAL----------\nEscolha uma opção:\n[1] Jogar\n[2] Ver ranking\n[3] Sair");
        int opcao = scan.nextInt();
        scan.nextLine();
        switch (opcao){
            case 1:
                jogar();
                break;
            case 2:
                ranking();
                break;
            case 3:
                System.out.println("Saindo...");
                System.exit(0);
            default:
                System.out.println("Escolha uma opção válida!");
        }
    }
}