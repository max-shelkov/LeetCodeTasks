import java.util.ArrayList;
import java.util.Arrays;

public class RecentCounter {

    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        int[] t = {1, 100, 3001, 3002};

        for (int i=0; i< t.length; i++) {
            int param_1 = obj.ping(t[i]);
            System.out.println(param_1);
        }
    }

    private ArrayList<Integer> mTimesOfRequests;
    public RecentCounter() {
        mTimesOfRequests = new ArrayList<>();
    }

    public int ping(int t) {
        mTimesOfRequests.add(t);
        int counter = 0;
        for (int i=mTimesOfRequests.size()-1; i>=0; i--){
            if (t-mTimesOfRequests.get(i) <= 3000){
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

}
