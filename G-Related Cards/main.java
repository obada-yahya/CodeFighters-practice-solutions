import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Obada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Long> values = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            Long temp = scan.nextLong();
            values.add(temp);
        }
        Collections.sort(values);
        ArrayList<Long> ans = new ArrayList<>();
        for(int i = n - 1; i > 0; i--)
        {
            if(values.get(i) != values.get(i - 1) + 1)
            {
                ans.add(values.get(i));
            }
            else {
                i -= 1;
            }
        }
        if(ans.size() == 1)
        {
            ans.add(values.get(0));
        }
        System.out.println(ans.get(1) + " " + ans.get(0));

    }
}