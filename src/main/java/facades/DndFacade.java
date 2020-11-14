package facades;

import entities.PlayerChar;
import entities.Race;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class DndFacade {

    private static DndFacade instance;
    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton
    private DndFacade() {}
    
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static DndFacade getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new DndFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    //TODO Remove/Change this before use
    public List<Race> getRaces(){
        EntityManager em = getEntityManager();
        
        List<Race> liste = new ArrayList<>();
        
        try{
            
            TypedQuery<Race> q = em.createQuery("SELECT r FROM Race r", Race.class);

            liste = q.getResultList();
            
            return liste;
        }finally{  
            em.close();
        }
    }
    public void saveChar(PlayerChar pc){
        EntityManager em = getEntityManager();
        
        try{
            em.getTransaction().begin();
            em.persist(pc);
            em.getTransaction().commit();
            
        }catch (Exception ex) {
            
        } finally {
            em.close();
        }
    }

}
