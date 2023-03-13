

/**
 *
 * @author ariel
 */
public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc= new ContaCorrente(222, 333);
        cc.depositaConta(100);
        
        seguroDeVida sv = new seguroDeVida();
        
        CalculadorImposto ci = new CalculadorImposto();
        
        ci.registra(cc);
        ci.registra(sv); 
        
        System.out.println(ci.getTotalImposto(cc));
    }
}
