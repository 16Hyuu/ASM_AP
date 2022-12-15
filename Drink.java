/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo T460s
 */
public class Drink {
        public String drinkID;
        public String drinkName;
        public String drinkPrice;
        public DrinkTypes drinktypes;
        public Order orders;
        public Drink(){
            super();
        }

    public Drink(String drinkID, String drinkName, String drinkPrice, DrinkTypes drinktypes, Order orders) {
        this.drinkID = drinkID;
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinktypes = drinktypes;
        this.orders = orders;
    }

    public String getDrinkID() {
        return drinkID;
    }

    public void setDrinkID(String drinkID) {
        this.drinkID = drinkID;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(String drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public DrinkTypes getDrinktypes() {
        return drinktypes;
    }

    public void setDrinktypes(DrinkTypes drinktypes) {
        this.drinktypes = drinktypes;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }
        
}
