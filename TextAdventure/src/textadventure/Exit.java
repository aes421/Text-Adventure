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
public class Exit {
    
    //Numerical encodings
    public static final int UNDEFINED = 0;
    public static final int NORTH = 1;
    public static final int SOUTH = 2;
    public static final int EAST = 3;
    public static final int WEST = 4;
    public static final int UP = 5;
    public static final int DOWN = 6;
    public static final int IN = 7;
    public static final int OUT = 8;
    
    
    // String codes	
	public static final String[] dirName = 
	{ 
		"UNDEFINED",
		"NORTH",
		"SOUTH",
		"EAST",
		"WEST",
		"UP",
		"DOWN",
		"IN",
		"OUT"
	};

  //Instance variables
  private Location leadsTo = null;
  private int direction;  
  //Name of the direction
  private String directionName;
  
  //Default Constructor
  public Exit(){
      leadsTo = null;
      direction = UNDEFINED;
      directionName = dirName[UNDEFINED];
  }
  
  //Constructor
  public Exit(int d, Location l){
      leadsTo = l;
      direction = d;
      directionName = dirName[d];
  }
  
  //Getters and setters
  public Location getLeadsTo(){
      return leadsTo;
  }
  
  public void setLeadsTo(Location l){
      leadsTo = l;
  }
  
  public int getDirection(){
      return direction;
  }
  
  public void setDirection(int d){
      direction = d;
  }
  
  public String getDirectionName(){
      return directionName;
  }
  
  public void setDirectionName(String s){
      directionName = s;
  }
  
  
    @Override
  public String toString(){
      return directionName;
  }
}
