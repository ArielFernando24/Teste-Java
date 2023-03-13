
/**
 *
 * @author ariel
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("123456789-01");
        nico.setSalario(3000.60);
        
        System.out.println(nico.getNome());
        System.out.println(nico.getSalario());
        System.out.println(nico.getBonificacao());
    }
}
