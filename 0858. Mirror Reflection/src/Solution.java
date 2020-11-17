public class Solution {
    public static void main(String[] args) {
        int p = 3;
        int q = 2;

        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.mirrorReflection(p,q);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

/*
    public int mirrorReflection(int p, int q) {
        int res = -1;
        int n = 1;
        while (res<0) {
            int dist = q * n;
            if ((dist % (2 * p)) == 0) res = 0;
            if ( dist % p == 0) res =  (n % 2 == 1) ? 1 : 2;
            n++;
        }
        return res;
    }
*/

    public int mirrorReflection(int p, int q) {
        int n = 1;
        int res = -1;
        while (res < 0) {
            int dist = q*n;
            if ((dist % (2 * p)) == 0) { // meet
                res = 0;
            }

            if (res<0 && dist % p == 0) { // meet
                if (n % 2 == 1) {
                    res = 1;
                } else {
                    res = 2;
                }
            }
            n++;
        }
        return res;
    }

}
