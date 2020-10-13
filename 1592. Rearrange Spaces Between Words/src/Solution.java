import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String res = "";
//        String input = "  this   is  a sentence ";
//        String input = " practice   makes   perfect";
        String input = "                            ";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
            res = solution.reorderSpaces(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = |" + res+"|");
        System.out.println("time = " + (finish-start));
    }

    public String reorderSpaces(String text) {
        int spacesCount = 0;
        for (char ch:text.toCharArray()) {
            if (ch == ' ') spacesCount++;
        }
        if (spacesCount==0)return text;
        String[] words = text.split(" ");
        ArrayList<String> wordsList = new ArrayList<>();
        for (String s : words){
            if (!s.isEmpty()) wordsList.add(s);
        }
        int wordsCount = wordsList.size();
        int spacesBetweenTwoWords = (wordsCount==1)?0:spacesCount / (wordsCount-1);
        int spacesAtTheEnd = (wordsCount==1)?spacesCount:spacesCount % (wordsCount-1);
        String divider = " ".repeat(spacesBetweenTwoWords);
        StringBuilder res = new StringBuilder(wordsList.get(0));
        for (int wordNum=1; wordNum<wordsCount; wordNum++){
            res.append(divider).append(wordsList.get(wordNum));
        }
        res.append(" ".repeat(spacesAtTheEnd));

        return res.toString();
    }
}
