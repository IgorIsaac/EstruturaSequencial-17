import java.util.Scanner;

public class LojaDeTintas {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o tamanho da área a ser pintada em metros quadrados
        System.out.print("Digite o tamanho da área a ser pintada (em metros quadrados): ");
        double area = scanner.nextDouble(); // Lê o tamanho da área digitado pelo usuário

        // Cálculos
        double litrosNecessarios = area / 6 * 1.1; // Calcula a quantidade de litros de tinta necessários, com 10% de folga
        int latas18L = (int) Math.ceil(litrosNecessarios / 18); // Calcula a quantidade de latas de 18 litros de tinta necessárias, arredondando para cima
        int galoes36L = (int) Math.ceil(litrosNecessarios / 3.6); // Calcula a quantidade de galões de 3,6 litros de tinta necessários, arredondando para cima
        double precoLatas18L = latas18L * 80; // Calcula o preço total das latas de 18 litros
        double precoGaloes36L = galoes36L * 25; // Calcula o preço total dos galões de 3,6 litros
        int misturarLatasGaloes = (int) Math.ceil(litrosNecessarios / 18); // Calcula a quantidade de latas de 18 litros de tinta necessárias para misturar com galões, arredondando para cima
        int misturarGaloes = (int) Math.ceil((litrosNecessarios - misturarLatasGaloes * 18) / 3.6); // Calcula a quantidade de galões de 3,6 litros de tinta necessários para misturar, arredondando para cima
        double precoMisturar = misturarLatasGaloes * 80 + misturarGaloes * 25; // Calcula o preço total para misturar latas e galões

        // Exibir os resultados
        System.out.println("Quantidade de latas de 18 litros: " + latas18L);
        System.out.println("Preço total com latas de 18 litros: R$ " + precoLatas18L);
        System.out.println("Quantidade de galões de 3,6 litros: " + galoes36L);
        System.out.println("Preço total com galões de 3,6 litros: R$ " + precoGaloes36L);
        System.out.println("Quantidade de latas de 18 litros para misturar: " + misturarLatasGaloes);
        System.out.println("Quantidade de galões de 3,6 litros para misturar: " + misturarGaloes);
        System.out.println("Preço total para misturar latas e galões: R$ " + precoMisturar);

        // Fechar o objeto Scanner
        scanner.close();
    }
}
