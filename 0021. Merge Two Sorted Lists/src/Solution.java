public class Solution {
//    done
    public static void main(String[] args) {

        Solution solution = new Solution();
        ListNode node1 = solution.listGenerator( new int[] {1,2,4});
        ListNode node2 = solution.listGenerator( new int[] {1,3,4});
        solution.printNodeList(node1);
        solution.printNodeList(node2);
        ListNode merged = solution.mergeTwoLists(node1, node2);
        solution.printNodeList(merged);

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headNode = new ListNode();
        ListNode node = headNode;
        while (list1 != null || list2 != null){
            if (list1 == null) {
                ListNode newNode = new ListNode(list2.val);
                node.next = newNode;
                node = newNode;
                list2 = list2.next;
            } else if (list2 == null){
                ListNode newNode = new ListNode(list1.val);
                node.next = newNode;
                node = newNode;
                list1 = list1.next;
            } else {
                if (list1.val < list2.val) {
                    ListNode newNode = new ListNode(list1.val);
                    node.next = newNode;
                    node = newNode;
                    list1 = list1.next;
                } else {
                    ListNode newNode = new ListNode(list2.val);
                    node.next = newNode;
                    node = newNode;
                    list2 = list2.next;
                }
            }
        }
        return headNode.next;
    }












    private ListNode listGenerator(int[] arr){
        ListNode node = null;
        for (int i = arr.length-1; i >=0; i--) {
            node = new ListNode(arr[i], node);
        }
        return node;
    }

    private void printNodeList(ListNode node){
        ListNode n = node;
        while (n!=null){
            System.out.print(n.val+"->");
            n = n.next;
        }
        System.out.println();

    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}