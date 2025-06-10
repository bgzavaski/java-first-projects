import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> tarefas = new ArrayList<>(3);
    static int quantTarefas = 0;
    static boolean concluida[] = new boolean[3];

    public static void criarTarefa(){
        System.out.println("\n======== CRIAR TAREFA ========");
        while (true){
            if (quantTarefas >= 3){
                System.out.println("Sua lista está cheia! Exclua algumas para criar novas tarefas.");
                break;
            }
            System.out.print("Digite o nome da tarefa: ");
            tarefas.add(scan.nextLine());
            System.out.printf("Tarefa \"%s\" adicionada com sucesso! Digite [1] para adicionar outra ou qualquer tecla para retornar ao menu: ", tarefas.getLast());
            quantTarefas++;
            int opcao = scan.nextInt();
            scan.nextLine();
            if (opcao != 1){
                return;
            }
        }
    }
    public static void editarTarefa(){
        System.out.println("\n======== EDITAR TAREFA ========");
        while (true){
            if (quantTarefas == 0){
                System.out.println("Nenhuma tarefa foi criada!");
                break;
            }
            for (int i=0; i<quantTarefas; i++){
                System.out.printf("[%d] %s\n", i+1, tarefas.get(i));
            }
            System.out.print("\nDigite o número da tarefa a ser editada: ");
            int indice = scan.nextInt() -1;
            scan.nextLine();
            if (indice < 0 || indice > tarefas.size()){
                System.out.println("Índice inválido!");
                break;
            }
            System.out.print("Escreva o novo nome da tarefa: ");
            String novoNome = scan.nextLine();
            String nomeAntigo = tarefas.get(indice);
            tarefas.set(indice, novoNome);
            System.out.printf("\nTarefa \"%s\" alterada para \"%s\".", nomeAntigo, novoNome);
            return;
        }
    }
    public static void visualizarTarefas(){
        System.out.println("\n======= VISUALIZAR TAREFAS =======");
        while (true){
            if (quantTarefas == 0){
                System.out.println("Não há nenhuma tarefa criada!");
                break;
            }
            System.out.println("\n--- PENDENTES ---");
            for (int i=0; i<quantTarefas; i++){
                if (!concluida[i]){
                    System.out.printf("[%d] %s\n", i+1, tarefas.get(i));
                }
           }
            System.out.println("\n--- CONCLUÍDAS ---");
            for (int i=0; i<quantTarefas; i++){
                if (concluida[i]){
                    System.out.printf("[%d] %s\n", i+1, tarefas.get(i));
                }
            }
            System.out.print("\n[1] Marcar como concluída\n[2] Marcar como pendente\n[3] Retornar ao menu\n\nEscolha uma opção: ");
            int opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao){
                case 1:
                    System.out.print("Digite o número da tarefa para concluí-la: ");
                    int indiceConcluir = scan.nextInt() -1;
                    if (indiceConcluir < 0 || indiceConcluir > tarefas.size()){
                        System.out.println("\n**** Índice inválido! ****");
                        break;
                    }
                    if (concluida[indiceConcluir]){
                        System.out.println("\n**** Tarefa \"" + tarefas.get(indiceConcluir) + "\" já está concluída! ****");
                        break;
                    }
                    concluida[indiceConcluir] = true;
                    System.out.println("\n**** Tarefa \"" + tarefas.get(indiceConcluir) + "\" marcada como concluída! ****");
                    break;
                case 2:
                    System.out.print("\nDigite o número da tarefa para deixá-la pendente: ");
                    int indicePendente = scan.nextInt() -1;
                    if (indicePendente < 0 || indicePendente > tarefas.size()){
                        System.out.println("\n**** Índice inválido! ****");
                        break;
                    }
                    if (!concluida[indicePendente]){
                        System.out.println("\n**** Tarefa \"" + tarefas.get(indicePendente) + "\" já está pendente! ****");
                        break;
                    }
                    concluida[indicePendente] = false;
                    System.out.println("\n**** Tarefa \"" + tarefas.get(indicePendente) + "\" marcada como pendente! ****");
                    break;
                case 3:
                    System.out.println("\nRetornando ao menu...");
                    return;
                default:
                    System.out.println("\n**** Essa não é uma opção válida! ****");
                    break;
            }
        }

    }
    public static void excluirTarefa(){
        System.out.println("\n--- EXCLUIR TAREFAS ---");
        while (true){
            if (quantTarefas == 0){
                System.out.println("Não há nenhuma tarefa criada!");
                break;
            }
            for (int i=0; i<quantTarefas; i++){
                System.out.printf("[%d] %s\n", i+1, tarefas.get(i));
            }
            System.out.print("\nDigite o índice da tarefa a ser excluída: ");
            int indice = scan.nextInt() -1;
            if (indice < 0 || indice > tarefas.size()){
                System.out.println("**** Índice inválido! ****");
                break;
            }
            System.out.print("\nTarefa \"" + tarefas.get(indice) + "\" removida! Digite [1] para remover outra ou qualquer tecla para retornar ao menu: ");
            tarefas.remove(indice);
            quantTarefas--;
            int opcao = scan.nextInt();
            if (opcao != 1){
                break;
            }
        }

    }
    public static void main (String[] args){
        while (true){
            System.out.print("\n========= TO-DO LIST =========\n[1] Criar tarefa\n[2] Editar tarefa\n[3] Visualizar tarefas\n[4] Excluir tarefa\n[5] Sair\n==============================\nEscolha uma opção: ");
            int opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao){
                case 1:
                    criarTarefa();
                    break;
                case 2:
                    editarTarefa();
                    break;
                case 3:
                    visualizarTarefas();
                    break;
                case 4:
                    excluirTarefa();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Essa não é uma opção válida!");
            }
        }
    }
}
