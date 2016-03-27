/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import vo.DateVO;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class Date implements Serializable {

   // private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long date_id;
    private int date_day;
    private int date_month;
    private java.sql.Date date_string;
    private int date_year;

    @OneToMany(mappedBy = "date")
    private Collection<Quote> quoteCollection;

    public Long getId() {
        return getDate_id();
    }

    public void setId(Long id) {
        this.setDate_id(id);
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getDate_id() != null ? getDate_id().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Date)) {
            return false;
        }
        Date other = (Date) object;
        if ((this.getDate_id() == null && other.getDate_id() != null) || (this.getDate_id() != null && !this.date_id.equals(other.date_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Date[ id=" + getDate_id() + " ]";
    }

    /**
     * @return the date_id
     */
    public Long getDate_id() {
        return date_id;
    }

    /**
     * @param date_id the date_id to set
     */
    public void setDate_id(Long date_id) {
        this.date_id = date_id;
    }

    /**
     * @return the daet_Day
     */
    public int getDate_day() {
        return date_day;
    }

    /**
     * @param daet_Day the daet_Day to set
     */
    public void setDate_day(int daet_Day) {
        this.date_day = daet_Day;
    }

    /**
     * @return the date_month
     */
    public int getDate_month() {
        return date_month;
    }

    /**
     * @param date_month the date_month to set
     */
    public void setDate_month(int date_month) {
        this.date_month = date_month;
    }

    /**
     * @return the date_string
     */
    public java.sql.Date getDate_string() {
        return date_string;
    }

    /**
     * @param date_string the date_string to set
     */
    public void setDate_string(java.sql.Date date_string) {
        this.date_string = date_string;
    }

    /**
     * @return the date_year
     */
    public int getDate_year() {
        return date_year;
    }

    /**
     * @param date_year the date_year to set
     */
    public void setDate_year(int date_year) {
        this.date_year = date_year;
    }

    public DateVO toVO() {
        
        DateVO dateVO = new DateVO();
        dateVO.setDateDay(this.getDate_day());
        dateVO.setDateId(this.getDate_id());
        dateVO.setDateMonth(this.date_month);        
        dateVO.setDateString(this.getDate_string());
        dateVO.setDate_year(this.getDate_year());
        return dateVO;
    }

    

    public java.sql.Date StringtoDate(String strFecha) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date fecha = null;

        try {

            java.util.Date parsed = format.parse(strFecha);
            fecha = new java.sql.Date(parsed.getTime());

        } catch (ParseException ex) {

            ex.printStackTrace();
        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return fecha;
    }

}
