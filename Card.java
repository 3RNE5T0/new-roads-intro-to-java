public class Card{
  
  //declare the properties
  private String color;
  private String suit;
  private char rank;
  
  //constructor - method to make this object
  public Card(){
    color = "red";
    suit = "diamond";
    rank = 'A';
   
  }
  //the followig are mutators
  public String getColor(){
    return color;
  }
  
  public void setColor(String newColor){
    color = newColor;
  }
  
  public String getSuit(){
    return suit;
  }
  
  public void setSuit(String newSuit){
    suit = newSuit;
  }
 
  public char getRank(){
    return rank;
  }
  
  public void setRank(char newRank){
    rank = newRank;
  }
  
  
  // prints out the object
  public String toString(){
    return color + " " + suit + " " + rank;
  }
  
  
}//end of class