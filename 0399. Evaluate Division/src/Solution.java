import java.util.*;

public class Solution {

    // the solution is correct

    public static void main(String[] args) {
        Solution solution = new Solution();
        double[] res = {};
        String[][] equations = {{"a","b"},{"b","c"}};
        double[] values = {2.0,3.0};

        List<List<String>> queries = new ArrayList<>();
//        queries = {{"a","c"},{"b","a"},{"a","e"},{"a","a"},{"x","x"}};
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++)
//            res = solution.calcEquation(equations, values, queries);
//        long finish = System.currentTimeMillis();
//        System.out.println("res = " + Arrays.toString(res));
//        System.out.println("time = " + (finish-start));

    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, List<String>> map = new HashMap<>();
        HashMap<String, Double> vals = new HashMap<>();

        //prepare graph values
        for (int i = 0; i < equations.size(); i ++) {
            String up = equations.get(i).get(0);
            String down = equations.get(i).get(1);
            double val = values[i];
            if (!map.containsKey(up)) {
                map.put(up, new LinkedList<>());
            }
            if (!map.containsKey(down)) {
                map.put(down, new LinkedList<>());
            }
            map.get(up).add(down);
            map.get(down).add(up);
            vals.put(up + "," + down, val);
            vals.put(down + "," + up, 1/val);
        }

        //calculate
        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i ++) {
            String up = queries.get(i).get(0);
            String down = queries.get(i).get(1);
            res[i] = check(up, down, map, vals);
        }
        return res;
    }
    private double check(String up, String down, HashMap<String, List<String>> arr, HashMap<String, Double> values) {
        if (!arr.containsKey(up) || !arr.containsKey(down)) {
            return -1.0;
        }
        HashSet<String> checked = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        Queue<Double> data = new LinkedList<>();
        q.add(up);
        data.add(1.0);

        while (q.size()>0) {
            String s = q.poll();
            Double v = data.poll();
            checked.add(s);
            if (s.equals(down)) {
                return v;
            }
            for (String str:arr.get(s)) {
                if (!checked.contains(str)) {
                    q.add(str);
                    data.add(v * values.get(s + "," + str));
                }
            }
        }
        return -1.0;
    }

}
