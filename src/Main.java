import java.util.HashMap;

// https://neetcode.io/problems/duplicate-integer
public class Main {
    public static void main(String[] args) {
        int[] nums= {1,2,3,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int numero: nums) {
            map.put(numero, map.getOrDefault(numero, 0) + 1);
        }
        System.out.println(map);
    }
}
