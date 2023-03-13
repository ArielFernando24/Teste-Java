
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void depositaConta(double valor) {
        super.saldo += valor;
    }
}
