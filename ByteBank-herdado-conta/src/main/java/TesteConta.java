

/**
 *
 * @author ariel
 */
public class TesteConta {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(111, 111);
        cc.depositaConta(100);
        
        Conta cp = new ContaPoupanca(111, 222);
        cp.depositaConta(200);
        
        cc.transfereConta(10.0, cp);
        
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
