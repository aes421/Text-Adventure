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
public class Character {
    
    //instance variables
    private String name;
    private int left_equip;
    private int right_equip;
    private int armor;
    private int helmet;
    private int footwear;
    
    //Default constructor
    Character(){
        name = null;
        left_equip = 0;
        right_equip = 0;
        armor = 0;
        helmet = 0;
        footwear = 0;
    }
    
    //Contructor
    Character(String name, int left_equip, int right_equip, int armor, int
            helmet, int footwear){
        this.name = name;
        this.left_equip = left_equip;
        this.right_equip = right_equip;
        this.armor = armor;
        this.helmet = helmet;
        this.footwear = footwear;
    }
    
    //Getters and setters
    public void set_name(String name){
    this.name = name;
    }
    
    public void set_left_equip(int left_equip){
        this.left_equip = left_equip;
    }
    
    public void set_right_equip(int right_equip){
        this.right_equip = right_equip;
    }
    
    public void set_armor(int armor){
        this.armor = armor;
    }
    
    public void set_helmet (int helmet)
    {
        this.helmet = helmet;
    }
    
    public void set_footwear (int footwear){
        this.footwear = footwear;
    }
    
    public String get_name(){
        return name;
    }
    
    public int get_left_equip(){
        return left_equip;
    }
    
    public int get_right_equip(){
        return right_equip;
    }
    
    public int get_armor(){
        return armor;
    }
    
    public int get_helmet(){
        return helmet;
    }
    
    public int get_footwear(){
        return footwear;
    }
}

