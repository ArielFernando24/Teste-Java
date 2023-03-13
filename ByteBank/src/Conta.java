
/**
 *
 * @author ariel
 */
public class Conta {
    double saldo;
    int agencia, numero;
    String titular;
    
    
    public void depositaConta(double valor ){ //depositar um valor na conta
        this.saldo += valor;
    }
    public boolean sacaConta(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else
            return false;
    }
    public boolean transfereConta(double valor, Conta contaDes){
        if(this.saldo >= valor){
            this.saldo -= valor;
            contaDes.depositaConta(valor);
            return true;
        }
        return false;
    }
}
