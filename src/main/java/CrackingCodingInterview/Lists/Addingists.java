package CrackingCodingInterview.Lists;

/**
 * Created by root on 12/18/15.
 */
public class Addingists {

    public Node addList(Node head1, Node head2) {
        Node newNode = new Node(0);
        addList(head1, head2, newNode, 0);
        return newNode;
    }

    private Node addList(Node head1, Node head2, Node newNode, int carry) {
        if (head1 == null && head2 == null) {
            if (carry == 0) {
                return null;
            } else return new Node(carry);
        }


        int sum = (head1==null?0:head1.getData()) + (head2==null?0:head2.getData()) + carry;

       /* if (head1 == null) {
            sum = head2.getData() + carry;
        } else if (head2 == null) {
            sum = head1.getData() + carry;
        } else {
            sum = head1.getData() + head2.getData() + carry;
        }
        */


        if (sum > 9) {
            newNode.setData(sum % 10);
            carry = sum / 10;
        } else {
            newNode.setData(sum);
            carry = 0;
        }


        newNode.next = addList(head1 == null ? null : head1.next,
                head2 == null ? null : head2.next, new Node(0), carry);


        /*
         if(head1 == null ){

            newNode.next = addList(null, head2.next, new Node(0), carry);
        }
        else if (head2 == null){
            newNode.next = addList(head1.next , null , new Node(0) , carry);
        }
        else
            newNode.next = addList(head1.next, head2.next, new Node(0), carry);
        return newNode;

        }
         */

        return newNode;

    }


}

