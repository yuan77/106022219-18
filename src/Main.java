import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int counter=1;
        int sum=0;
        while(n<0)
            n=in.nextInt();
        while(counter<=n)
        {
            sum += counter;
            counter++;
        }
        System.out.print(sum);
    }
}
