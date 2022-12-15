
package Manage;

import java.util.Scanner;
import java.util.ArrayList;
import Interface.ActionDrink;
import Model.*;
public class DrinkManage implements ActionDrink<Drink, Order, DrinkTypes>{

    @Override
    public Object add(ArrayList<Drink> list, ArrayList<Order> list2, ArrayList<DrinkTypes> list3) {
        Drink drink = new Drink();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Drink ID : ");
        String DrinkID = sc.nextLine();
        drink.setDrinkID(DrinkID);
        System.out.println("Enter Drink Name : ");
        String DrinkName = sc.nextLine();
        drink.setDrinkName(DrinkName);
        System.out.println("Enter Drink Prices : ");
        String DrinkPrice = sc.nextLine();
        drink.setDrinkPrice(DrinkPrice);
        System.out.println("Enter Order ID : ");
        sc = new Scanner(System.in); 
        String OrderID = sc.nextLine();
        int countOrder = 0;
        for(int i=0;i<list2.size();i++){
            if(list2.get(i).getOrderID().equals(OrderID)){
                drink.setOrders(list2.get(i));
            }else{
                countOrder++;
            }
        }
        /*
        if(countOrder==list2.size()){
            System.out.println("Not Found ");
        }
*/
        System.out.println("Enter DrinkType ID : ");
        String drinkTypeID = sc.nextLine();
        int countDrinkType = 0; 
        for(int i=0;i<list3.size();i++){
            if(list3.get(i).getDrinktypeID().equals(drinkTypeID)){
                drink.setDrinktypes(list3.get(i));
            }else{
                countDrinkType++;
            }
        }
        /*
        if(countDrinkType==list3.size()){
            System.out.println("Not Found ");
        }
        */
        return drink;
    }

    @Override
    public boolean edit(ArrayList<Drink> list, ArrayList<Order> list2, ArrayList<DrinkTypes> list3) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Drink ID : ");
        String drinkID = sc .nextLine();
        System.out.println("");
        int count=0;
        System.out.println("____________________________________");
        System.out.println("|            Choose Functions         |");
        System.out.println("|___________________________________ |");
        System.out.println("|   [1]. Edit Drink Name               |");
        System.out.println("|   [2]. Edit Drink Price                 |");
        System.out.println("|   [3]. Edit DrinkTypes                |");
        System.out.println("|   [4]. Edit Order                       |");
        System.out.println("|   [5].              Exit                   |");
        int choice=0;
        for(int i=0;i<list.size();i++){
            sc = new Scanner(System.in);
            if(list.get(i).getDrinkID().equals(drinkID)){
                switch(choice){
                    case 1:
                        System.out.println("Enter Drink Name : ");
                        String drinkName = sc.nextLine();
                        list.get(i).setDrinkName(drinkName);
                        break;
                    case 2:
                        System.out.println("Enter Drink Prices : ");
                        String drinkPrices = sc.nextLine();
                        list.get(i).setDrinkPrice(drinkPrices);
                        break;
                    case 3: 
                        System.out.println("Enter DrinkTypes : ");
                        String drinktypeID = sc.nextLine();
                        int countDrink =0;
                        for(int j=0;j<list3.size();j++){
                            if(list3.get(i).getDrinktypeID().equals(drinktypeID)){
                                list.get(i).setDrinktypes(list3.get(i));
                            }else{
                                countDrink++;
                            }
                        }
                         if(countDrink==list3.size()){
                                System.out.println("Not Found");
                        }
                        break;
                    case 4:
                        System.out.println("Enter Order ID : ");
                        String orderID = sc.nextLine();
                        int countOrder = 0;
                        for(int j=0;j<list2.size();j++){
                            if(list2.get(i).getOrderID().equals(orderID)){
                                list.get(i).setOrders(list2.get(i));
                            }else{
                                countOrder++;
                            }
                        }
                        if(countOrder==list2.size()){
                            System.out.println("Not Found");
                        }
                   case 5:
                       System.exit(0);
                       break;
                }
                count++;
            }
        }
         if(count==0){
            System.out.println("Not Found ! ");
        }     
        return true;
    }

    @Override
    public boolean delete(ArrayList<Drink> list) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Drink ID: ");
        String drinkID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getDrinkID().equals(drinkID)){
                System.out.println("Do you want to delete this Drink (Y/N) ?");
                String choice = sc.nextLine();
                if(choice.equals("Y")){
                    list.remove(i);
                    return true;
                }else{  
                    return false;
                }
            }
        }
        System.out.println("Not Found ! ");
        return true;
    }

    @Override
    public void show(ArrayList<Drink> list) {
         System.out.printf("|%-10s|%-20s|%-30s|%-30s|%-30s|%n", "Drink_ID", "Drink_Name", "Drink_Prices",
                "DrinkTypes ", "Orders");
        System.out.printf("|%-10s|%-20s|%-30s|%-30s|%-30s|%n", "__________", "___________", "_________________",
                "_________________", "_____________________", "__________________");
        if(list.size()==0){
            System.out.println("Not Found");
        }else{
            for (int i = 0; i < list.size(); i++) {
            System.out.printf("|%-10s|%-20s|%-30s|%-30s|%-30s|%n", list.get(i).getDrinkID(),
                    list.get(i).getDrinkName(), list.get(i).getDrinkPrice(),
                    list.get(i).getDrinktypes().getDrinktypeName(), list.get(i).getOrders().getOrderName());
        }
        }
    }

    @Override
    public void search(ArrayList<Drink> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dirnk ID: ");
        String drinkID = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDrinkID().equals(drinkID)) {
                System.out.printf("|%-10s|%-20s|%-20s|%-10s|%-10s|%n", "ID", "Name", "Email",
                        "DrinkTypes", "Orders");
                System.out.printf("|%-10s|%-20s|%-20s|%-10s|%-10s|%n", list.get(i).getDrinkID(),
                        list.get(i).getDrinkName(), list.get(i).getDrinkPrice(),
                        list.get(i).getDrinktypes().getDrinktypeName(), list.get(i).getOrders().getOrderName());
            }else{
                System.out.println("Not Found ! Please Try Again: ");
            }
        }
    }

    @Override
    public Object add(ArrayList<Drink> list) {
        return null;
    }

    @Override
    public boolean edit(ArrayList<Drink> list) {
        return false;
    }
    
}
