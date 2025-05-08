/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.enums;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author alumnog
 */
public enum Status {
    @SerializedName("1")
            CLEAR,
    @SerializedName("2")
            CLOUDY,
    @SerializedName("3")
            SNOW,
    @SerializedName("4")
            RAIN
    
    
}
