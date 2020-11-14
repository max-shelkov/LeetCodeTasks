public class Solution {

    //done

    public static void main(String[] args) {
        int buckets = 1000;
        int minutesToDie = 15;
        int minutesToTest = 60;
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.poorPigs(buckets, minutesToDie, minutesToTest);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {


        if (buckets <= 1) return 0;
        if (minutesToDie == 0) return 1;
        int steps = minutesToTest/minutesToDie;
        int x=0;
        int res = 1;
        do {
            x++;
            res *= (steps+1);
        }while(res < buckets);
        return x;

    }

}
