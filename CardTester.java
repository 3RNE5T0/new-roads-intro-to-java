//this the method to test the card object
public class CardTester{
  
  //main method for testing
  public static void main(String[] args){
  
    /*Card card = new Card("red", "diamonds", '8');
    System.out.println(card);
    */
   /* RedCard rCard = new RedCard();
   rCard.setSuit("diamonds");
   rCard.setRank('3');
    System.out.println(rCard);
    */
    BlackCard rCard = new BlackCard();
    rCard.setSuit("spades");
    rCard.setRank('7');
    System.out.println(rCard);
   /* Card c = new Card();
   
    c.setColor("Blood Red");
    
    c.setSuit("Of Hearts");
    
    c.setRank('A');
    
    //print out card
    System.out.println(c.toString());
   */
   
  }
  
  
}//end of class