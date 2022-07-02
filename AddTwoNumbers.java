import java.util.List;

public class AddTwoNumbers {
    public ListNode reverseList(ListNode l1)
    {
        ListNode prev= null;
        ListNode current=l1;
        ListNode next =null;

        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        l1=prev;
        return l1;
    }

    public ListNode addList(ListNode l1 ,ListNode l2) {
        int carry=0;
        ListNode head=null;
        ListNode prev=null;
        while(l1!=null || l2!=null)
        {
            int sum=0;
            if(l1!=null)
            {
                sum+=l1.val;
            }
            if(l2!=null)
            {
                sum+=l2.val;
            }
            sum+=carry;

            //2digit sum
            carry=sum/10;
            sum=sum%10;

            ListNode listNode = new ListNode(sum,null);

            // if the output list is empty
            if(head==null)
            {
                prev=listNode;
                head=listNode;
            }

            else {
                //new node to o/p list
                prev.next=listNode;
                // update the previous node to point to the new node
                prev=listNode;
            }
            if(l1!=null)
            {
                l1=l1.next;
            }
            if(l2!=null)
            {
                l2=l2.next;
            }
        }

        if(carry!=0)
        {
            prev.next= new ListNode(carry,prev.next);
        }

        return head;

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode reverseList1=reverseList(l1);
//        ListNode reverseList2=reverseList(l2);
        ListNode l3=addList(l1,l2);
        return l3;

    }

    public static void main(String[] args) {
        ListNode l3=new ListNode(9);
        ListNode l2=new ListNode(4, l3);
        ListNode l1=new ListNode(2, l2);

        ListNode l7=new ListNode(9);
        ListNode l6=new ListNode(4,l7);
        ListNode l5=new ListNode(6,l6);
        ListNode l4=new ListNode(5,l5);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode ans=addTwoNumbers.addTwoNumbers(l1,l4);
        while(ans!=null)
        {
            System.out.println(ans.val+",");
            ans=ans.next;
        }

    }

}
