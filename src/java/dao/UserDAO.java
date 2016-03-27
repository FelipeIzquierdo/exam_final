/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;
import javax.persistence.EntityManager;

/**
 *
 * @author LOPEZ
 */
public class UserDAO extends BaseDAO<User> {
    
    public UserDAO(EntityManager em) {
        super(em);
        
    } 

}
