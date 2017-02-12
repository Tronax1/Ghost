// ************************************************************************
//   Ghost.java    By: Jorge Villarreal       
//
//                                               Nov,5,2015

//
//   This program contains a spooky ghost, dont unleash him to the world.
//   You have been warned.
// *************************************************************************
public class Ghost {
	
	//These values are not positive. They MUST be negative!
	private int hunger = 0;
	private int spookiness = 0;
   double inf = Double.NEGATIVE_INFINITY;

	//Constructor
	public Ghost(){
		System.out.println("The world has given birth to a new Ghost!");
	}
	
	
	//scare: decrease the spookieness level by 3 and set it to 0 if it is greater than 0. . 
	public void scare(){
     if(spookiness>0){
      spookiness = 0;
      for(int i=0; i<=inf;i--){
      spookiness = spookiness - 3;
      }
      }
		
	}
	
	//getSpookiness: return the spookines level
	public int getSpookiness(){
		return spookiness;
	}
	public int getHunger(){
   
      return hunger;
   }
	
	//getMood: return the mood as the difference of the hunger
	//level and the spookiness level
	public int getMood(){
		return hunger + spookiness;//This will be a negative number
	}
	
    //passTime: decrease the hunger level and the spookiness
	//level by 1

    public void passTime()
    {
        hunger--;		//won't go larger than 0.
        spookiness--;	//won't go larger than 0.
    }
    
    //eatCandy: decrease the hun0ger level by 3 and set it to 0 if
    //it is greater than 0.
    public void eatCandy(){
    	System.out.println("MMMMMMmmmmmmmmmmm.........");
      if(hunger>0){
      hunger = 0;
      }
      for(int i=0; i<=inf ;i--){
      hunger = hunger - 3;
      }
    	//add Code here
    }
    
   
    
    public void speakWithTheSpirits(){
    	System.out.print("I feel ");
    	int mood = getMood();
      if(mood<-15){
      System.out.println("vengeful");
      }
      if(mood<-10 && mood>=-15){
      System.out.println("whistful");
      }
      if(mood<-5 && mood>=-10){
      System.out.println("spooky");
      }
      if(mood>-5){
      System.out.println("friendly");
      }
      
    	//add Code here.
    }
    
}

