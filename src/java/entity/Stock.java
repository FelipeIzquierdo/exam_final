/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import vo.StockVO;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author LOPEZ
 */
@Entity
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stock_id;
    private int company_id;
    private String stock_description;
    private String stock_name;
    private String stock_symbol;
    
    
    @OneToMany(mappedBy="stock")
    private Collection<Quote> quotes;

    public Long getId() {
        return getStock_id();
    }

    public void setId(Long id) {
        this.setStock_id(id);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getStock_id() != null ? getStock_id().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.getStock_id() == null && other.getStock_id() != null) || (this.getStock_id() != null && !this.stock_id.equals(other.stock_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Stock[ id=" + getStock_id() + " ]";
    }

    /**
     * @return the stock_id
     */
    public Long getStock_id() {
        return stock_id;
    }

    /**
     * @param stock_id the stock_id to set
     */
    public void setStock_id(Long stock_id) {
       
        this.stock_id = stock_id;
    }

    /**
     * @return the comapany_id
     */
    public int getComapany_id() {
        return company_id;
    }

    /**
     * @param comapany_id the comapany_id to set
     */
    public void setComapany_id(int comapany_id) {
        this.company_id = comapany_id;
    }

    /**
     * @return the stock_description
     */
    public String getStock_description() {
        return stock_description;
    }

    /**
     * @param stock_description the stock_description to set
     */
    public void setStock_description(String stock_description) {
        this.stock_description = stock_description;
    }

    /**
     * @return the stock_name
     */
    public String getStock_name() {
        return stock_name;
    }

    /**
     * @param stock_name the stock_name to set
     */
    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    /**
     * @return the stock_symbol
     */
    public String getStock_symbol() {
        return stock_symbol;
    }

    /**
     * @param stock_symbol the stock_symbol to set
     */
    public void setStock_symbol(String stock_symbol) {
        this.stock_symbol = stock_symbol;
    }

    /**
     * @return the quotes
     */
    public Collection<Quote> getQuotes() {
        return quotes;
    }

    /**
     * @param quotes the quotes to set
     */
    public void setQuotes(Collection<Quote> quotes) {
        this.quotes = quotes;
    }
    
    
    
    public StockVO getVO(){
    
        StockVO stockVO = new StockVO();
        
        stockVO.setCompanyId(company_id);
        stockVO.setStrock_description(stock_description);
        stockVO.setStock_id(this.stock_id.intValue());
        stockVO.setStockName(stock_name);
        stockVO.setStockSymbol(stock_symbol);
    
        return stockVO;
    }
    
    
    public Stock setVO(StockVO stockVO){
        this.company_id = stockVO.getCompanyId();
        this.stock_description = stockVO.getStrock_description();
        this.stock_id = new Long(stockVO.getStock_id());
        this.stock_name= stockVO.getStockName();
        this.stock_symbol = stockVO.getStockSymbol();
    
        return this;
    }
    
}
