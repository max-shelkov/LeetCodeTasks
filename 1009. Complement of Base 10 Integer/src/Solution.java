public class Solution {

    //done

    public static void main(String[] args) {
        Solution solution = new Solution();
        int input = 5;
        long start = System.currentTimeMillis();
        int res = solution.bitwiseComplement(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    public int bitwiseComplement(int N) {

        String bin = Integer.toBinaryString(N);
        StringBuilder sb = new StringBuilder(bin);
        for (int i = 0; i<sb.length(); i++)sb.setCharAt(i, (sb.charAt(i)=='1')? '0' : '1');
        return Integer.parseInt(sb.toString(), 2);

    }

}
