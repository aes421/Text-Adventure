/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textadventure;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Elisabeth
 */
public class Location {
    
    //Instance variables
    private String description;
    private String title;
    private ArrayList exits;
    
    //Default Constructor
    Location(){
        description = "A strange, bleak location";
        title = "location";
        exits = new ArrayList();
    }
    
    //Constructor
    Location(String d, String t ){
        description = d;
        title = t;
        exits = new ArrayList();
    }
    
    //Getters and setters
    public String get_description(){
        return description;
    }
    
    public void set_description(String s){
        description = s;
    }
    
    public String get_title(){
        return title;
    }
    
    public void set_title(String t){
        title = t;
    }
    
    //add an exit or delete an exit from the ArrayList
    public void add_exit(Exit e){
        exits.add(e);
    }
    
    public void delete_exit(){
        if (exits.size() >= 1){
            int last = exits.size() - 1;
            exits.remove(last);
        }
    }
    
    //get exits
    public ArrayList get_exits(){
        return (ArrayList) exits.clone();
    }
    
    public Location get_exit(String direction){
        Iterator<Exit> it = exits.iterator();
        while (it.hasNext()){
            Exit e = it.next();
            if (e.getDirectionName().equals(direction)){
                return e.getLeadsTo();
            }
        }
        return new Location();
    }
    
    //clear all exits from the room
    public void clear_exits(){
        exits.clear();
    }
    
    public boolean exit_exsists(String direction){
        Iterator<Exit> it = exits.iterator();
        while (it.hasNext()){
            Exit e = it.next();
            if (e.getDirectionName().equals(direction)){
                return true;
            }
        }
    return false;
    }
    
    @Override
    public String toString(){
        return title;
    }
}
