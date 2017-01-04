//this the method to test the card object
public class CardTester{
  
  //main method for testing
  public static void main(String[] args){
  
   Card c = new Card();
   
    c.setColor("Red Velvet");
    
    c.setSuit("Of Hearts");
    
    c.setRank('2');
    
    //print out card
    System.out.println(c.toString());
    
    
  }
  
  
}//end of class