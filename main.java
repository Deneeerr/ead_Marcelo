import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Criação da fila de pedidos.
        // Queue representa a estrutura de dados Fila.
        // LinkedList será utilizada para armazenar os pedidos.
        Queue<String> pedidos = new LinkedList<>();

        int opcao;

        // O menu será repetido enquanto o usuário não escolher a opção 4.
        do {

            System.out.println("\n===== SISTEMA DE PEDIDOS =====");
            System.out.println("1 - Adicionar pedido");
            System.out.println("2 - Processar pedido");
            System.out.println("3 - Visualizar pedidos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = s.nextInt();

            // Limpa o ENTER que ficou no Scanner depois do nextInt().
            s.nextLine();

            switch (opcao) {

                case 1:

                    // Solicita ao usuário qual pedido deseja adicionar.
                    System.out.print("Digite o pedido: ");
                    String pedido = s.nextLine();

                    // ENQUEUE:
                    // Adiciona o pedido no final da fila.
                    // O primeiro pedido inserido será o primeiro a ser processado.
                    pedidos.add(pedido);

                    System.out.println("Pedido adicionado com sucesso!");

                    break;

                case 2:

                    // Verifica se existem pedidos na fila antes de tentar remover.
                    if (pedidos.isEmpty()) {

                        System.out.println("Não existem pedidos para processar.");

                    } else {

                        // DEQUEUE:
                        // poll() remove o primeiro elemento da fila.
                        // Dessa forma, o pedido mais antigo é processado primeiro.
                        String pedidoProcessado = pedidos.poll();

                        System.out.println(
                            "Pedido processado: " + pedidoProcessado
                        );
                    }

                    break;

                case 3:

                    // Verifica se a fila está vazia antes de exibir os pedidos.
                    if (pedidos.isEmpty()) {

                        System.out.println("A fila está vazia.");

                    } else {

                        System.out.println("\n===== PEDIDOS NA FILA =====");

                        int contador = 1;

                        // Percorre todos os elementos da fila
                        // sem removê-los.
                        for (String p : pedidos) {

                            System.out.println(contador + " - " + p);

                            contador++;
                        }
                    }

                    break;

                case 4:

                    // Encerra o programa.
                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    // Caso o usuário digite uma opção que não existe.
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        // Fecha o Scanner no final do programa.
        s.close();
    }
}