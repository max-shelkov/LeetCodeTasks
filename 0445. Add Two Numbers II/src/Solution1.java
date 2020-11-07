import java.math.BigDecimal;

public class Solution1 {

    //done

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigDecimal i1 = getNumString(l1);
        BigDecimal i2 = getNumString(l2);
        return parseList(i1.add(i2));
    }

    private BigDecimal getNumString(ListNode node){
        StringBuilder sb = new StringBuilder();
        while (node != null){
            sb.append(node.val);
            node = node.next;
        }
        return new BigDecimal(sb.toString());
    }
    private ListNode parseList(BigDecimal num){
        ListNode head = new ListNode();
        ListNode node = head;
        char[] arr = String.valueOf(num.toString()).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                node.val = Integer.parseInt(Character.toString(arr[i]));
            } else {
                node.next = new ListNode(Integer.parseInt(Character.toString(arr[i])));
                node = node.next;
            }
        }
        return head;
    }


}
