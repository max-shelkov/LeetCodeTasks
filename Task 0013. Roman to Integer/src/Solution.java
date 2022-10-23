public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = -1;
        Long start = System.currentTimeMillis();
        res = solution.romanToInt("MCMXCIV");
        Long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }


    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) return 0;
        int[] numbers = new int[s.length()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getNum(s.charAt(i));
        }

        int res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i-1] < numbers[i]) {
                res = res - numbers[i-1] * 2 + numbers[i];
            } else {
                res += numbers[i];
            }

        }
        return res;
    }

    private int getNum(char ch){
        switch (ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }


}