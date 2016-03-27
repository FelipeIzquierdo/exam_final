package vo;

import entity.Market;

public class MarketVO {
    private String marketDescription;
    private Long marketId;
    private String marketName;
    private String marketNemo;

    /**
     * @return the marketDescription
     */
    public String getMarketDescription() {
        return marketDescription;
    }

    /**
     * @param marketDescription the marketDescription to set
     */
    public void setMarketDescription(String marketDescription) {
        this.marketDescription = marketDescription;
    }

    public Long getMarketId() {
        return marketId;
    }

    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }

    

    /**
     * @return the marketName
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * @param marketName the marketName to set
     */
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    /**
     * @return the marketNemo
     */
    public String getMarketNemo() {
        return marketNemo;
    }

    /**
     * @param marketNemo the marketNemo to set
     */
    public void setMarketNemo(String marketNemo) {
        this.marketNemo = marketNemo;
    }
    
    public Market toEntity(){
        Market entity = new Market();
        entity.setId(this.getMarketId());
        entity.setMarket_name(this.getMarketName());
        entity.setMarket_nemo(this.getMarketNemo());
        entity.setMarket_description(this.getMarketDescription());        
        return entity;        
    }
   
    
    
}
