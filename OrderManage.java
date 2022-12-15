/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage;

import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
public class OrderManage implements Action<Order>{

    @Override
    public Object add(ArrayList<Order> list) {
        Order order = new Order();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Order ID : ");
        String orderID = sc.nextLine();
        order.setOrderID(orderID);
        System.out.println("Enter OrderName : ");
        String orderName = sc.nextLine();
        order.setOrderName(orderName);
        System.out.println("Enter Order Description : ");
        String orderDes = sc.nextLine();
        order.setOrderDes(orderDes);
        return order;
    }

    @Override
    public boolean edit(ArrayList<Order> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Order ID : ");
        String orderID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getOrderID().equals(orderID)){
                System.out.println("Enter Order Name: ");
                String orderName = sc.nextLine();
                System.out.println("Enter Order Description: ");
                String orderDes = sc.nextLine();
                list.get(i).setOrderName(orderName);
                list.get(i).setOrderDes(orderDes);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(ArrayList<Order> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Order ID : ");
        String orderID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getOrderID().equals(orderID)){
                System.out.println("Do you want to delete (Y/N) : ");
                String choice = sc.nextLine();
                if(choice.equals("Y")){
                    list.remove(i);
                     return true;
                }
            }
        }
        return false;
    }

    @Override
    public void show(ArrayList<Order> list) {
         System.out.printf("|%-10s|%-20s|%-20s|%n", "orderID", "orderName", "orderDes");
        if(list.size()==0){
            System.out.println("Empty ! ");
        }else{
            for(int i=0;i<list.size();i++){
                System.out.printf("|%-10s|%-20s|%-20s|%n",list.get(i).getOrderID(),
                        list.get(i).getOrderName(),list.get(i).getOrderDes());
            }
        }
       
    }

    @Override
    public void search(ArrayList<Order> list) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter order ID : ");
        String posID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getOrderID().equals(posID)){
                System.out.println("order ID : " + list.get(i).getOrderID());
                System.out.println("order Name : " + list.get(i).getOrderName());
                System.out.println("order Des : " + list.get(i).getOrderDes());
            }else{
                System.out.println("Not Found");
            }
        }
    }
    
}
