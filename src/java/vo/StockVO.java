package vo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class StockVO {
    private int companyId;
    private String strock_description;
    private int stock_id;
    private String stockName;
    private String stockSymbol;
    
    private String nombre_company;

    /**
     * @return the companyId
     */
    public int getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId the companyId to set
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    /**
     * @return the strock_description
     */
    public String getStrock_description() {
        return strock_description;
    }

    /**
     * @param strock_description the strock_description to set
     */
    public void setStrock_description(String strock_description) {
        this.strock_description = strock_description;
    }


    /**
     * @return the stockSymbol
     */
    public String getStockSymbol() {
        return stockSymbol;
    }

    /**
     * @param stockSymbol the stockSymbol to set
     */
    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    /**
     * @return the stock_id
     */
    public int getStock_id() {
        return stock_id;
    }

    /**
     * @param stock_id the stock_id to set
     */
    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;
    }

    /**
     * @return the nombre_company
     */
    public String getNombre_company() {
        return nombre_company;
    }

    /**
     * @param nombre_company the nombre_company to set
     */
    public void setNombre_company(String nombre_company) {
        this.nombre_company = nombre_company;
    }

    /**
     * @return the stockName
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * @param stockName the stockName to set
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    
}
