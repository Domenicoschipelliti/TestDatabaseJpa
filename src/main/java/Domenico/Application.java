package Domenico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

  private static final EntityManagerFactory em= Persistence.createEntityManagerFactory("JpaPercistence");
    public static void main(String[] args) {
        EntityManager en=em.createEntityManager();
        System.out.println("Hello World!");
    }
}
