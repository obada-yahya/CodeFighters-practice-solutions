import java.util.Scanner;
public class Obada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y;
        x = scan.nextInt();
        y = scan.nextInt();
        int start_x = 0;
        int start_y = 0;

        int finish_x = 0;
        int finish_y = 0;
        String cell;
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                cell = scan.next();
                if(cell.compareTo("S") == 0)
                {
                    start_x = i;
                    start_y = j;
                }
                else if(cell.compareTo("X") == 0)
                {
                    finish_x = i;
                    finish_y = j;
                }
            }
        }
        System.out.println(Math.abs(start_x - finish_x) + Math.abs(start_y - finish_y));
    }
}