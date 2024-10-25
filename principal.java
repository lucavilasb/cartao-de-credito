import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        cartaodecredito c = new cartaodecredito();
        c.setNumero(1);
        c.setNomeTitular("Luca");
        c.setCpf("12345678999");
        c.setLimite(100);
        Scanner sc = new Scanner(System.in);
        
        int opcao;
        int contador = 1;

        do {
            System.out.println("1 - Consultar Limite;");
            System.out.println("2 - Consultar Fatura;");
            System.out.println("3 - Realizar Compra.");
            System.out.println("4 - Alterar Limite do Cartão;");
            // System.out.println("5 - Alterar Dados do Cartão de Crédito;");
            System.out.println("0 - Sair.");
        
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu limite é de: " +c.getLimite()+ " reais.");
                    break;
                case 2:
                    System.out.println("Sua fatura está em: " +c.getTotalFatura()+ " reais.");
                    break;
                case 3:
                    System.out.println("Digite o valor da compra: ");
                    double valor = sc.nextDouble();
                    c.realizarCompra(valor);
                    break;
                case 4:
                    System.out.println("Digite a senha do administrador: ");
                    String senhaUser = sc.next();
                    while(!senhaUser.equals("gatinho123@") && contador <= 2) {
                        System.out.println("A senha está incorreta! Tente novamente. Tentativas restantes: "+(3-contador));
                        contador++;
                        senhaUser = sc.next();
                    }
                    if(senhaUser.equals("gatinho123@")){
                        System.out.println("Insira um novo limite para esse cartão de crédito: ");
                        double limite = sc.nextDouble();
                        c.alterarLimite(limite);
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
        while(opcao != 0);
    sc.close(); 
    }
}

                // case 5:
                //     System.out.println("Digite a senha do administrador: ");
                //     String senhaDados = sc.next();
                //     while(!senhaDados.equals("gatinho123@") && contador <= 2) {
                //         System.out.println("A senha está incorreta! Tente novamente. Tentativas restantes: "+(3-contador));
                //         contador++;
                //         senhaDados = sc.next();
                //     if(senhaDados.equals("gatinho123@")) {
                //         System.out.println("Insira novo número do cartão: ");
                //             int numero = sc.nextInt();
                //             c.setNumero(numero);
                //         System.out.println("Insira o nome do titular: ");
                //             String titular = sc.next();
                //             c.setNomeTitular(titular);
                //         System.out.println("Insira o CPF do titular: ");
                //             String cpf = sc.next();
                //             c.setCpf(cpf);
                //         System.out.println("Dados alterados com sucesso!");
                //     }
                //     else {
                //         System.out.println("Acesso negado, senha incorreta!");
                //         contador = 0;
                //         }
                //     break;
                //     }
