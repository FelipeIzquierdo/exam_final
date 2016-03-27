/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import vo.QuoteVO;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author LOPEZ
 */
@Entity
public class Quote implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quote_id;
    private double quote_close;
    private double quote_high;
    private double quote_low;
    private double quote_open;

    @ManyToOne()
    @JoinColumn(name = "stock_id")
    private Stock stock;

    @ManyToOne()
    @JoinColumn(name = "date_id")
    private Date date;

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quote_id != null ? quote_id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quote)) {
            return false;
        }
        Quote other = (Quote) object;
        if ((this.quote_id == null && other.quote_id != null) || (this.quote_id != null && !this.quote_id.equals(other.quote_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.quote[ id=" + quote_id + " ]";
    }

    /**
     * @return the quote_id
     */
    public Long getQuote_id() {
        return quote_id;
    }

    /**
     * @param quote_id the quote_id to set
     */
    public void setQuote_id(Long quote_id) {
        this.quote_id = quote_id;
    }

    /**
     * @return the quote_close
     */
    public double getQuote_close() {
        return quote_close;
    }

    /**
     * @param quote_close the quote_close to set
     */
    public void setQuote_close(double quote_close) {
        this.quote_close = quote_close;
    }

    /**
     * @return the quote_high
     */
    public double getQuote_high() {
        return quote_high;
    }

    /**
     * @param quote_high the quote_high to set
     */
    public void setQuote_high(double quote_high) {
        this.quote_high = quote_high;
    }

    /**
     * @return the quote_low
     */
    public double getQuote_low() {
        return quote_low;
    }

    /**
     * @param quote_low the quote_low to set
     */
    public void setQuote_low(double quote_low) {
        this.quote_low = quote_low;
    }

    /**
     * @return the quote_open
     */
    public double getQuote_open() {
        return quote_open;
    }

    /**
     * @param quote_open the quote_open to set
     */
    public void setQuote_open(double quote_open) {
        this.quote_open = quote_open;

    }

    public QuoteVO toVO() {
        QuoteVO quoteVO = new QuoteVO();
        quoteVO.setQuoteId(this.getQuote_id());        
        quoteVO.setQuoteClose(this.getQuote_close());
        quoteVO.setQuoteHigh(this.getQuote_high());        
        quoteVO.setQuoteLow(this.getQuote_low());
        quoteVO.setQuoteOpen(this.getQuote_open());
        quoteVO.setDate(this.getDate());
        quoteVO.setStock(this.getStock());
        return quoteVO;
    }
}
