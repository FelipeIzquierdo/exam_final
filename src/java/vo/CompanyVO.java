package vo;

import entity.Company;


public class CompanyVO {
    
    private String companyDescription;
    private Long companyId;
    private String companyName;
    private String companySymbol;
    private int marketId;
    private String nombreMarket;
    

    /**
     * @return the companyDescripcion
     */
    public String getCompanyDescripcion() {
        return companyDescription;
    }

    /**
     * @param companyDescription the companyDescripcion to set
     */
    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the companySymbol
     */
    public String getCompanySymbol() {
        return companySymbol;
    }

    /**
     * @param companySymbol the companySymbol to set
     */
    public void setCompanySymbol(String companySymbol) {
        this.companySymbol = companySymbol;
    }

    /**
     * @return the marketId
     */
    public int getMarketId() {
        return marketId;
    }

    /**
     * @param marketId the marketId to set
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    /**
     * @return the nombreMarket
     */
    public String getNombreMarket() {
        return nombreMarket;
    }

    /**
     * @param nombreMarket the nombreMarket to set
     */
    public void setNombreMarket(String nombreMarket) {
        this.nombreMarket = nombreMarket;
    }
    
    public Company toEntity(){
        Company entity = new Company();        
        entity.setCompany_name(this.getCompanyName());
        entity.setCompany_description(this.getCompanyDescripcion());
        entity.setCompany_symbol(this.getCompanySymbol());
        entity.setMarket_id(this.getMarketId());        
        return entity;
    }
    
}
