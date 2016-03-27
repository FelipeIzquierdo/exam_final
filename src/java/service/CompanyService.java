/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Company;
import vo.CompanyVO;
import dao.CompanyDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author ESTUDIANTE
 */
public class CompanyService extends BaseService {
    
    public CompanyVO newCompany(CompanyVO companyVO) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        CompanyDAO companyDAO = DAOFactory.getCompanyDAO(em);
        Company company = companyVO.toEntity();
        try {
            trans.begin();
            companyDAO.save(company);
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();                
        }
        if(company == null){
            return null;
        }
        return company.toVO();
    }

    public CompanyVO findCompany(Long id) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        CompanyDAO companyDAO = DAOFactory.getCompanyDAO(em);
        Company company = null;
        try {
            trans.begin();
            company = companyDAO.find(id);
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();                
        }
        if(company == null){
            return null;
        }
        return company.toVO();
    }

    public List<CompanyVO> allCompanies() {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        CompanyDAO companyDAO = DAOFactory.getCompanyDAO(em);
        List<Company> companies = null;
        List<CompanyVO> companysVO = new ArrayList<CompanyVO>();
        
        try {
            trans.begin();
            companies = companyDAO.getAll();
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();
        }
        
        if(companies == null){
            return null;
        }
        
        for (Company company : companies) {
            companysVO.add(company.toVO());
        }
        
        return companysVO;       
        
    }

    public List<CompanyVO> findCompaniesByMarketId(int market_id) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        CompanyDAO companyDAO = DAOFactory.getCompanyDAO(em);
        List<Company> comanies = null;
        List<CompanyVO> companysVO = new ArrayList<CompanyVO>();
        
        try {
            trans.begin();
            comanies = companyDAO.findByMarketId(market_id);
            trans.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.clear();
            em.close();
        }
        
        for (Company company : comanies) {
            companysVO.add(company.toVO());
        }
        
        return companysVO;       
    }
    
    public boolean updateCompany(CompanyVO companyVO) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        CompanyDAO companyDAO = DAOFactory.getCompanyDAO(em);
        boolean flag = true;
        try {
            trans.begin();
            companyDAO.save(companyVO.toEntity());
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
    
    public boolean deleteCompany(long id) {
        EntityManager em = this.getNewEntityManager();
        EntityTransaction trans = em.getTransaction();
        CompanyDAO companyDAO = DAOFactory.getCompanyDAO(em);
        boolean flag = true;
        try {
            trans.begin();
            companyDAO.delete(id);
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
