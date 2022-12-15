/*
 * Click nbfs://nbhost/SystemFileSystem/Hemplates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Hemplates/Classes/Interface.java to edit this template
 */
package Interface;
import java.util.ArrayList;
/**
 *
 * @author Lenovo T460s
 */
public interface Action<H> {
    public Object add(ArrayList<H> list);
    public boolean edit(ArrayList<H> list);
    public boolean delete(ArrayList<H> list);
    public void show(ArrayList<H> list);
    public void search(ArrayList<H> list);
}
