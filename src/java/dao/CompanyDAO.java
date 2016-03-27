/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Company;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author LOPEZ
 */
public class CompanyDAO extends BaseDAO<Company> {
    
    public CompanyDAO(EntityManager em) {
        super(em);
        
    } 

    public List<Company> findByMarketId(int marketId) {

        Query query = this.em.createQuery("SELECT e FROM Company e WHERE e.market_id=:market_id");
        query.setParameter("market_id", marketId);        
        List<Company> companies = query.getResultList();

        return companies;
    }

}
