import java.util.Scanner;

public class SistemaDeVendas {
    static Scanner scan;
    static float totalarrecadado;
    static int quantidadetotal;
    static int numerovendas;
    static int quantidadeprodutoscad;
    static int[] codigoproduto;
    static String[] nomeproduto;
    static float[] valorproduto;
    static int[] estoque;

    public SistemaDeVendas() {
    }

    public static void menuprincipal() {
        while(true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Registrar venda");
            System.out.println("3. Exibir relatório");
            System.out.println("4. Sair");
            int opcao = scan.nextInt();
            if (opcao == 1) {
                cadastrarproduto();
            } else if (opcao == 2) {
                registrarvenda();
            } else if (opcao == 3) {
                relatorio();
            } else {
                if (opcao == 4) {
                    System.out.println("Saindo...");
                    return;
                }

                System.out.println("Essa opção não faz parte do menu!");
            }
        }
    }

    public static void cadastrarproduto() {
        while(quantidadeprodutoscad < 50) {
            System.out.print("Digite o código do produto: ");
            codigoproduto[quantidadeprodutoscad] = scan.nextInt();
            scan.nextLine();
            System.out.print("Qual o nome do produto? ");
            nomeproduto[quantidadeprodutoscad] = scan.nextLine();
            System.out.print("Digite o valor do produto: ");
            valorproduto[quantidadeprodutoscad] = scan.nextFloat();
            System.out.print("Qual o estoque disponível para esse produto: ");
            estoque[quantidadeprodutoscad] = scan.nextInt();
            ++quantidadeprodutoscad;
            System.out.println("Produto cadastrado com sucesso! Cadastrar um novo produto?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            int opcao = scan.nextInt();
            if (opcao == 2) {
                System.out.println();
                return;
            }
        }

        System.out.println("Limite de produtos atingido!");
    }

    public static void registrarvenda() {
        if (quantidadeprodutoscad == 0) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            while(true) {
                boolean produtoencontrado = false;
                System.out.print("Digite o código do produto para registrar a venda: ");
                int produtoexiste = scan.nextInt();

                for(int i = 0; i < quantidadeprodutoscad; ++i) {
                    if (codigoproduto[i] == produtoexiste) {
                        produtoencontrado = true;
                        System.out.print("Qual a quantidade vendida? ");
                        int quantidadevendida = scan.nextInt();
                        if (quantidadevendida <= estoque[i]){
                            quantidadetotal += quantidadevendida;
                            float valorvenda = valorproduto[i] * (float)quantidadevendida;
                            System.out.printf("Venda registrada! Valor total da venda: R$ %.2f", valorvenda);
                            totalarrecadado += valorvenda;
                            ++numerovendas;
                            System.out.println("\nDeseja registrar uma nova venda?");
                            System.out.println("1. Sim");
                            System.out.println("2. Não");
                            int opcao = scan.nextInt();
                            if (opcao == 2) {
                                return;
                            }
                        }
                    }
                }

                if (!produtoencontrado) {
                    System.out.println("Esse produto não está cadastrado!");
                }
            }
        }
    }

    public static void relatorio() {
        System.out.println("--------------------");
        System.out.println("RELATÓRIO DE VENDAS:");
        System.out.println("--------------------");
        System.out.println("Total arrecadado: " + totalarrecadado);
        System.out.println("Número de vendas realizadas: " + numerovendas);
        System.out.println("Quantidade total de produtos vendidos: " + quantidadetotal);
    }

    public static void main(String[] args) {
        menuprincipal();
    }
}
