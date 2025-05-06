/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.entidades;

import java.util.Date;
import mx.itson.enums.Status;

/**
 *
 * @author alumnog
 */
public class Forecast {
    private Date date;
    private int maxTemperature;
    private int minTemperature;
    private Status status;

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the maxTemperature
     */
    public int getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * @param maxTemperature the maxTemperature to set
     */
    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    /**
     * @return the minTemperature
     */
    public int getMinTemperature() {
        return minTemperature;
    }

    /**
     * @param minTemperature the minTemperature to set
     */
    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}
