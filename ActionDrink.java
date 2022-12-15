/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import java.util.ArrayList;
public interface ActionDrink<H, H1, H2> extends Action<H>{
     public Object add(ArrayList<H> list , ArrayList<H1> list2, ArrayList<H2> list3);
    public boolean edit(ArrayList<H> list , ArrayList<H1> list2, ArrayList<H2> list3);
    public boolean delete(ArrayList<H> list );
    public void show(ArrayList<H> list );
    public void search(ArrayList<H> list );
}
