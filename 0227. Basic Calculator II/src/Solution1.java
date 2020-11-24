import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    //3 ms

    public int calculate(String s) {
        s = s.replaceAll(" ","");
        List<String> arr = toList(s);
        if (arr.size() == 1) return Integer.parseInt(arr.get(0));
        int i = 0;
        while (i<arr.size()){
            if (arr.get(i).equals("*") || arr.get(i).equals("/") ){
                doOperation(arr, arr.get(i));
                i=0;
                continue;
            }
            i++;
        }
        i=0;
        while (arr.size()>1){
            if (arr.get(i).equals("+") || arr.get(i).equals("-")) {
                doOperation(arr, arr.get(i));
                i = 0;
                continue;
            }
            i++;
        }
        return Integer.parseInt(arr.get(0));

    }

    private void doOperation(List<String> arr, String action){
        int i = 0;
        do {
            if (arr.get(i).equals(action)){
                int num = operate(Integer.parseInt(arr.get(i-1)), Integer.parseInt(arr.get(i+1)), action);
                arr.remove(i-1);
                arr.remove(i-1);
                arr.set(i-1, Integer.toString(num));
                i = 0;
                return;
            }
            i++;
        }while(i<arr.size());

    }

    private int operate(int x, int y, String action){
        switch (action){
            case "*": return x*y;
            case "/": return x/y;
            case "+": return x+y;
            case "-": return x-y;
            default: return 0;
        }
    }

    private List<String> toList(String s){
        List<String> str = new ArrayList<>();
        int leftPointer = -1;
        int rightPointer = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57){
                if (leftPointer < 0){
                    leftPointer = i;
                    rightPointer = i;
                } else {
                    rightPointer = i;
                }
            } else {
                str.add(s.substring(leftPointer, rightPointer+1));
                str.add(s.substring(rightPointer+1, rightPointer+2));
                leftPointer = -1;
                rightPointer = -1;
            }
        }
        str.add(s.substring(leftPointer, rightPointer+1));
        return str;
    }


}
