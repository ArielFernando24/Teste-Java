
/**
 *
 * @author ariel
 */
public class Administrador extends Funcionario implements Autenticavel {

     private Autenticador autentic;
    
    public Administrador(){
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
    

        @Override
        public double getBonificacao() {
            return 50;
        }
}