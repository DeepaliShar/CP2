import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            int count=0;
            for(int i=2;i<n;i++){
                if(n%i==0)
                    count++;
                    break;
            }
            if(count==0)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
    }
    
}
