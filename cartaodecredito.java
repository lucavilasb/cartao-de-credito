import java.util.Scanner;
public class creditcard {
    private int number;
    private String titularName;
    private String cpf;
    private double limit;
    private double totalInvoice;
    private double cashBack;

    Scanner input = new Scanner(System.in);

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public void setTitularName(String nameTitular) {
        this.nameTitular = nameTitular.toUpperCase();
    }
    public String getNameTitular() {
        return nameTitular;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
    public String getCpf() {
        return cpf;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
    public double getLimit() {
        return limit;
    }
    
    public void setTotalInvoice(double totalInvoice) {
        this.totalInvoice = totalInvoice;
    }
    public double getTotalInvoice() {
        return totalInvoice;
    }

    public void setCashBack(double cashBack) {
        this.cashBack = limit;
    }
    public double getCashBack() {
        return cashBack;
    }

    public void makePurchase(double value) {
        if(value <= getLimit()) {
            setLimit(limit-value);
            setTotalInvoice(totalInvoice+value);
            System.out.println("Your purchase of " +valor+ " was made successfully!");
        }
        else {
            System.out.println("You do not have the necessary limit for this purchase.");
        }
    }

    public void changeLimit(double change) {
        do {
            if(change != getLimit()) {
                setLimit(change);
                System.out.println("The card limit has been updated successfully!");
            }
            else {
                System.out.println("Please enter an amount greater or less than the card's current limit.");
            }
        }
        while(change > getLimit() && change < getLimit());
    }

    public void buyWithCashBack(double valueCash) {
        if(valueCash <= getLimit()) {
            setLimit((limit-valueCash)+valueCash/getCashBack());
            setTotalInvoice(totalInvoice+valueCash);
            System.out.println("Your purchase of " +valueCash+ " was made successfully! You got " +getCashBack()+ " cashback.");
        }
        else {
            System.out.println("You do not have the necessary limit for this purchase.");
        }
    }


    public void makeCard(int number, String titularName, String cpf, double limit) {
        System.out.println("Created successfully!");
    }

    public void makeCardPremium(int number, String titularName, String cpf, double limit, double cashBack) {
        System.out.println("Created successfully!");
    }

}
