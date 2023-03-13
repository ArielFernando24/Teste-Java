
/**
 *
 * @author ariel
 */
public class Cliente implements Autenticavel {
    
    private Autenticador autentic;
    
    public Cliente(){
        this.autentic = new Autenticador();
    }
    
    @Override
    public void setSenha(int senha) {
        this.autentic.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autentic.autentica(senha);  
    }
    
    
    
    
}
