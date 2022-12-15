 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Manage.*;
import java.util.ArrayList;
import Model.*;
import java.util.Scanner;
import Interface.Action;
public class Main {
    public static void main(String[] args) {
            //manage
            Order order1 = new Order("HaNoi", "Pham Cong Huy", "Stupid");
            Order order2 = new Order("HaNoi 2", "Pham Cong Huy 2", "Stupid 2");
            
            DrinkTypes drinkTypes = new DrinkTypes("123", "ThangLong");
            DrinkTypes drinkTypes1 = new DrinkTypes("1234", "ThangLong1234");

            Drink drink1 = new Drink("1", "Type1", "1000.000", drinkTypes, order1);
            Drink drink2 = new Drink("2", "Type2", "1000.000", drinkTypes1, order2);

            OrderManage ORDM = new OrderManage();
            ArrayList<Order> orderlist = new ArrayList<Order>();
            
            DrinkTypeManage DRTM = new DrinkTypeManage();
            ArrayList<DrinkTypes> drinktypelist = new ArrayList<DrinkTypes>();
            
            DrinkManage DRM =new DrinkManage();
            ArrayList<Drink> drinklist = new ArrayList<Drink>();
            
            orderlist.add(order1);
            orderlist.add(order2);
            
            drinktypelist.add(drinkTypes1);
            drinktypelist.add(drinkTypes);
            
            drinklist.add(drink1);
            drinklist.add(drink2);
            
            while(true){
            System.out.println("||||  Welcome To  Drink Management System              ");
            System.out.println("||||        [1]   Order Manage                                   ");
            System.out.println("||||        [2]   DrinkType Manage                                        ");
            System.out.println("||||        [3]   Drink Manage                                     ");
            System.out.println("||||        [4]   Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number : ");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    boolean checkorder =true;
                    int orderchoose=0;
                    while(true){
                        System.out.println("________________________________________________________________");
                        System.out.println("||                                                                           ");
                        System.out.println("||            Order Management System                ");
                        System.out.println("||      [1]   Add Order                                        ");
                        System.out.println("||      [2]   Edit Order                                         ");
                        System.out.println("||      [3]   Delete Order                                      ");
                        System.out.println("||      [4]   Show Order                                       ");
                        System.out.println("||      [5]   Search Order                                      ");
                        System.out.println("||      [6]   Back Home                                                ");
                        System.out.println("||                                                                            ");
                        System.out.println("________________________________________________________________");
                        System.out.println("Enter Number : ");
                        orderchoose = sc.nextInt();
                        
                        switch(orderchoose){
                            case 1:
                                orderlist.add((Order) ORDM.add(orderlist));
                                break;
                            case 2:
                                ORDM.edit(orderlist);
                                break;
                            case 3:
                                ORDM.delete(orderlist);
                                break;
                            case 4:
                                ORDM.show(orderlist);
                                break;
                            case 5:
                                ORDM.search(orderlist);
                                break;
                            case 6:
                                checkorder=false;
                                break;
                            default:
                                System.out.println("Please Try again ! ");
                                break;
                        }
                        if(checkorder==false){
                            break;
                        }
                    }
                    break;
                case 2: 
                    boolean checkDrinktype = true;
                    int chooseDrinktype=0;
                    while(true){
                        System.out.println("_______________________________________________________________");
                        System.out.println("||                                                                           ");
                        System.out.println("||            DrinkType Management System                      ");
                        System.out.println("||      [1]   Add DrinkType                                             ");
                        System.out.println("||      [2]   Edit DrinkType                                              ");
                        System.out.println("||      [3]   Delete DrinkType                                          ");
                        System.out.println("||      [4]   Show DrinkType                                           ");
                        System.out.println("||      [5]   Search DrinkType                                         ");
                        System.out.println("||      [6]   Back                                                        ");
                        System.out.println("||                                                                          ");
                        System.out.println("_______________________________________________________________");
                        System.out.println("Enter Number : ");
                        chooseDrinktype=sc.nextInt();
                        switch(chooseDrinktype){
                            case 1:
                                drinktypelist.add((DrinkTypes) DRTM.add(drinktypelist));
                                break;
                            case 2:
                                DRTM.edit(drinktypelist);
                                break;
                            case 3:
                                DRTM.delete(drinktypelist);
                                break;
                            case 4:
                                DRTM.show(drinktypelist);
                                break;
                            case 5:
                                DRTM.search(drinktypelist);
                                break;
                            case 6:
                                checkDrinktype=false;
                                break;
                            default:
                                System.out.println("Please Try Again ! ");
                                break;
                        }
                        if(checkDrinktype==false){
                            break;
                        }
                    }
                     break;
                
                case 3:
                    boolean checkDrink=true;
                    int chooseDrink = 0;
                    while(true){
                         System.out.println("___________________________________________________________");
                        System.out.println("||                                                                                         ");
                        System.out.println("||            Drink Management System                                   ");
                        System.out.println("||      [1]   Add Drink                                                          ");
                        System.out.println("||      [2]   Edit Drink                                                           ");
                        System.out.println("||      [3]   Delete Drink                                                       ");
                        System.out.println("||      [4]   Show Drink                                                        ");
                        System.out.println("||      [5]   Search Drink                                                        ");
                        System.out.println("||      [6]   Back                                                                        ");
                        System.out.println("||                                                                                          ");
                        System.out.println("___________________________________________________________");
                        System.out.println("Enter Number : ");

                        chooseDrink = sc.nextInt();
                        switch(chooseDrink){
                            case 1:
                                drinklist.add((Drink) DRM.add(drinklist, orderlist, drinktypelist));
                                break;
                            case 2:
                                DRM.edit(drinklist,orderlist,drinktypelist);
                                break;
                            case 3:
                                DRM.delete(drinklist);
                                break;
                            case 4:
                                DRM.show(drinklist);
                                break;
                            case 5:
                                DRM.search(drinklist);
                                break;
                            case 6:
                                checkDrink=false;
                                break;
                            default:
                                System.out.println("Please Try Again : ");
                                break;
                        }
                        if(checkDrink==false){
                            break;
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
                
        }
    }
}
