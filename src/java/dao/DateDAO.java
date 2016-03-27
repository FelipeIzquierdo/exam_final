/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author LOPEZ
 */
public class DateDAO extends BaseDAO<Date> {
    
    public DateDAO(EntityManager em) {
        super(em);
        
    } 

}
