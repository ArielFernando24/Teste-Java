

/**
 *
 * @author ariel
 */
public class TestaContaComExcexaoChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
    try{
        c.deposita();
    }catch(minhaExcecao ex){
        System.out.println("Tratamento ...");
}
    }
  
}
