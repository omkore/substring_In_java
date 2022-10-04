import java.util.*;

public class Main{
  public static void main(String [] args){
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter your Sentence : ");
    String sent =  sc.nextLine();
    System.out.println("Enter your Letter : ");
    String letter =  sc.nextLine();
    letter.toString();
int index =  sent.indexOf(letter);
    System.out.println(index);
    String result =  sent.substring(index);
System.out.println(result);

  }
}
