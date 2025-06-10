import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Draft {
    static Scanner scan = new Scanner(System.in);

    public static void e1() {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(int i = 0; i < 5; ++i) {
            System.out.printf("Valor posição %d: ", i + 1);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.println("Vetor B:");

        for(int var4 = 0; var4 < 5; ++var4) {
            System.out.println(vetorB[var4]);
        }

    }

    public static void e2() {
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        for(int i = 0; i < 8; ++i) {
            System.out.printf("Valor posição %d: ", i + 1);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("Vetor B:");

        for(int var4 = 0; var4 < 8; ++var4) {
            System.out.printf("%d x 2 = %d\n", vetorA[var4], vetorB[var4]);
        }

    }

    public static void e3() {
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for(int i = 0; i < 15; ++i) {
            System.out.printf("Valor posição %d: ", i + 1);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.println("Vetor B:");

        for(int var4 = 0; var4 < 15; ++var4) {
            System.out.printf("%d² = %d\n", vetorA[var4], vetorB[var4]);
        }

    }

    public static void e4() {
        double[] vetorA = new double[15];
        double[] vetorB = new double[15];

        for(int i = 0; i < 15; ++i) {
            System.out.printf("Valor posição %d: ", i + 1);
            vetorA[i] = scan.nextDouble();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.println("Vetor B:");

        for(int var4 = 0; var4 < 15; ++var4) {
            System.out.printf("raiz de %.2f = %.2f\n", vetorA[var4], vetorB[var4]);
        }

    }

    public static void e5() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        System.out.println("Vetor A:");

        for(int i = 0; i < 10; ++i) {
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * (i + 1);
        }

        System.out.println();

        for(int var4 = 0; var4 < 10; ++var4) {
            System.out.printf("%d x posicao %d = %d\n", vetorA[var4], var4 + 1, vetorB[var4]);
        }

    }

    public static void e6() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        System.out.println("Vetor A:");

        for(int i = 0; i < 10; ++i) {
            vetorA[i] = scan.nextInt();
        }

        System.out.println("Vetor B:");

        for(int var5 = 0; var5 < 10; ++var5) {
            vetorB[var5] = scan.nextInt();
            vetorC[var5] = vetorA[var5] + vetorB[var5];
        }

        System.out.println("\nVetor C:");

        for(int var6 = 0; var6 < 10; ++var6) {
            System.out.printf("%d + %d = %d\n", vetorA[var6], vetorB[var6], vetorC[var6]);
        }

    }

    public static void e7() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        System.out.println("Vetor A:");

        for(int i = 0; i < 10; ++i) {
            vetorA[i] = scan.nextInt();
        }

        System.out.println("Vetor B:");

        for(int var5 = 0; var5 < 10; ++var5) {
            vetorB[var5] = scan.nextInt();
            vetorC[var5] = vetorA[var5] - vetorB[var5];
        }

        System.out.println("\nVetor C:");

        for(int var6 = 0; var6 < 10; ++var6) {
            System.out.printf("%d - %d = %d\n", vetorA[var6], vetorB[var6], vetorC[var6]);
        }

    }

    public static void e8() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        System.out.println("Vetor A:");

        for(int i = 0; i < 10; ++i) {
            vetorA[i] = scan.nextInt();
        }

        System.out.println("Vetor B:");

        for(int var5 = 0; var5 < 10; ++var5) {
            vetorB[var5] = scan.nextInt();
            vetorC[var5] = vetorA[var5] * vetorB[var5];
        }

        System.out.println("\nVetor C:");

        for(int var6 = 0; var6 < 10; ++var6) {
            System.out.printf("%d x %d = %d\n", vetorA[var6], vetorB[var6], vetorC[var6]);
        }

    }

    public static void e9() {
        double[] vetorA = new double[10];
        double[] vetorB = new double[10];
        double[] vetorC = new double[10];
        System.out.println("Vetor A:");

        for(int i = 0; i < 10; ++i) {
            vetorA[i] = (double)scan.nextInt();
        }

        System.out.println("Vetor B:");

        for(int var5 = 0; var5 < 10; ++var5) {
            vetorB[var5] = (double)scan.nextInt();
            vetorC[var5] = vetorA[var5] / vetorB[var5];
        }

        System.out.println("\nVetor C:");

        for(int var6 = 0; var6 < 10; ++var6) {
            System.out.printf("%.2f ÷ %.2f = %.2f\n", vetorA[var6], vetorB[var6], vetorC[var6]);
        }

    }

    public static void e10() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        System.out.println("Vetor A:");

        for(int i = 0; i < 10; ++i) {
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] % 2;
        }

        System.out.println("\nVetor B:");

        for(int var4 = 0; var4 < 10; ++var4) {
            System.out.println(vetorB[var4]);
        }

    }

    public static void e11() {
        int[] vetorA = new int[10];
        int pares = 0;
        System.out.println("Defina os 10 valores do vetor:");

        for(int i = 0; i < 10; ++i) {
            vetorA[i] = scan.nextInt();
        }

        System.out.println("Pares do vetor:");

        for(int var4 = 0; var4 < 10; ++var4) {
            if (vetorA[var4] % 2 == 0) {
                ++pares;
                System.out.println(vetorA[var4]);
            }
        }

        System.out.println("\nQuantidade de números pares inseridos: " + pares);
    }

    public static void e12() {
        int[] vetorA = new int[10];
        int soma = 0;
        System.out.println("Defina os valores do vetor:");

        for(int i = 0; i < 10; ++i) {
            vetorA[i] = scan.nextInt();
            soma += vetorA[i];
        }

        System.out.println("\nSoma dos elementos do vetor: " + soma);
    }

    public static void e25() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for(int i = 0; i < 10; ++i) {
            vetorA[i] = scan.nextInt();
        }

        System.out.println("\nvetor A:");

        for(int var4 = 0; var4 < 10; ++var4) {
            System.out.print(vetorA[var4] + " ");
            if (vetorA[var4] % 2 == 0) {
                vetorB[var4] = 1;
            }

            if (vetorA[var4] % 2 == 1) {
                vetorB[var4] = 0;
            }
        }

        System.out.println("\nvetor B:");

        for(int var5 = 0; var5 < 10; ++var5) {
            System.out.print(vetorB[var5] + " ");
        }

    }

    public static void e27() {
        int[] vetorA = new int[10];
        char[] vetorB = new char[10];
        System.out.println("vetor A:");

        for(int i = 0; i < 10; ++i) {
            vetorA[i] = scan.nextInt();
            if (vetorA[i] < 7) {
                vetorB[i] = 'a';
            }

            if (vetorA[i] == 7) {
                vetorB[i] = 'b';
            }

            if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            }

            if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            }

            if (vetorA[i] > 10) {
                vetorB[i] = 'e';
            }
        }

        System.out.println("\nvetor B:");

        for(int var4 = 0; var4 < 10; ++var4) {
            System.out.print(vetorB[var4] + " ");
        }

    }

    public static void e28() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        System.out.println("vetor A:");

        for(int i = 0; i < 10; ++i) {
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.println();

        for(int var4 = 9; var4 >= 0; --var4) {
            System.out.print(vetorB[var4] + " ");
        }

    }

    public static void identidade() {
        while (true) {
            int i, j;
            int matrizA[][] = new int[4][4];
            // int matrizB[][] = new int[3][3];
            boolean identidade = true;

            System.out.println("matriz A:");
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    matrizA[i][j] = scan.nextInt();
                    if ((i == j && matrizA[i][j] != 1) || (i != j && matrizA[i][j] != 0)) {
                        identidade = false;
                    }
                }
            }
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    System.out.print(matrizA[i][j] + " ");
                }
                System.out.println();
            }
            if (identidade) {
                System.out.println("identidade");
            } else {
                System.out.println("não identidade");
            }
        }
    }

    public static void diagonal() {
        int matriz[][] = new int[3][3];
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("matriz:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("diagonal:");
        for (i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }

    public static void somadiagonal(){
        int matriz[][] = new int[3][3];
        int i, j, soma=0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matriz[i][j] = scan.nextInt();
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nsoma da diagonal principal: " + soma);
    }

    public static void posicoes(){
        int matriz[][] = new int[3][3];
        int linha[] = new int[9], coluna[] = new int[9];
        int i, j, num, cont = 0;

        num = scan.nextInt();
        System.out.println("matriz:");
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                matriz[i][j] = scan.nextInt();
                if (matriz[i][j] < num){
                    linha[cont] = i+1;
                    coluna[cont] = j+1;
                    cont++;
                }
            }
        }
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (i=0; i<cont; i++){
            System.out.printf("linha %d coluna %d\n", linha[i], coluna[i]);
        }
    }

    public static void xadrez(){
        int i, j;

        int num = scan.nextInt();
        for (i=0; i<num; i++){
            for (j=0; j<num; j++){
                if ((i+j)%2==0){
                    System.out.print("⬛");
                }
                else {
                    System.out.print("⬜");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void multiplicarlinha(){
        int i, j, matriz[][] = new int[3][3];

        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nescolha a linha para multiplicar:");
        int linha = scan.nextInt();
        System.out.println("\nagora o número:");
        int num = scan.nextInt();
        for (j=0; j<3; j++){
            matriz[linha][j]*=num;
        }
        System.out.println();
        for (j=0; j<3; j++){
            System.out.print(matriz[linha][j] + " ");
        }
    }

    public static void diagonais(){
        int matriz[][] = new int[3][3];
        int i, j;

        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("diagonal principal:");
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                if (i == j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("diagonal secundaria:");
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                if (i + j == 3 - 1){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    public static void prova(){
        int i, j;
        int matriz[][] = new int[3][3], vetor[] = new int[3], somalinha2=0, somacoluna1=0;

        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                matriz[i][j] = scan.nextInt();
            }
        }
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                if (i == j){
                    vetor[i] = matriz[i][j];
                }
            }
        }
        for (i=0; i<3; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        for (j=0; j<3; j++){
            somalinha2+=matriz[1][j];
        }
        for (i=0; i<3; i++){
            somacoluna1+=matriz[i][0];
        }
        System.out.println(somalinha2);
        System.out.println(somacoluna1);
    }

    public static void str (){
        Random random = new Random();
        int randomNum = random.nextInt(101);
        int tentativas = 0;

        System.out.print("Digite o nome do jogador: ");
        String jogador = scan.nextLine();
        System.out.println(jogador + ", adivinhe o número aleatório entre 0 e 100!");
        do {
            int num = scan.nextInt();
            scan.nextLine();
            int dif = Math.abs(num - randomNum); //diferença porém o valor absoluto, sem negativo ou positivo
            if (num < randomNum) {
                if (dif >= 40) {
                    System.out.println("vish...beeem maior!");
                    tentativas++;
                }
                if (dif >= 15 && dif < 40) {
                    System.out.println("maior! tá longe ainda...");
                    tentativas++;
                }
                if (dif >= 5 && dif < 15) {
                    System.out.println("é maior, mas tá perto...");
                    tentativas++;
                }
                if (dif >= 1 && dif < 5) {
                    System.out.println("um pouco maior! tá quase...");
                    tentativas++;
                }
            }
            if (num > randomNum) {
                if (dif >= 40) {
                    System.out.println("vish...beeem menor!");
                    tentativas++;
                }
                if (dif >= 15 && dif < 40) {
                    System.out.println("menor! tá longe ainda...");
                    tentativas++;
                }
                if (dif >= 5 && dif < 15) {
                    System.out.println("é menor, mas tá perto...");
                    tentativas++;
                }
                if (dif >= 1 && dif < 5) {
                    System.out.println("um pouco menor! tá quase...");
                    tentativas++;
                }
            }
            if (num == randomNum) {
                tentativas++;
                System.out.println("Você acertou! Total de tentativas: " + tentativas);
                return;
            }
        }
        while (tentativas <= 6);
        System.out.println("Limite de tentativas atingido! Sua pontuação: 0");
    }

    public static void listas(){
        List<String> arrayTextos = new ArrayList<String>();
        arrayTextos.add("bernardo");
        System.out.println(arrayTextos);
        }
    public static void main(String[] args) {
        listas();
    }
}
