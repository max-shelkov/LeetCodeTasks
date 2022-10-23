import java.util.ArrayList;

// done
public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String res = null;
        long start = System.currentTimeMillis();
            res = solution.convert("PAYPALISHIRASFGEWQPPHMLSAJQPERJANG", 7);
//            res = solution.convert("A", 4);
//        res = solution.convert("PAYPALISHIRING", 4);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        if (s == null || s.isEmpty()) return "";

        int index = 0;
        ArrayList<String> zig = new ArrayList<>();
        while (index < s.length()) {
            if (index + numRows > s.length()) {
                zig.add(s.substring(index));
                break;
            } else {
                zig.add(s.substring(index, index + numRows));
                index += numRows - 1;
            }
        }

        int sizeOfLast = zig.get(zig.size()-1).length();
        int delta = numRows - sizeOfLast;
        if (delta > 0) {
            zig.set(zig.size()-1, zig.get(zig.size()-1) + "-".repeat(delta));
        }

        for (int i = 0; i < zig.size(); i++) {
            if (i % 2 != 0) {
                StringBuilder sb = new StringBuilder(zig.get(i));
                sb.replace(0,1,"-");
                sb.reverse();
                sb.replace(0,1,"-");
                zig.set(i, sb.toString());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < zig.size(); j++) {
                if ( i < zig.get(j).length()){
                    String item = zig.get(j);
                    if (item.charAt(i) != '-'){
                        sb.append(item.charAt(i));
                    }

                }
            }

        }

//        System.out.println("zig = " + zig);
//        System.out.println("sb = " + sb);
//        matrix.add(column);

        return sb.toString();
    }

    private void printMatrix(ArrayList<int[]> matrix) {
        for (int[] column : matrix) {
            for (int x : column) {
                System.out.print(x + " : ");
            }
            System.out.println();
        }
    }
}