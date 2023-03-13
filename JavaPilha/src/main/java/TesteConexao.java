

/**
 *
 * @author ariel
 */
public class TesteConexao {
    public static void main(String[] args) {
        
        try(Conexao conexao = new Conexao()){
            conexao.leDados(); 
        }catch(IllegalStateException ex){
            System.out.println("Deu erro na coneção");
        }
//        
//        Conexao conn = null;
//        try{
//            conn = new Conexao();
//            conn.leDados();
//            conn.fecha();
//        }catch(IllegalStateException ex){
//            System.out.println("Deu erro na coneção");
//        }finally{ // opcional
//            conn.fecha();            
//        }
    }
}
