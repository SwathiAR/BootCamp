package CrackingCodingInterview.Trees.BinarySearchTree;

import java.util.LinkedList;

/**
 * Created by root on 1/19/16.
 */
public class DLLToBST {

    public BinarySearchNode dLLtoBST(DLLNode head){
        DLLNode temp = head;
        int length=0;
        while(temp!=null){
            length++;
            temp = temp.getNext();
        }


        return dLLtoBST(head , 0 , length-1);
    }

    public  BinarySearchNode dLLtoBST(DLLNode head , int start , int end){
        if(start>end) {
            return null;
        }

      int mid = start+ (end-start)/2;
            BinarySearchNode left = dLLtoBST(head , start , mid-1);
         BinarySearchNode root = new BinarySearchNode(head.getData());
        root.setLeft(left);
        if(head.next!=null){
            head.setData(head.getNext().getData());
            head.setNext(head.getNext().getNext());
        }
        root.setRight(dLLtoBST(head , mid+1 , end));
        return root;
        }

    }

 class DLLNode{
     int data;

     public DLLNode(int data) {
         this.data = data;
     }

     DLLNode prev;

     public int getData() {
         return data;
     }

     public void setData(int data) {
         this.data = data;
     }

     public DLLNode getPrev() {
         return prev;
     }

     public void setPrev(DLLNode prev) {
         this.prev = prev;
     }

     public DLLNode getNext() {
         return next;
     }

     public void setNext(DLLNode next) {
         this.next = next;
     }

     DLLNode next;

}

