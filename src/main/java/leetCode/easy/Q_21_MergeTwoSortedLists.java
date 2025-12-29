package leetCode.easy;

public class Q_21_MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println("Input : l1 = [1,2,4], l2 = [1,3,4]");
//        System.out.println("Output : " + romanToInt(input));
        ListNode ans = mergeTwoLists(l1, l2);
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        return answer;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val=val; this.next = next;}
    }
}
