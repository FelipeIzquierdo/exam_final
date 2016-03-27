/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import vo.CompanyVO;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author LOPEZ
 */
@Entity
public class Company implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long company_id;
    private String company_description;
    private String company_name;
    private int market_id;
    private String company_symbol;
    
    public Long getId() {
        return company_id;
    }

    public void setId(Long id) {
        this.company_id = id;
    } 

    /**
     * @return the company_id
     */
    public Long getCompany_id() {
        return company_id;
    }

    /**
     * @param company_id the company_id to set
     */
    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    /**
     * @return the company_description
     */
    public String getCompany_description() {
        return company_description;
    }

    /**
     * @param company_description the company_description to set
     */
    public void setCompany_description(String company_description) {
        this.company_description = company_description;
    }

    /**
     * @return the market_name
     */
    public String getCompany_name() {
        return company_name;
    }

    /**
     * @param market_name the market_name to set
     */
    public void setCompany_name(String market_name) {
        this.company_name = market_name;
    }

    /**
     * @return the market_id
     */
    public int getMarket_id() {
        return market_id;
    }

    /**
     * @param market_id the market_id to set
     */
    public void setMarket_id(int market_id) {
        this.market_id = market_id;
    }

    /**
     * @return the company_symbol
     */
    public String getCompany_symbol() {
        return company_symbol;
    }

    /**
     * @param company_symbol the company_symbol to set
     */
    public void setCompany_symbol(String company_symbol) {
        this.company_symbol = company_symbol;
    }
    
    @Override
    public String toString() {
        return "Entity.Company[ id=" + company_id + " ]";
    }
    
    
    
    public CompanyVO toVO(){
     CompanyVO companyVO = new CompanyVO();     
     companyVO.setCompanyDescription(this.getCompany_description());
     companyVO.setCompanyId(this.getCompany_id());
     companyVO.setCompanyName(this.getCompany_name());
     companyVO.setMarketId(this.getMarket_id());
     companyVO.setCompanySymbol(this.getCompany_symbol());
     return companyVO;
        
    }
    
}
