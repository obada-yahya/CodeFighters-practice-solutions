import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Obada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [] brands = new String[n];
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            brands[i] = scan.next();
        }
        int total = scan.nextInt();
        String [] shoes_collection = new String[total];
        for(int i = 0; i < total; i++)
        {
            shoes_collection[i] = scan.next();
            map.put(shoes_collection[i],map.getOrDefault(shoes_collection[i],0) + 1);
        }
        ArrayList<String> available = new ArrayList<>();
        available.addAll(map.keySet());
        Collections.sort(available);
        for(String s: available)
        {
            System.out.print(s + " ");
        }
        System.out.println();
        for(String s : available)
        {
            System.out.print(map.get(s) + " ");
        }
        System.out.println();

    }
}