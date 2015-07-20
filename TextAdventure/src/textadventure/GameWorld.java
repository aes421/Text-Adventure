/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textadventure;

import java.io.Serializable;

/**
 *
 * @author Elisabeth
 */
public class GameWorld implements Serializable{
    
    //The player's character ingo
    private Character character;
    
    //The player's bag
    private Bag bag;
    
    // The current location of the player
    private Location currentLocation;

    // Character width for descriptions
    private int charWidth;

    // Output stream for gaming system
    transient private WidthLimitedOutputStream output;
    
    // GameWorld constructor
	public GameWorld()
	{
		// The default location of a player isn't known
		currentLocation = null;
                
                character = null;

		// By default, use standard output
		setOutputStream (System.out, 80);
	}
        
        // GameWorld constructor
	public GameWorld(int characterWidth )
	{
		// Call default constructor
		this();

		charWidth = characterWidth;		
	}

	/** Returns the current location of the player */
	public Location getCurrentLocation()
	{
		return currentLocation;
	}

	/** Assigns a new location to the current location of the player */
	public void setCurrentLocation(Location newLocation)
	{
		currentLocation = newLocation;
	}

        
        public Character getCharacter(){
            return character;
        }
        
        public void setCharacter(Character character){
            this.character = character;
        }
        
        public Bag getBag(){
            return bag;
        }
        
        public void setBag(Bag bag){
            this.bag = bag;
        }
        
        /** Sets the output stream for the gaming systewm */
	public void setOutputStream(OutputStream out, int width)
	{
		output = new WidthLimitedOutputStream(out, width) ;
	}
    
}
