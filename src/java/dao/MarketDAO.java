/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Market;
import javax.persistence.EntityManager;

/**
 *
 * @author LOPEZ
 */
public class MarketDAO extends BaseDAO<Market> {
    
    public MarketDAO(EntityManager em) {
        super(em);
        
    } 
}
