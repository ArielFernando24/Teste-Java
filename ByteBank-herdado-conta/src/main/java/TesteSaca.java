

/**
 *
 * @author ariel
 */
public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        
        conta.depositaConta(200);
        try{
              conta.saca(210);
        }catch(SaldoInsuficienteException ex){
            System.out.println("EX:" + ex.getMessage());
        }
        

    }
}
