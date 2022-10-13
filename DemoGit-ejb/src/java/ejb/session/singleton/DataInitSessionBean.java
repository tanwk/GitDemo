/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.singleton;

import entity.Person;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author distwk
 */
@Singleton
@LocalBean
@Startup

public class DataInitSessionBean
{
    @PersistenceContext(unitName = "DemoGit-ejbPU")
    private EntityManager em;
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PostConstruct
    public void postConstruct()
    {
        em.persist(new Person("Person A"));
        em.persist(new Person("Person B"));
        em.persist(new Person("Person C"));
        em.persist(new Person("Person D"));
        em.persist(new Person("Person E"));
    }
}
