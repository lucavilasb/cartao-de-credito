import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        cartaodecredito c = new cartaodecredito();
        c.numero = 1;
        c.nomeTitular = "Luca";
        c.cpf = "123.456.789-10";
        c.limite = 100;
        int opcao;

    do {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Consultar Limite");
        System.out.println("2 - Consultar Valor");
        System.out.println("3 - Realizar Compra");
        System.out.println("0 - Sair");
        
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Seu limite é de: " + c.consultarLimite());
                break;
            case 2:
                System.out.println("Seu limite é de: " + c.consultarTotalFatura());
                break;
            case 3:
                System.out.println("Digite o valor da compra: ");
                double valor = sc.nextDouble();
                c.realizarCompra(valor);
                break;
        default:
            break;
        }
    sc.close();
    } 
    while (opcao != 0);
    }
}
