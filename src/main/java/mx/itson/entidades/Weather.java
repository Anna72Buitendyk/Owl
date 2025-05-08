/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.entidades;

import java.util.List;
import mx.itson.enums.Status;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author alumnog
 */
public class Weather {
    private String city;
    private int temperature;
    private float humidity;
    private Status status;
    @SerializedName("wind_speed")
    private int windSpeed;
    private List<Forecast> forecast;

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the humidity
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(float humidity) {
        this.humidity = humidity;
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

    /**
     * @return the windSpeed
     */
    public int getWindSpeed() {
        return windSpeed;
    }

    /**
     * @param windSpeed the windSpeed to set
     */
    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * @return the forecast
     */
    public List<Forecast> getForecast() {
        return forecast;
    }

    /**
     * @param forecast the forecast to set
     */
    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
    
    /**
     * 
     * @param json Jason a deserializar al objecto weather
     * @return Retorna el objecto weather de clase Weather, deserializada de String de tipo json
     */
    public static Weather deserialize(String json){
        Weather weather = new Weather();
        try{
            Gson gson = new Gson();
            weather = gson.fromJson(json, Weather.class);
        }
        catch( Exception ex){
            System.err.println("Error" + ex.getMessage());
        }
        return weather;
    }
}
