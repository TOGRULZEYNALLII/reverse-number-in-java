import java.util.Scanner;

public class Main {
    public static void main(String[] arguments){
            int number ;
            System.out.println("enter the number:");
            Scanner scanner=new Scanner(System.in);
            number=scanner.nextInt();
            int sum=0;
          while (number>0){
              int lastdg=number % 10;
              sum=sum*10+lastdg;
              number=number/10;
          }
          System.out.println(sum);
    }
}
