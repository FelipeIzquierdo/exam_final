/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andrestntx
 */
public class BaseService {
    
    protected EntityManager getNewEntityManager(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("storeAdminsPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }
    
}
