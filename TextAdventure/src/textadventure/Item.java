/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textadventure;

/**
 *
 * @author Elisabeth
 */
public class Item {
    private String name;
    private String description;
    private int code;
    
    //Default constructor
    Item(){
        name = null;
        description = null;
        code = 0;
    }
    
    //Constructor
    Item(String name, String description, int code){
        this.name = name;
        this.description = description;
        //possibility change to be a dictionary with static codes
        this.code = code;
    }
    
    //Getters and setters
    public void set_name(String name){
        this.name = name;
    }
    
    public void set_description(String description){
        this.description = description;
    }
    
    public String get_name(){
        return name;
    }
    
    public String get_description(){
        return description;
    }
    
    public int get_code(){
        return code;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
