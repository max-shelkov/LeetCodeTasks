public class Solution {
    private boolean isBadVersion(int v) {
        return v >= 144;
    }

    public static void main(String[] args) {
        int inputN = 288;
        Solution solution = new Solution();
        int res;
        long start = System.currentTimeMillis();
        res = solution.firstBadVersion(inputN);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        long time = finish-start;
        System.out.println("time = " + time);
    }



    int res = 0;
    public int firstBadVersion(int n) {
        checkRange(1,n);
        return res;
    }

    private void checkRange(int start, int finish) {
        if (Math.abs(finish-start) <=1 ) {
           res = (isBadVersion(start)) ? start : finish;
        } else {
            int point = (finish - start) / 2 + (finish - start) % 2 + start;
            if (isBadVersion(point)) {
                finish = point;
                res = point;
            } else {
                start = point;
            }
            checkRange(start, finish);
        }
    }
}
