
package br.com.ariel;

import java.util.*;


/**
 *
 * @author ariel
 */
public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);        

        System.out.println(aulas);
        
        aulas.remove(1);
        
        System.out.println(aulas);
        
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }
        
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);
        
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula : " + aulas.get(i));
}
        
        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula " + aula);
        });
        aulas.add("Aumentando o nosso conhecimento");
        System.out.println(aulas);
        Collections.sort(aulas); // ordenando a lista
        System.out.println(aulas);
        
    }
}
