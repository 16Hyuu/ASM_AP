/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo T460s
 */
public class DrinkTypes {
    public String drinktypeID;
    public String drinktypeName;

    public DrinkTypes() {
    }

    public DrinkTypes(String drinktypeID, String drinktypeName) {
        this.drinktypeID = drinktypeID;
        this.drinktypeName = drinktypeName;
    }

    public String getDrinktypeID() {
        return drinktypeID;
    }

    public void setDrinktypeID(String drinktypeID) {
        this.drinktypeID = drinktypeID;
    }

    public String getDrinktypeName() {
        return drinktypeName;
    }

    public void setDrinktypeName(String drinktypeName) {
        this.drinktypeName = drinktypeName;
    }
    
}
