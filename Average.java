import java.util.Scanner;

public class Average{

  public static void main(String[] args){
         
    Scanner input = new Scanner(System.in);
    
    //prompt the user
    System.out.println("Enter 3 numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();
    
    double average = (num1 + num2 + num3)/3;
    
    System.out.println("This is the average " + average);
     
  }
       
}