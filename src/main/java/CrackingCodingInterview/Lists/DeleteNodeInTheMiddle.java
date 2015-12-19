package CrackingCodingInterview.Lists;

/**
 * Created by root on 12/18/15.
 */
public class DeleteNodeInTheMiddle {
    public void deleteTheMiddleNode(Node node) {



            if (node.next != null ) {
                int tempData = node.next.getData();
                node.setData(tempData);
                node.next = node.next.next;
            }
        }
    }

