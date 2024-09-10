package clientesdobanco;

public class Cliente extends Clientes {

    public boolean autenticacao(String CPFCliente){
        
        if (this.CPF == CPFCliente)
            return true;
        return false;
    }
   
}
