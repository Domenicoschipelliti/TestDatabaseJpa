package dao;

import Domenico.Libro;
import Domenico.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LibroDAO {
    private EntityManager entityManager;

    public LibroDAO(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    public void save(Libro libro){

        EntityTransaction entityTransaction= entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(libro);
        entityTransaction.commit();
        System.out.println("Libro dato con successo");

    }
}
