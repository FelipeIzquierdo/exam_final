/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Role;
import javax.persistence.EntityManager;

/**
 *
 * @author LOPEZ
 */
public class RoleDAO extends BaseDAO<Role> {
    
    public RoleDAO(EntityManager em) {
        super(em);
        
    } 
}
