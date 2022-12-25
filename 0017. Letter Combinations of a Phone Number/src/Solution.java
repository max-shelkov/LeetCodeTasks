import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        List<String> res = solution.letterCombinations("22");
        long finish = System.currentTimeMillis();
        System.out.println("time = " + (finish-start));
        System.out.println("res = " + res);
    }

    public List<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return res;
        if (digits.length() == 1) return getListByNum(digits.charAt(0));

        res = getListByNum(digits.charAt(0));
        for (int i = 1; i < digits.length(); i++) {
            res = multiplyArrays(res, getListByNum(digits.charAt(i)));
        }

        return res;
    }

    private ArrayList<String> multiplyArrays(ArrayList<String> a, ArrayList<String> b){
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                res.add(a.get(i)+b.get(j));
            }
        }
        return res;
    }

    private ArrayList<String> getListByNum(char n){
        switch (n){
            case '2': return new ArrayList<>(Arrays.asList("a","b","c"));
            case '3': return new ArrayList<>(Arrays.asList("d","e","f"));
            case '4': return new ArrayList<>(Arrays.asList("g","h","i"));
            case '5': return new ArrayList<>(Arrays.asList("j","k","l"));
            case '6': return new ArrayList<>(Arrays.asList("m","n","o"));
            case '7': return new ArrayList<>(Arrays.asList("p","q","r", "s"));
            case '8': return new ArrayList<>(Arrays.asList("t","u","v"));
            case '9': return new ArrayList<>(Arrays.asList("w","x","y","z"));
            default: return null;
        }
    }

}