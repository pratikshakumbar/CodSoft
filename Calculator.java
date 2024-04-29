
import java.util.Scanner;
public class Calculator {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks of Subject 1 :");
    int m1=sc.nextInt();
    System.out.println("Enter the marks of Subject 2 :");
    int m2=sc.nextInt();
    System.out.println("Enter the marks of Subject 3 :");
    int m3=sc.nextInt();
    System.out.println("Enter the marks of Subject 4 :");
    int m4=sc.nextInt();
    int Total=m1+m2+m3+m4;
   Double AvgPercentage=(double) (Total/4);
   System.out.println("The total marks is" +Total);
    System.out.println("The Average Percentage is" +AvgPercentage );
   char grade;
   if(AvgPercentage>90){
    System.out.println("The obtained Grade is A");
   } else if (AvgPercentage>80) {
    System.out.println("The obtained Grade is B");
   }else if (AvgPercentage>70) {
    System.out.println("The obtained Grade is C");}
    else{
      System.out.println("The obtained Grade is D");
    }
    }
}
