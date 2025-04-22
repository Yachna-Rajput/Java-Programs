import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 10 ; i>=1;i--){
            System.out.printf("%d x %d = %d \n ", n,i,n*i );
        }
        
    }
}
