import java.util.Scanner;
public class cartaodecredito {
    int numero;
    String nomeTitular;
    String cpf;
    double limite;
    double totalFatura;

Scanner entrada = new Scanner(System.in);

    public double consultarLimite() {
        return limite;
    }

    public double consultarTotalFatura() {
        return totalFatura;
    }

    public void realizarCompra(double valor) {
        if(valor <= this.limite){
        this.limite = limite - valor; // limite -= valor;
        this.totalFatura = totalFatura + valor; // saldo += valor
        System.out.println("A sua compra de " + valor + " foi efetuada com sucesso!");
        }
        else {
            System.out.println("Você não possui limite necessário para essa compra.");
        }
    }
}
