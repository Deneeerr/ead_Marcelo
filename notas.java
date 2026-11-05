
import java.util.Scanner;

public class notas {

    public static void main(String[] args) {

        Scanner TAM = new Scanner(System.in);

        // Solicita a quantidade de notas
        System.out.print("Quantas notas deseja inserir? ");
        int quantidade = TAM.nextInt();

        // Cria um vetor para armazenar as notas
        double[] notas = new double[quantidade];

        // Recebe as notas informadas pelo usuário
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = TAM.nextDouble();
        }

        // Selection Sort: ordena as notas em ordem crescente
        for (int i = 0; i < notas.length - 1; i++) {

            // Considera a posição atual como a menor nota
            int menor = i;

            // Procura a menor nota na parte ainda não ordenada
            for (int j = i + 1; j < notas.length; j++) {

                if (notas[j] < notas[menor]) {
                    menor = j;
                }
            }

            // Troca a menor nota encontrada com a posição atual
            double temp = notas[i];
            notas[i] = notas[menor];
            notas[menor] = temp;
        }

        // Exibe as notas ordenadas
        System.out.println("\nNotas em ordem crescente:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        TAM.close();
    }
}
