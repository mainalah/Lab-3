import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    //create a scanner object
    Scanner s = new Scanner(System.in);
    //take the input
    System.out.println("Enter a number to count down or up: ");
    int number = s.nextInt();
    
    if (number <0)
    {
      //count up to 0
      while (number <=0)
      {
        System.out.println(number);
        number++;
      }

    }
    else{
      //count down to 0
      while (number>=0)
      {
        System.out.println(number);
        number--;
      }
    }
    System.out.println("Blast off!");
  }
}
 
  
    