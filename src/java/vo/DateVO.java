package vo;


import entity.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class DateVO {
    
    private int dateDay;
    private Long dateId;
    private int dateMonth;
    private java.sql.Date dateString;
    private int date_year;

    /**
     * @return the dareDay
     */
    public int getDateDay() {
        return dateDay;
    }

    /**
     * @param dateDay the dareDay to set
     */
    public void setDateDay(int dateDay) {
        this.dateDay = dateDay;
    }

    public Long getDateId() {
        return dateId;
    }

    public void setDateId(Long dateId) {
        this.dateId = dateId;
    }

    

    /**
     * @return the dateMonth
     */
    public int getDateMonth() {
        return dateMonth;
    }

    /**
     * @param dateMonth the dateMonth to set
     */
    public void setDateMonth(int dateMonth) {
        this.dateMonth = dateMonth;
    }

    /**
     * @return the dateString
     */
    public java.sql.Date getDateString() {
      
        return dateString;
    }

    /**
     * @param dateString the dateString to set
     */
    public void setDateString(java.sql.Date dateString) {
        this.dateString = dateString;
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
    
    public Date toEntity(){
        Date entity = new Date();        
        entity.setDate_id(this.getDateId());
        entity.setDate_day(this.getDateDay());
        entity.setDate_month(this.getDateMonth());
        entity.setDate_year(this.getDate_year());
        entity.setDate_string(this.getDateString());
        return entity;
    }
}
