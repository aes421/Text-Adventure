/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textadventure;

import java.util.ArrayList;

/**
 *
 * @author Elisabeth
 */
public class Bag {
    private ArrayList items;
    
    
    //Default Constructor
    Bag(){
    items = new ArrayList();
    }
    
    //getter and setter
    public void add_item(Item item){
        items.add(item);
    }
    
    public Item select_item(int index){
        return (Item) items.get(index);
    }
    
    public ArrayList get_items(){
        return (ArrayList) items.clone();
    }
    
    public int get_amount(){
        return items.size();
    }
}
