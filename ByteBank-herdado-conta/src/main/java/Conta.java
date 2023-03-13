    
/**
 *
 * @author ariel
 */

// nao pode instanciar(criar um objeto)
public abstract class Conta {
    protected double saldo;
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
    
    public abstract void depositaConta( double valor);
    
    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
    }
        this.saldo -= valor;
    } 
    public void transfereConta(double valor, Conta contaDes) throws SaldoInsuficienteException{
        this.saca(valor);
        contaDes.depositaConta(valor);
    }

}
