import java.util.HashMap;
import java.util.Scanner;

public class HowManyPairs {
	public static void main(String args[] ) throws Exception {
		
        Scanner in = new Scanner(System.in);
        String[] firstLine = in.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);
        int count = 0;
        
        String[] secondLine = in.nextLine().split(" ");
        
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        int[] numbersArray = new int[secondLine.length];
        for (int i = 0; i < n; i++) {
        	numbersArray[i] = Integer.parseInt(secondLine[i]);
            numbers.put(numbersArray[i], i);
        }
        
        for (int i = 0; i < numbers.size(); i++) {
        	if (numbers.containsKey(numbersArray[i] + k))
        		count++;
        }
        
        System.out.println(count);
        
    }
}
