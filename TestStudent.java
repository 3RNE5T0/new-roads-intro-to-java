import java.util.Scanner;

public class TestStudent{

  public static void main(String[] args){
  
    //set up for user input
    Scanner input = new Scanner(System.in);
    
    //prompt the user for input
    System.out.println("Enter Your Name: ");
  
    //get user input
    String name = input.next();
    
    System.out.println("Your name is... " + name);
    
    //prompt user for graduation year
    System.out.println("What year do graduate?");
    
    //get user input of year
    int graduationyear = input.nextInt();
    
    System.out.println("You graduate in... " + graduationyear);
    
    String classes = "";
    
    if(graduationyear == 17){
      classes = "Sophomore";
    }
    else if(graduationyear == 18){
      classes = "Junior";
    }
    else if(graduationyear == 19){
      classes = "Senior";
    }
    else
      classes = "Freshman";
    
    
    System.out.println("Your are a " + classes);
    
  }
  
}