import java.util.List;

public class SolutionX {

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return false;
        }
        boolean[] dynamic = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String sub = s.substring(j, i + 1);
                if (wordDict.contains(sub) && (j == 0 || dynamic[j - 1])) {
                    dynamic[i] = true;
                    break;
                }
            }
        }
        return dynamic[dynamic.length - 1];
    }

}
