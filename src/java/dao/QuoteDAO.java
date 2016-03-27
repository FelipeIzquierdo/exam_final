/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Quote;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author LOPEZ
 */
public class QuoteDAO extends BaseDAO<Quote> {
    
    public QuoteDAO(EntityManager em) {
        super(em);
        
    } 

    public List<Quote> findByStock(Long id) {

        Query query = em.createQuery("SELECT e FROM Quote e WHERE e.stock.stock_id=:id_stock ORDER BY e.date1.date_string  ASC");
        query.setParameter("id_stock", id);
        List<Quote> quotes = query.getResultList();

        return quotes;
    }

    public List<Quote> findByStockOrderDate(Long id) {

        Query query = em.createQuery("SELECT e FROM Quote e    WHERE e.stock.stock_id=:mi_stock  ORDER BY e.date1.date_string  ASC");
        query.setParameter("mi_stock", id);
        List<Quote> quotes = query.getResultList();

        return quotes;
    }
}
