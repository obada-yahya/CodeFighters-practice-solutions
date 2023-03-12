import java.util.Scanner;
public class Obada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0)
        {
            int n = scan.nextInt();
            int even, odd;
            even = odd = 0;
            int temp;
            for(int i = 0; i < n; i++)
            {
                temp = scan.nextInt();
                if(temp % 2 == 0) even++;
                else odd++;
            }
            System.out.println(even + " " + odd);
        }
    }
}