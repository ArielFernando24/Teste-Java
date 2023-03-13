
/**
 *
 * @author ariel
 */
public class Gerente extends Funcionario implements Autenticavel{ //herança
    
    private Autenticador autentic;
    
    
    public Gerente(){
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
	    return super.getSalario();
	}
 

}   
