package conta;

public class Conta implements IConta {

    
    private int numeroConta;
    private String agencia;
    private double saldo;


    @Override
    public void sacar(double valor) {
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Saque no valor de: " + valor + " realizado com sucesso.");
        }else
            System.out.println("Saldo: " + saldo + " insuficiente para saque de "+ valor);       
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Realizado com sucesso");
    }

    @Override
    public void transferir(double valor, int destino) {
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Transferência no valor de: " + valor + " realizado com sucesso para a conta: " + destino);
        }else
            System.out.println("Transferência não realizada. Saldo insuficiente.");
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   

}
