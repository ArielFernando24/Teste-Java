

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ariel
 */
public class testemain {

    public static void main(String[] args) {
        try {
            Class.forName("com.postegresql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver nao encontrado");
        }
    }
}
