/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage;

import Interface.Action;
import java.util.ArrayList;
import java.util.Scanner;
import Model.*;

public class DrinkTypeManage implements Action<DrinkTypes>{

    @Override
    public Object add(ArrayList<DrinkTypes> list) {
        DrinkTypes drinktype = new DrinkTypes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DrinkType ID : ");
        String drink_Type = sc.nextLine();
        drinktype.setDrinktypeID(drink_Type);
        System.out.println("Enter DrinkName : ");
        String drink_name = sc.nextLine();
        drinktype.setDrinktypeName(drink_name);
        return drinktype;
    }

    @Override
    public boolean edit(ArrayList<DrinkTypes> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DrinkType ID");
        String drink_type = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getDrinktypeID().equals(drink_type)){
                System.out.println("Enter DrinkType Name : ");
                String drinktypeName = sc.nextLine();
                list.get(i).setDrinktypeName(drinktypeName);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(ArrayList<DrinkTypes> list) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter DrinkType ID: ");
        String depID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getDrinktypeID().equals(depID)){
                System.out.println("Do you want to delete this DrinkType ID(Y/N) ? ");
                String choice = sc.nextLine();
                if(choice.equals("Y")){
                    list.remove(i);
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public void show(ArrayList<DrinkTypes> list) {
           System.out.printf("|%-10s|%-20s|%n", "ID", "Name");
        if (list.size() == 0) {
            System.out.println("Empty!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("|%-10s|%-20s|%n", list.get(i).getDrinktypeID(),list.get(i).getDrinktypeName());
            }
        }
    }

    @Override
    public void search(ArrayList<DrinkTypes> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DrinkType ID : ");
        String drinkTypeID = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDrinktypeID().equals(drinkTypeID)) {
                System.out.printf("|%-10s|%-20s|%n", "ID", "Name");
                System.out.printf("|%-10s|%-20s|%n", list.get(i).getDrinktypeID(), list.get(i).getDrinktypeName());
                return ;
            }else{
                System.out.println("Not Found");
            }
        }
    }
    
}
