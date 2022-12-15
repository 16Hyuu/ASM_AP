/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo T460s
 */
public class Order {
    public String orderID;
    public String orderName;
    public String orderDes;

    public Order() {
    }

    public Order(String orderID, String orderName, String orderDes) {
        this.orderID = orderID;
        this.orderName = orderName;
        this.orderDes = orderDes;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderDes() {
        return orderDes;
    }

    public void setOrderDes(String orderDes) {
        this.orderDes = orderDes;
    }
    
    
}
