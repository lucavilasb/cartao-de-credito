import java.util.Scanner;
public class cartaodecredito {
    private int numero;
    private String nomeTitular;
    private String cpf;
    private double limite;
    private double totalFatura;

    Scanner entrada = new Scanner(System.in);

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setNomeTitular(String nomeTitular) {
        // Exibir em letras maiusculas
        this.nomeTitular = nomeTitular.toUpperCase();
    }
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setCpf(String cpf) {
        // Formatar pontuação no CPF
        this.cpf = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
    public String getCpf() {
        return cpf;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getLimite() {
        return limite;
    }
    
    public void setConsultarTotalFatura(double totalFatura) {
        this.totalFatura = totalFatura;
    }
    public double getConsultarTotalFatura() {
        return totalFatura;
    }

    public void realizarCompra(double valor) {
        if(valor <= this.limite) {
            this.limite = limite - valor; // limite -= valor;
            this.totalFatura = totalFatura + valor; // saldo += valor
            System.out.println("A sua compra de " + valor + " foi efetuada com sucesso!");
        }
        else {
            System.out.println("Você não possui limite necessário para essa compra.");
        }
    }

    public void alterarLimite(double alteracao) {
        do {
            if(alteracao != this.limite) {
                this.limite = alteracao;
                System.out.println("O limite do cartão foi atualizado com sucesso!");
            }
            else {
                System.out.println("Por favor, insira um valor maior ou menor que o limite atual do cartão.");
            }
        }
        while(alteracao > limite && alteracao < limite);
    }
}