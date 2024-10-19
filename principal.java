import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        cartaodecredito c = new cartaodecredito();
        c.setNumero(1);
        c.setNomeTitular("Luca");
        c.setCpf("123.456.789-99");
        c.setLimite(100);
        Scanner sc = new Scanner(System.in);
        
        int opcao;
        int contador = 1;

        do {
            System.out.println("1 - Consultar Limite;");
            System.out.println("2 - Consultar Fatura;");
            System.out.println("3 - Realizar Compra.");
            System.out.println("4 - Alterar Limite do Cartão;");
            System.out.println("0 - Sair.");
        
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu limite é de: " +c.getLimite()+ " reais.");
                    break;
                case 2:
                    System.out.println("Sua fatura está em: " +c.getConsultarTotalFatura()+ " reais.");
                    break;
                case 3:
                    System.out.println("Digite o valor da compra: ");
                    double valor = sc.nextDouble();
                    c.realizarCompra(valor);
                    break;
                case 4:
                    System.out.println("Digite a senha de administrador: ");
                    String senhaUser = sc.next();
                    while (!senhaUser.equals("gatinho123@") && contador <= 2) {
                        System.out.println("A senha está incorreta! Tente novamente. Tentativas restantes: "+(3-contador));
                        contador++;
                        senhaUser = sc.next();
                    }
                    if (senhaUser.equals("gatinho123@")){
                        System.out.println("Insira um novo limite para esse cartão de crédito: ");
                        double alteracao = sc.nextDouble();
                        c.alterarLimite(alteracao);
                    }
                    else {
                        System.out.println("Acesso negado, senha incorreta!");
                    }
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