import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        cartaodecredito c = new cartaodecredito();
        c.setNumero(1);
        c.setNomeTitular("Luca");
        c.setCpf("12345678999");
        c.setLimite(100);
        c.setCashBack(0);
        Scanner sc = new Scanner(System.in);
        
        int contador = 1;
        int opcao, numero;
        String titular, cpf;
        double limite, cashBack;

        do {
           
            System.out.println("1 - Consultar Limite;");
            System.out.println("2 - Consultar Fatura;");
            System.out.println("3 - Realizar compra com cashback;");
            System.out.println("4 - Realizar Compra.");
            System.out.println("5 - Alterar Limite do Cartão;");
            System.out.println("6 - Criar dados do cartão de crédito;");
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
                    double valorCash = sc.nextDouble();
                    c.comprarComCashBack(valorCash);
                    break;

                case 4:
                    System.out.println("Digite o valor da compra: ");
                    double valor = sc.nextDouble();
                    c.realizarCompra(valor);
                    break;

                case 5:
                    System.out.println("Digite a senha do administrador: ");
                    String senhaUser = sc.next();
                    while(!senhaUser.equals("gatinho123@") && contador <= 2) {
                        System.out.println("A senha está incorreta! Tente novamente. Tentativas restantes: "+(3-contador));
                        contador++;
                        senhaUser = sc.next();
                    }

                    if(senhaUser.equals("gatinho123@")) {
                        System.out.println("Insira um novo limite para esse cartão de crédito: ");
                        double novoLimite = sc.nextDouble();
                        c.alterarLimite(novoLimite);
                    }
                    else {
                        System.out.println("Acesso negado, senha incorreta!");
                    }
                    break;

                case 6:
                    System.out.println("1 - Criar cartão normal;");
                    System.out.println("2 - Criar cartão premium;");
    
                    int cliente = sc.nextInt();
                    switch (cliente) {
                        case 1: 
                            System.out.println("Insira novo número do cartão: ");
                                numero = sc.nextInt();
                                c.setNumero(numero);
               
                            System.out.println("Insira o nome do titular: ");
                                titular = sc.next();
                                c.setNomeTitular(titular);
        
                            System.out.println("Insira o CPF do titular: ");
                                cpf = sc.next();
                                c.setCpf(cpf);
        
                            System.out.println("Insira o limite do cartão: ");
                                limite = sc.nextDouble();
                                c.setLimite(limite);
                    
    
                                c.criarCartao(numero, titular, cpf, limite);
                        break;
                        case 2: 
                            System.out.println("Insira novo número do cartão premium: ");
                                numero = sc.nextInt();
                                c.setNumero(numero);
               
                            System.out.println("Insira o nome do titular do cartão premium: ");
                                titular = sc.next();
                                c.setNomeTitular(titular);
        
                            System.out.println("Insira o CPF do titular do cartão premium: ");
                                cpf = sc.next();
                                c.setCpf(cpf);
        
                            System.out.println("Insira o limite do cartão premium: ");
                                limite = sc.nextDouble();
                                c.setLimite(limite);
                
                            System.out.println("Insira qual porcentagem do valor do cashback: ");
                                cashBack = sc.nextDouble();
                                cashBack = cashBack / 100;
                                c.setCashBack(cashBack);
    
                            c.criarCartaoPremium(numero, titular, cpf, limite, cashBack);
                            break;
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

