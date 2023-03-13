

/**
 *
 * @author ariel
 */
public class testaMetodo {
    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100; 
        contaDoPaulo.depositaConta(50);
        System.out.println(contaDoPaulo.saldo);
        boolean conseguiuRetirar =contaDoPaulo.sacaConta(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);
        
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.depositaConta(1000);
        contaDaMarcela.transfereConta(300, contaDoPaulo);
        
        if(contaDaMarcela.transfereConta(300, contaDoPaulo)){
            System.out.println("transferencia concluida");
        }else{
            System.out.println("Saldo insuficiente");
        }
        
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
    }
}
    

