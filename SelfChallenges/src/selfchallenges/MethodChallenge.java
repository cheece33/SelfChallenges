
package selfchallenges;


public class MethodChallenge {
    
    static int[] nums = {1, 2, 3, 4, 5};
    
    public static void main(String[] args) {
        print(summation(nums));
    }
    
    static int summation(int vals[]) {
        int sum = 0;
        
        for (int val: vals) {
            sum = sum + val;
        }
        
        return sum;
    }
    
    static void print(int a) {
        System.out.println(a);
    }
}
