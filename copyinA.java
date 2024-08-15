import java.util.HashSet;
import java.util.Set;

public class copyinA {
    public static void main(String[] args) {
        boolean c = arry();
        System.out.println(c);
    }


    public static boolean arry () {
            int[] nums = {1, 2, 3, 4, 5, 2};
            Set<Integer> map = new HashSet<>(); // create hashset it di not takes duplicate.
            for (int i = 0; i < nums.length; i++) {
                if (map.contains(nums[i])) {
                    return true;
                }
                map.add(i);

            }
        return false;
    }
}