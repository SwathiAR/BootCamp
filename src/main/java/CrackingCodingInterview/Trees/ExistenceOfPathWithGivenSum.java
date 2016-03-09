package CrackingCodingInterview.Trees;

/**
 * Created by root on 1/12/16.
 */
public class ExistenceOfPathWithGivenSum {


        public boolean hasPathWithGivenSum(BinaryTreeNode node , int sum){
            if(node==null){
                return false;
            }
            if((Integer)node.getData() == sum && node.getLeft()==null && node.getRight() == null){
                return true;
            }
            else{
                return hasPathWithGivenSum(node.getLeft() , sum-(Integer)node.getData()) || hasPathWithGivenSum(node.getRight() , sum-(Integer)node.getData());
            }



        }
    }


