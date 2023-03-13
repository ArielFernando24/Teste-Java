

/**
 *
 * @author ariel
 */
public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulinho da boy";
        paulo.cpf = "123456789";
        paulo.profissao = "vagabundo";
        
        Conta cp = new Conta();
        
        cp.depositaConta(100);
        
        cp.titular = paulo;
        
        System.out.println("Pica das galaxias " +  cp.titular.nome + " " + cp.getSaldo());
        
    }
}
