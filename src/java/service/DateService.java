/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DAOFactory;
import entity.Date;
import vo.DateVO;
import dao.DateDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author ESTUDIANTE
 */
public class DateService extends BaseService {
    
    public DateVO findDate(Long id) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        DateDAO dateDAO = DAOFactory.getDateDAO(em);
        Date date = null;
        try {
            trans.begin();
            date = dateDAO.find(id);
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();                
        }
        if(date == null){
            return null;
        }
        return date.toVO();
    }
    
    public List<DateVO> allDates() {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        DateDAO dateDAO = DAOFactory.getDateDAO(em);
        List<Date> dates = null;
        List<DateVO> datesVO = new ArrayList<DateVO>();
        
        try {
            trans.begin();
            dates = dateDAO.getAll();
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();
        }
        
        for (Date date : dates) {
            datesVO.add(date.toVO());
        }
        
        return datesVO;       
        
    }
    
    public DateVO newDate(DateVO dateVO) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        DateDAO dateDAO = DAOFactory.getDateDAO(em);
        Date date = dateVO.toEntity();
        try {
            trans.begin();
            dateDAO.save(date);
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();                
        }
        if(date == null){
            return null;
        }
        return date.toVO();
    }
    
    public boolean updateDate(DateVO dateVO) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        DateDAO dateDAO = DAOFactory.getDateDAO(em);
        boolean flag = true;
        try {
            trans.begin();
            dateDAO.save(dateVO.toEntity());
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
    public boolean deleteDate(Long id) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        DateDAO dateDAO = DAOFactory.getDateDAO(em);
        boolean flag = true;
        try {
            trans.begin();
            dateDAO.delete(id);
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
