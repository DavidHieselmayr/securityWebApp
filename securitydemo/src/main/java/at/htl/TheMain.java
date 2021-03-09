package at.htl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TheMain {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ChatPU");
        EntityManager em = emf.createEntityManager();

        em.close();
        emf.close();
    }
}
