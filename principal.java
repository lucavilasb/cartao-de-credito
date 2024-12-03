import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CartaoDeCredito c = new CartaoDeCredito(123, "Eliane", "12312352636");
        c.setCpf("12312352636");
        c.setLimite(100);
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        do {
            System.out.println("1 - Consultar Limite");
            System.out.println("2 - Consultar Fatura");
            System.out.println("3 - Realizar compra");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            
            switch (opcao) {
                case 1:
                    System.out.println(c.consultarLimite());
                    break;
                case 2:
                    System.out.println(c.consultarTotalFatura());
                    break;
                case 3:
                    System.out.println("Digite o valor da compra");
                    double valor = sc.nextDouble();
                    c.realizarCompra(valor);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);
    }
}
