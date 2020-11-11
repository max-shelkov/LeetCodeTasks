public class Solution {

    //done

    public static void main(String[] args) {
        int[] p1 = {0,0}, p2 = {1,1}, p3 = {1,0}, p4 = {0,1};
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        boolean res = solution.validSquare(p1,p2,p3,p4);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

/*
        s1 = (x1 − x2)² + (y1 − y2)²,
        s2 = (x1 − x3)² + (y1 − y3)²,
        s3 = (x1 − x4)² + (y1 − y4)²,
        s4 = (x2 − x3)² + (y2 − y3)²,
        s5 = (x2 − x4)² + (y2 − y4)²,
        s6 = (x3 − x4)² + (y3 − y4)².
*/
        int[] sides = new int[6];
        sides[0] = (p1[0] - p2[0])*(p1[0] - p2[0]) + (p1[1] - p2[1])*(p1[1] - p2[1]);
        sides[1] = (p1[0] - p3[0])*(p1[0] - p3[0]) + (p1[1] - p3[1])*(p1[1] - p3[1]);
        sides[2] = (p1[0] - p4[0])*(p1[0] - p4[0]) + (p1[1] - p4[1])*(p1[1] - p4[1]);
        sides[3] = (p2[0] - p3[0])*(p2[0] - p3[0]) + (p2[1] - p3[1])*(p2[1] - p3[1]);
        sides[4] = (p2[0] - p4[0])*(p2[0] - p4[0]) + (p2[1] - p4[1])*(p2[1] - p4[1]);
        sides[5] = (p3[0] - p4[0])*(p3[0] - p4[0]) + (p3[1] - p4[1])*(p3[1] - p4[1]);
        int sideSize = Integer.MAX_VALUE;
        int diagonalSize = Integer.MIN_VALUE;
        for (int line: sides) {
            sideSize = Math.min(sideSize, line);
            diagonalSize = Math.max(diagonalSize, line);
        }
        int sideCounter = 0;
        int diagonalCounter = 0;
        for (int line: sides) {
            if (line == sideSize) sideCounter++;
            if (line == diagonalSize) diagonalCounter++;
        }
        return sideCounter == 4 && diagonalCounter == 2 && sideSize * 2 == diagonalSize;

    }


}
