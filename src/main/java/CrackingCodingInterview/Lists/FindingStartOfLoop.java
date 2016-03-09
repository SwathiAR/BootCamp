package CrackingCodingInterview.Lists;

/**
 * Created by root on 12/19/15.
 */
public class FindingStartOfLoop {
    public Node findTheStartOfLoop(Node head){

        Node slow = head;
        Node fast = head;
        while(fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }

            if(fast.next.next == null){
                return null;
            }

        }

        slow = head;
        while(fast !=slow){
            slow = slow.next;
            fast = fast.next;
            }
return slow;
        }






    }
