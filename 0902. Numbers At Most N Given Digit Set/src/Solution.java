class Solution {

    public static void main(String[] args) {
        String[] digits = {"1","3","5","7"};
        int n = 100;
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.atMostNGivenDigitSet(digits, n);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    int[] pow;

    public int atMostNGivenDigitSet(String[] D, int N) {

        char[] cs = ("0"+N).toCharArray();
        int[] n = new int[cs.length];
        int[] d = new int[D.length];

        pow = new int[cs.length+1];
        pow[0]=1;
        for(int i=1; i<cs.length; i++)
            pow[i]=pow[i-1]*d.length;

        for(int i=0; i<cs.length; i++) n[i]=cs[i]-'0';
        for(int i=0; i<d.length; i++) d[i]=Integer.parseInt(D[i]);

        return generate(n, d, 0, 1, true);
    }

    int generate(int[] n, int[] digits, int last, int len, boolean f){
        if(len==n.length) return last!=0?1:0;
        int cnt = 0;
        if(last==0) cnt+= generate(n, digits, 0, len+1, false);
        for (int d : digits) {
            if (f) {
                if (d == n[len]) cnt += generate(n, digits, d, len + 1, true);
                else if (d < n[len]) cnt += pow[n.length - len - 1];
                else break;
            } else
                cnt += pow[n.length - len - 1];
        }
        return cnt;
    }

}