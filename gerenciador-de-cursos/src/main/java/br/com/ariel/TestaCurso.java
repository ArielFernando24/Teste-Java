
package br.com.ariel;

import java.util.*  ;

/**
 *
 * @author ariel
 */
public class TestaCurso {
    public static void main(String[] args) {
        Curso java = new Curso("Dominando as coleções do Java ", "Ariel da cocada preta");
        
        List<Aula> aulas = java.getAulas();
        System.out.println(aulas);
        
        
        java.adiciona(new Aula("Trabalhando com ArrayList", 21));
        java.adiciona(new Aula("Criando uma Aula", 20));
        java.adiciona(new Aula("Modelando com coleções", 24));

        System.out.println(java .getAulas());
    }
}
