public class Solution {
    //done
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] height = {1,3,2,5,25,24,5};
        long start = System.currentTimeMillis();
        int waterAmount = solution.maxArea(height);
        long finish = System.currentTimeMillis();
        System.out.println("waterAmount = " + waterAmount);
        System.out.println("time = " + (finish-start));


    }


    public int maxArea(int[] height) {
        int water;
        int waterMax = 0;
        int pointerLeft = 0;
        int pointerRight = height.length-1;
        do {
            int minWall = Math.min(height[pointerLeft], height[pointerRight]);
            water = minWall * (pointerRight - pointerLeft);
            waterMax = Math.max(waterMax, water);
            if (height[pointerLeft] < height[pointerRight]){
                pointerLeft = findLeftPointer(pointerLeft, height);
            } else {
                pointerRight = findRightPointer(pointerRight, height);
            }
        } while (pointerLeft < pointerRight);
        return waterMax;
    }

    private int findLeftPointer(int pointer, int[] height){
        for (int i = pointer; i < height.length-1; i++) {
            if (height[i+1] > height[i]){
                return i+1;
            }
        }
        return height.length-1;
    }
    private int findRightPointer(int pointer, int[] height){
        for (int i = pointer; i > 0; i--) {
            if (height[i-1] > height[i]){
                return i-1;
            }
        }
        return 0;
    }

}

/*
    public int maxArea(int[] height) {
        int water = 0;
        int waterMax = 0;
        int pointerLeft = 0;
        int pointerRight = height.length-1;
        do {
            int minWall = Math.min(height[pointerLeft], height[pointerRight]);
            water = minWall * (pointerRight - pointerLeft);
            waterMax = Math.max(waterMax, water);
            if (height[pointerLeft] < height[pointerRight]){
                pointerLeft++;
            } else {
                pointerRight--;
            }
        } while (pointerLeft < pointerRight);
        return waterMax;
    }

*/