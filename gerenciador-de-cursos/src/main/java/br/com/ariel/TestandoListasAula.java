
package br.com.ariel;

import java.util.*;

/**
 *
 * @author ariel
 */
public class TestandoListasAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Geografia", 22);
        Aula a2 = new Aula("Historia", 20);
        Aula a3 = new Aula("Matematica", 50);
        
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        System.out.println(aulas);
        
        Collections.sort(aulas);
        
        System.out.println(aulas);
        
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        
        System.out.println(aulas);

    }
}
