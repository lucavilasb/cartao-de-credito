import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        cartaodecredito c = new cartaodecredito();
        c.numero = 1;
        c.nomeTitular = "Luca";
        c.cpf = "123.456.789-10";
        c.limite = 100;
        Scanner sc = new Scanner(System.in);
        
        int opcao;

        do {
            System.out.println("1 - Consultar Limite;");
            System.out.println("2 - Consultar Fatura;");
            System.out.println("3 - Realizar Compra.");
            System.out.println("0 - Sair.");
        
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu limite é de: " + c.consultarLimite() + " reais.");
                    break;
                case 2:
                    System.out.println("Sua fatura está em: " + c.consultarTotalFatura() + " reais.");
                    break;
                case 3:
                    System.out.println("Digite o valor da compra: ");
                    double valor = sc.nextDouble();
                    c.realizarCompra(valor);
                    break;
                case 0:
                    System.out.println("Obrigado pela preferência, volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }   
        while (opcao != 0);
    sc.close(); 
    }
}
