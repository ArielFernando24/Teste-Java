
/**
 *
 * @author ariel
 */
public class Conta {
    private double saldo;
    private int agencia, numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O numero total de contas criadas: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta padrao " + this.numero);
    }

    public static int getTotal() {
        return Conta.total;
    }
   
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }
    
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
