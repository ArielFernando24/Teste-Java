
/**
 *
 * @author ariel
 */

public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }
    
    
    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
        super.saca(valor + 0.2);
    }

//    @Override
//    public boolean sacaConta(double valor) {
//        return super.sacaConta(valor + 0.2);
//    }
//    

    @Override
    public void depositaConta(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

}
