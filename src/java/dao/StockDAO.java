/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Stock;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author LOPEZ
 */
public class StockDAO extends BaseDAO<Stock> {
    
    public StockDAO(EntityManager em) {
        super(em);
        
    } 
    
    public List<Stock> findByCompany(int company_id) {
        Query query = em.createQuery("SELECT e FROM Stock e WHERE e.company_id=:companyId");
        query.setParameter("companyId", company_id);
        List<Stock> stocks = query.getResultList();

        return stocks;

    }

}
