public class IntersectionLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;
        int diff = 0;

        if (currA == null || currB == null)
            return null;

        int lenA = getLength(currA);
        int lenB = getLength(currB);

        if(lenA > lenB)
        {
            diff = lenA - lenB ;
            while (diff>0)
            {
                currA = currA.next;
                diff --;
            }
        }
        else if(lenB > lenA)
        {
            diff = lenB - lenA ;
            while (diff>0)
            {
                currB = currB.next;
                diff --;
            }
        }

        while(currA != null && currB != null) {
            if (currA == currB) {
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        return null;
    }

    public int getLength(ListNode node)
    {
        int ctr = 0;
        while (node != null)
        {
            ctr ++;
            node = node.next;
        }

        return ctr;

    }
}
