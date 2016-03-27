/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DAOFactory;
import dao.QuoteDAO;
import entity.Quote;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import vo.QuoteVO;

/**
 *
 * @author ESTUDIANTE
 */
public class QuoteService extends BaseService {
    
    public QuoteVO newQuote(QuoteVO quotetVO) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        QuoteDAO quoteDAO = DAOFactory.getQuoteDAO(em);
        Quote quote = quotetVO.toEntity();
        try {
            trans.begin();
            quoteDAO.save(quote);
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();                
        }
        if(quote == null){
            return null;
        }
        return quote.toVO();
    }
    
    public QuoteVO findQuote(Long id) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        QuoteDAO quoteDAO = DAOFactory.getQuoteDAO(em);
        Quote quote = null;
        try {
            trans.begin();
            quote = quoteDAO.find(id);
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();                
        }
        if(quote == null){
            return null;
        }
        return quote.toVO();
    }
    
    public List<QuoteVO> allMarkets() {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        QuoteDAO quoteDAO = DAOFactory.getQuoteDAO(em);
        List<Quote> quotes = null;
        List<QuoteVO> quotesVO = new ArrayList<QuoteVO>();
        try {
            trans.begin();
            quotes = quoteDAO.getAll();
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();                
        }
        if(quotes == null){
            return null;
        }
        for (Quote quote : quotes) {
            quotesVO.add(quote.toVO());
        }
        
        return quotesVO;
    }
    
    public boolean updateQuote(QuoteVO quoteVO) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        QuoteDAO quoteDAO = DAOFactory.getQuoteDAO(em);
        boolean flag = true;
        Quote quote = quoteVO.toEntity();
        try {
            trans.begin();
            quoteDAO.update(quote);
            trans.commit();
        } catch (Exception e) {
            trans.rollback();
            flag = false;
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();
        }
        
        return flag;
    }
    
    public boolean deleteQuote(Long id) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        QuoteDAO quoteDAO = DAOFactory.getQuoteDAO(em);
        boolean flag = true;        
        try {
            trans.begin();
            quoteDAO.delete(id);
            trans.commit();
        } catch (Exception e) {
            trans.rollback();
            flag = false;
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();
        }
        
        return flag;
    }

}
