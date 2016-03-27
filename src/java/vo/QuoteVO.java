package vo;

import entity.Date;
import entity.Quote;
import entity.Stock;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class QuoteVO {
    
    private Long quoteId;    
    private double quote;
    private double quoteHigh;    
    private double quoteLow;
    private double quoteOpen;
    private double quoteClose;    
    private Stock stock;
    private Date date;
   

    /**
     * @return the quote
     */
    public double getQuote() {
        return quote;
    }

    /**
     * @param quote the quote to set
     */
    public void setQuote(double quote) {
        this.quote = quote;
    }

    /**
     * @return the quoteHigh
     */
    public double getQuoteHigh() {
        return quoteHigh;
    }

    /**
     * @param quoteHigh the quoteHigh to set
     */
    public void setQuoteHigh(double quoteHigh) {
        this.quoteHigh = quoteHigh;
    }

    public Long getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Long quoteId) {
        this.quoteId = quoteId;
    }

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

    

    /**
     * @return the quoteLow
     */
    public double getQuoteLow() {
        return quoteLow;
    }

    /**
     * @param quoteLow the quoteLow to set
     */
    public void setQuoteLow(double quoteLow) {
        this.quoteLow = quoteLow;
    }

    /**
     * @return the quoteOpen
     */
    public double getQuoteOpen() {
        return quoteOpen;
    }

    /**
     * @param quoteOpen the quoteOpen to set
     */
    public void setQuoteOpen(double quoteOpen) {
        this.quoteOpen = quoteOpen;
    }
    

    /**
     * @return the quoteClose
     */
    public double getQuoteClose() {
        return quoteClose;
    }

    /**
     * @param quoteClose the quoteClose to set
     */
    public void setQuoteClose(double quoteClose) {
        this.quoteClose = quoteClose;
    }    

   
    
    public Quote toEntity(){
        Quote entity = new Quote();
        entity.setQuote_id(this.getQuoteId());
        entity.setQuote_open(this.getQuoteOpen());
        entity.setQuote_high(this.getQuoteHigh());
        entity.setQuote_low(this.getQuoteLow());
        entity.setQuote_close(this.getQuoteClose());
        entity.setDate(this.getDate());
        entity.setStock(this.getStock());
        return entity;
    }
    
}
