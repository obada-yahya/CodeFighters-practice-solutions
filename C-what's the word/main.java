import java.util.Scanner;
public class Obada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [] input = new String[n];
        String [] output = new String[n];
        int []pos = new int[n];
        for(int i = 0; i < n; i++)
        {
            input[i] = scan.next();
        }
        for(int i = 0; i < n; i++)
        {
            pos[i] = scan.nextInt();
            output[pos[i] - 1] = input[i];
        }
        for(String item: output)
        {
            System.out.print(item);
        }
        System.out.println();
    }
}