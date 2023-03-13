

/**
 *
 * @author ariel
 */
public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1  = new Gerente();
        
        g1.setNome("Ariel");
        g1.setCpf("123456789-02");
        g1.setSalario(6000.43);
        
        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        
        g1.setSenha(123456); // defini a senha
        
        System.out.println(g1.autentica(0)); // disse uma senha para testar aki
        
        System.out.println(g1.getBonificacao());
 
    }    
}
