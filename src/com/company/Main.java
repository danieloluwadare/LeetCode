package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(5);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(8);


        listNode.next=listNode2;
        listNode.next.next= listNode3;
        listNode.next.next.next=listNode7;
        listNode.next.next.next.next= listNode8;

        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);

        listNode4.next=listNode5;
        listNode4.next.next=listNode6;

        Solution solution = new Solution();
        ListNode sum = solution.addTwoNumbers(new ListNode(5), new ListNode(5));

        while( sum != null ){
            System.out.println(sum.val);
            sum= sum.next;
        }



//        ListNode testNode1 = new ListNode(4);
//        ListNode testNode2 = new ListNode(5);
//        ListNode testNode3 = new ListNode(6);
//
//        testNode1.next=testNode2;
//        testNode2.next = testNode3;
//
//        while( testNode1 != null ){
//            System.out.println(testNode1.val);
//            testNode1= testNode1.next;
//        }



//        System.out.println("ADDING LIST NODE ON THE FLY-------");
//
//        ListNode t1= new ListNode(0);
//
//        ListNode iterator= t1;
//        for (int i = 0; i < 5; i++){
//            System.out.println(i  + " -------");
//
//            t1.next = new ListNode(i + 1);
//            t1 = t1.next;
//        }
//
//        System.out.println("Printing LIST NODE ON THE FLY-------");
//
//        int i=0;
//        while( iterator != null ){
//            String output = String.format("%s iterator = %s", i, iterator.val);
//            System.out.println(output);
//            iterator= iterator.next;
//            i++;
//        }
//        System.out.println(t1.val);

    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode prev = null;
        ListNode result = null ;

        while (l1 != null || l2 != null || carry > 0){

            int resultant = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;

            int remainder = resultant % 10;
            carry = resultant >= 10 ? 1 : 0;

            remainder = (l1 == null && l2 == null && carry > 0) ? carry : remainder ;

            if(result == null){
                result = new  ListNode(remainder);
                prev = result;
            }
            else {
                prev.next = new ListNode(remainder);
                prev = prev.next;
            }

            l1 = l1 != null  ? l1.next : l1 ;
            l2 = l2 != null  ? l2.next : l2 ;


        }

//        if(carry > 0){
//            prev.next  = new  ListNode(carry);
//            prev = prev.next;
//      }

        return result;


    }


}