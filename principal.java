import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CreditCard c = new CreditCard(123, "Haru", "12312352636");
        c.setCpf("12312352636");
        c.setLimit(100);
        Scanner sc = new Scanner(System.in);

        int option = 1;

        do {
            System.out.println("1 - Consult Limit");
            System.out.println("2 - Consult Invoice");
            System.out.println("3 - Make Purchase");
            System.out.println("0 - Exit");

            option = sc.nextInt();

            
            switch (option) {
                case 1:
                    System.out.println(c.consultLimit());
                    break;
                case 2:
                    System.out.println(c.consultTotalInvoice());
                    break;
                case 3:
                    System.out.println("Enter the purchase amount:");
                    double value = sc.nextDouble();
                    c.makePurchase(value);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (option != 0);
    }
}
