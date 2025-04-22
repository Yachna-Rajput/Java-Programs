import java.util.Scanner;
public class Years {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int Year = sc.nextInt();
        if(Year % 4 == 0  ){
            System.out.println("This is the Leap year");
        }
        else{
            System.out.println("This is not leap year");

        }
        }


    }

