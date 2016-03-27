/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DAOFactory;
import entity.Market;
import vo.MarketVO;
import dao.MarketDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author ESTUDIANTE
 */
public class MarketService extends BaseService {
    
    public MarketVO newMarket(MarketVO marketVO) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        MarketDAO marketDAO = DAOFactory.getMarketDAO(em);
        Market market = marketVO.toEntity();
        try {
            trans.begin();
            marketDAO.save(market);
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();                
        }
        if(market == null){
            return null;
        }
        return market.toVO();
    }
    
    public MarketVO findMarket(Long id) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        MarketDAO companyDAO = DAOFactory.getMarketDAO(em);
        Market market = null;
        try {
            trans.begin();
            market = companyDAO.find(id);
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();                
        }
        if(market == null){
            return null;
        }
        return market.toVO();
    }
    
    public List<MarketVO> allMarkets() {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        MarketDAO companyDAO = DAOFactory.getMarketDAO(em);
        List<Market> markets = null;
        List<MarketVO> marketsVO = new ArrayList<MarketVO>();
        try {
            trans.begin();
            markets = companyDAO.getAll();
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();                
        }
        if(markets == null){
            return null;
        }
        for (Market market : markets) {
            marketsVO.add(market.toVO());
        }
        
        return marketsVO;
    }
    
    public boolean updateMarket(MarketVO marketVO) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        MarketDAO marketDAO = DAOFactory.getMarketDAO(em);
        boolean flag = true;
        Market market = marketVO.toEntity();
        try {
            trans.begin();
            marketDAO.update(market);
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
    
    public boolean deleteMarket(Long id) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        MarketDAO marketDAO = DAOFactory.getMarketDAO(em);
        boolean flag = true;        
        try {
            trans.begin();
            marketDAO.delete(id);
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
