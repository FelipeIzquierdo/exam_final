/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;

/**
 *
 * @author Felipe Iz
 */
public class DAOFactory {
    
    public static UserDAO getUserDAO(EntityManager em){
        return new UserDAO(em);
    }

    public static CompanyDAO getCompanyDAO(EntityManager em) {
        return new CompanyDAO(em);
    }
    
    public static DateDAO getDateDAO(EntityManager em) {
        return new DateDAO(em);
    }
    
    public static MarketDAO getMarketDAO(EntityManager em) {
        return new MarketDAO(em);
    }
    
    public static QuoteDAO getQuoteDAO(EntityManager em) {
        return new QuoteDAO(em);
    }
    
    public static RoleDAO getRoleDAO(EntityManager em) {
        return new RoleDAO(em);
    }
    
    public static StockDAO getStockDAO(EntityManager em) {
        return new StockDAO(em);
    }    
     
}
