import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          double area, litros, latas;
          final double litros_metros_quadrados = 1.0 / 3.0;
          final double preco_lata = 80.0;

          System.out.print("Digite o tamanho da área a ser pintada (em metros quadrados): ");
          area = scanner.nextDouble();

          litros = area * litros_metros_quadrados;
          latas = Math.ceil(litros / 18);
          double precoTotal = latas * preco_lata;

          System.out.printf("Você precisará de %5.0f latas de tinta, ao preço de R$ %.2f", latas, precoTotal);
        }
    }
}
