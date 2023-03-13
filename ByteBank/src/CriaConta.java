
public class CriaConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 200;
        System.out.println(conta1.saldo);
        
        conta1.saldo += 300;
        
        System.out.println(conta1.saldo);
        
        Conta conta2 = new Conta();
        conta2.saldo = 800;
        System.out.println(conta2.saldo);
        
        
    }
    
}
