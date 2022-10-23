import java.util.ArrayList;
//done
public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        String romanNum = solution.intToRoman(3999);
        long finish = System.currentTimeMillis();
        System.out.println("romanNum = " + romanNum);
        System.out.println("time = " + (finish - start));

    }


    public String intToRoman(int num) {
        ArrayList<Integer> number = new ArrayList<>();
        int d = 1000;
        for (int i = 0; i < 4; i++) {
            int n = num / d;
            number.add(n);
            num = num - n * d;
            d = d / 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.size(); i++) {
            if (i == 0) {
                switch (number.get(i)) {
                    case 1:
                        sb.append("M");
                        break;
                    case 2:
                        sb.append("MM");
                        break;
                    case 3:
                        sb.append("MMM");
                        break;
                }
            } else if (i == 1) {
                switch (number.get(i)) {
                    case 1:
                        sb.append("C");
                        break;
                    case 2:
                        sb.append("CC");
                        break;
                    case 3:
                        sb.append("CCC");
                        break;
                    case 4:
                        sb.append("CD");
                        break;
                    case 5:
                        sb.append("D");
                        break;
                    case 6:
                        sb.append("DC");
                        break;
                    case 7:
                        sb.append("DCC");
                        break;
                    case 8:
                        sb.append("DCCC");
                        break;
                    case 9:
                        sb.append("CM");
                        break;
                }
            } else if (i == 2) {
                switch (number.get(i)) {
                    case 1:
                        sb.append("X");
                        break;
                    case 2:
                        sb.append("XX");
                        break;
                    case 3:
                        sb.append("XXX");
                        break;
                    case 4:
                        sb.append("XL");
                        break;
                    case 5:
                        sb.append("L");
                        break;
                    case 6:
                        sb.append("LX");
                        break;
                    case 7:
                        sb.append("LXX");
                        break;
                    case 8:
                        sb.append("LXXX");
                        break;
                    case 9:
                        sb.append("XC");
                        break;
                }
            } else if (i == 3) {
                switch (number.get(i)) {
                    case 1:
                        sb.append("I");
                        break;
                    case 2:
                        sb.append("II");
                        break;
                    case 3:
                        sb.append("III");
                        break;
                    case 4:
                        sb.append("IV");
                        break;
                    case 5:
                        sb.append("V");
                        break;
                    case 6:
                        sb.append("VI");
                        break;
                    case 7:
                        sb.append("VII");
                        break;
                    case 8:
                        sb.append("VIII");
                        break;
                    case 9:
                        sb.append("IX");
                        break;
                }
            }


        }
        return sb.toString();
    }

}