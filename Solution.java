import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
             int s = Integer.parseInt(reader.readLine());
              num.add(s);
            
        }
        
        
        for (int i = 0; i < num.size(); i++)
            {
            int j = num.size() - i - 1;
            System.out.println( num.get(j) );
                }
    }
}
