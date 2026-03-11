import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de ingressos inteiros: ");
        int quantidadeInteiros = scanner.nextInt();

        System.out.print("Digite a quantidade de ingressos meia-entrada: ");
        int quantidadeMeia = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite o valor do ingresso inteiro: ");
        String valorInteiroStr = scanner.nextLine();

        System.out.println("Digite o valor da meia-entrada: ");
        String valorMeiaStr = scanner.nextLine();

        valorInteiroStr = valorInteiroStr.replace(",", ".");
        valorMeiaStr = valorMeiaStr.replace(",", ".");

        double valorInteiro = Double.parseDouble(valorInteiroStr);
        double valorMeia = Double.parseDouble(valorMeiaStr);

        double totalInteiros = quantidadeInteiros * valorInteiro;
        double totalMeia = quantidadeMeia * valorMeia;
        double totalArrecadado = totalInteiros + totalMeia;

        int totalIngressos = quantidadeInteiros + quantidadeMeia;

        double mediaIngresso = totalArrecadado / totalIngressos;

        System.out.println("Total arrecadado com ingressos inteiros: R$ " + totalInteiros);
        System.out.println("Total arrecadado com meia-entrada: R$ " + totalMeia);
        System.out.println("Valor total arrecadado: R$ " + totalArrecadado);
        System.out.println("Valor médio pago por ingresso: R$ " + mediaIngresso);

        scanner.close();
    }
}


