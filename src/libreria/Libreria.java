/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Autor;




/**
 *
 * @author Usuario
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            EntityManager em =
                    Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
            Autor autor = new Autor();
            
//            autor.setNombre("Agustin");
//            autor.setAlta(Boolean.FALSE);
//            autor.setId(Integer.SIZE);
//            
//            em.getTransaction().begin();
//            
//            em.persist(autor);
//            
//            em.getTransaction().commit();
// 
                
//                autor.setNombre("Romualdo");
//                autor.setAlta(Boolean.FALSE);
//                autor.setId(Integer.MIN_VALUE);
//                
//                em.getTransaction().begin();
//                
//                em.persist(autor);
//                
//                em.getTransaction().commit();
//                
                List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
                for (Autor a : autores) {
                    System.out.println(a.toString());
        }
        
    }

}
