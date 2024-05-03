package pe.edu.cibertec.springwebsistemaventas.Consultas;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.springwebsistemaventas.entity.Tienda;

public class ConsultaTienda {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdsistemaventas");
        EntityManager em = emf.createEntityManager();

        Tienda tienda = em.find(Tienda.class,"1");

        System.out.println(tienda);
    }
}
