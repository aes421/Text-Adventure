/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textadventure;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Elisabeth
 */
public class TextAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Setup locations
        Location l1 = new Location("A dark and dreary hallway", "Hallway");
        Location l2 = new Location("A small study off the hallway", "Study");
        Location l3 = new Location("A room filled with model boats", "Hobby Room");
        
        //setup exits for each location
        Exit e1 = new Exit(Exit.WEST, l2);
        Exit e2 = new Exit(Exit.EAST, l3);
        Exit e3 = new Exit(Exit.EAST, l1);
        Exit e4 = new Exit(Exit.WEST, l1);

        l1.add_exit(e1);
        l1.add_exit(e2);
        l2.add_exit(e3);
        l3.add_exit(e4);
        
        //Add items to bag
        Item i1 = new Item("Map", "A tool to give directions.", 1);
        Item i2 = new Item("Sword", "A weapon to use in a fight.", 2);
        
        Bag bag = new Bag();
        bag.add_item(i1);
        bag.add_item(i2);
        
        //setup current location and display
        Scanner reader = new Scanner(System.in);
        Location currentLocation = l1;        
        
        
        while(true){
            showLocation(currentLocation);
            System.out.println("What would you like to do?");
            String command = reader.next();
            command = command.toUpperCase();
            if ("NORTH".equals(command) || "SOUTH".equals(command) || "EAST".equals(command) || "WEST".equals(command)){
                currentLocation = moveLocation(currentLocation,command);
            }
            if ("BAG".equals(command)){
                showBag(bag);
                selectItem(bag);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    static public void showBag(Bag b){
        int index = 1;
        System.out.println("Bag Contents");
        Iterator<Item> it = b.get_items().iterator();
        while (it.hasNext()){
            Item i = it.next();
            System.out.println(index+"\t\t"+i.get_name()+"\t\t"+i.get_description());
            index++;
        }
    }
    
    static public void selectItem(Bag b){
        Scanner reader = new Scanner(System.in);
        
        while(true){
            System.out.println("Select an item number or type 'e' for exit");
            String command = reader.next();   
            int index;
            try {
                index = Integer.parseInt(command);
                if (index < b.get_amount()){
                    Item i = b.select_item(index-1);
                    System.out.println("The item at index " + index + " is " + i);
                    return;
                }
                else{
                    System.out.println("You did not select a valid item.");
                }
            }
            catch (NumberFormatException e){
              command = command.toUpperCase();
              if ("EXIT".equals(command) || "E".equals(command))
              {
                    System.out.println("Exiting");
                    return;
              }      
               System.out.println("I'm not sure what you mean by" + command);
            }
        }
        
    }
  
    static public void showLocation(Location currentLocation){
        System.out.println("\n\nYou have entered the " + currentLocation.get_title());
        System.out.println(currentLocation.get_description());
        System.out.println("Available Exits:");
        System.out.println(currentLocation.get_exits());
    }
    
    static public Location moveLocation(Location currentLocation, String command){
        //System.out.println("Where would you like to move?");
        switch(command){
            case "NORTH":
                if (currentLocation.exit_exsists("NORTH")){
                    currentLocation = currentLocation.get_exit("NORTH");
                    //showLocation(currentLocation);
                }
                else{
                    System.out.println("Errr... there's no where to go that way.");
                }
                break;
            case "SOUTH":
                if (currentLocation.exit_exsists("SOUTH")){
                    currentLocation = currentLocation.get_exit("SOUTH");
                    //showLocation(currentLocation);
                }
                else{
                    System.out.println("Errr... there's no where to go that way.");
                }
                break;
            case "EAST":
                if (currentLocation.exit_exsists("EAST")){
                    currentLocation = currentLocation.get_exit("EAST");
                    //showLocation(currentLocation);
                }
                else{
                    System.out.println("Errr... there's no where to go that way.");
                }
                break;
            case "WEST":
                if (currentLocation.exit_exsists("WEST")){
                    currentLocation = currentLocation.get_exit("WEST");
                  //showLocation(currentLocation);
                }
                else{
                    System.out.println("Errr... there's no where to go that way.");
                }
                
        }
        return currentLocation;
    }
    
}
