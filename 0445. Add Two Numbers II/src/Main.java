public class Main {
    public static void main(String[] args) {
        ListNode inputL1 = new ListNode(7);
        inputL1.next = new ListNode(2);
        inputL1.next.next = new ListNode(4);
        inputL1.next.next.next = new ListNode(3);

        ListNode inputL2 = new ListNode(5);
        inputL2.next = new ListNode(6);
        inputL2.next.next = new ListNode(4);

//        ListNode inputL1 = new ListNode();
//        ListNode inputL2 = new ListNode();

        // 7243
        //  564
        // 7807

        Solution1 solution = new Solution1();
        ListNode res = new ListNode();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            res = solution.addTwoNumbers(inputL1, inputL2);
        }

        long finish = System.currentTimeMillis();

        System.out.print("res = ");
        while (res!=null){
            System.out.print(res.val+"->");
            res = res.next;
        }
        System.out.println();
        System.out.println("time = " + (finish - start));


    }

}
