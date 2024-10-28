import java.util.HashMap;
import java.util.Map;

public class TowerOfHanoiMemoization {
    
    
    private static Map<String, String> memoization = new HashMap<>();

    public static String solveHanoi(int n, char sumber, char bantu, char tujuan) {
        
        String key = n + "-" + sumber + "-" + bantu + "-" + tujuan;
        
        
        if (memoization.containsKey(key)) {
            return memoization.get(key);
        }
        
        
        if (n == 1) {
            String result = "Memindahkan cakram 1 dari " + sumber + " to " + tujuan + "\n";
            memoization.put(key, result);  
            return result;
        }
        
        
	String result = solveHanoi(n - 1, sumber, tujuan, bantu)
                      + "Memindahkan cakram " + n + " dari " + sumber + " ke " + tujuan + "\n"
                      + solveHanoi(n - 1, bantu, sumber, tujuan);
        
        
        memoization.put(key, result);
        return result;
    }

    public static void main(String[] args) {
        int cakram = 3; 
        System.out.print(solveHanoi(cakram, 'A', 'B', 'C'));
    }
}

