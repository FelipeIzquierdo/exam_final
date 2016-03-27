/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import vo.MarketVO;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LOPEZ
 */
@Entity
@Table(name = "market")
public class Market implements Serializable {

   // private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long market_id;
    private String market_description;
    private String market_name;
    private String market_nemo;

    public Long getId() {
        return getMarket_id();
    }

    public void setId(Long id) {
        this.setMarket_id(id);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getMarket_id() != null ? getMarket_id().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Market)) {
            return false;
        }
        Market other = (Market) object;
        if ((this.getMarket_id() == null && other.getMarket_id() != null) || (this.getMarket_id() != null && !this.market_id.equals(other.market_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.NewEntity[ id=" + getMarket_id() + " ]";
    }

    /**
     * @return the market_id
     */
    public Long getMarket_id() {
        return market_id;
    }

    /**
     * @param market_id the market_id to set
     */
    public void setMarket_id(Long market_id) {
        this.market_id = market_id;
    }

    /**
     * @return the market_description
     */
    public String getMarket_description() {
        return market_description;
    }

    /**
     * @param market_description the market_description to set
     */
    public void setMarket_description(String market_description) {
        this.market_description = market_description;
    }

    /**
     * @return the market_name
     */
    public String getMarket_name() {
        return market_name;
    }

    /**
     * @param market_name the market_name to set
     */
    public void setMarket_name(String market_name) {
        this.market_name = market_name;
    }

    /**
     * @return the market_nemo
     */
    public String getMarket_nemo() {
        return market_nemo;
    }

    /**
     * @param market_nemo the market_nemo to set
     */
    public void setMarket_nemo(String market_nemo) {
        this.market_nemo = market_nemo;
    }

    public MarketVO toVO() {
        MarketVO marketVO = new MarketVO();
        marketVO.setMarketDescription(this.getMarket_description());
        marketVO.setMarketId(this.getMarket_id());
        marketVO.setMarketName(this.getMarket_name());
        marketVO.setMarketNemo(this.getMarket_nemo());
        return marketVO;
    }

    

}
