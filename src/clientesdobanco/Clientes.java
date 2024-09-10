package clientesdobanco;


public class Clientes {

    protected String CPF;
    private int numeroConta = 001;
    private String agencia = "067-7";
    private  double saldo = 500.00;

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    

}
