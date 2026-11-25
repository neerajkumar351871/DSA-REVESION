import java.util.LinkedList;
import java.util.Queue;
class  binarytree
    {   
         static class Node
             {
                 int data;
                 Node left;
                 Node right;
                 Node(int data)
                 {
                     this.data= data;
                     this.left=null;
                     this.right= null;
                 }
             }
         static class BinaryTree
             {    
                 static int idx=-1;
                 public static Node buildTree(int[] nodes )
                 {
                   idx++;
                     // Base case
                     if(nodes[idx]==-1)
                     {
                         return null;
                     }
                     Node newNode= new Node(nodes[idx]);
                     newNode.left=buildTree(nodes);
                     newNode.right=buildTree(nodes);
                    return newNode;
                 }
//--------------------------------Pre order--------------------------------
                 // 1:- rootNode.
                 // 2:- Left Node.
                 // 3:- Right Node.
        public static void preorder(Node root)
          {   
            if(root == null)
            {
                return;
            }
          System.out.print(root.data+" ");
          preorder(root.left);
          preorder(root.right);
         
        }
//--------------------------------Pre order-------------------------------------------
                 // 1:- Left Node.
                 // 2:- Root Node.
                 // 3:- Right Node.
                 public  static void inOrder(Node root)
                 {
                     if(root==null)
                     {
                         return;
                     }
                     inOrder(root.left);
                     System.out.print(root.data+" ");
                     inOrder(root.right);
                     }
//--------------------------------Post order-------------------------------------------
                 // 1:- Left Node.
                 // 2:- Right Node.
                 // 3:- Root Node.
                 public static void postOrder(Node root)
                 {
                     if(root==null)
                     {
                         return;
                     }
                     postOrder(root.left);
                     postOrder(root.right);
                     System.out.print(root.data+" ");
                     
                 }
//--------------------------------Level-Order-------------------------------------------
                    // 1
                    // 12
                    // 345
            
         public static void levelOrder(Node root)
        {  
        
                     if(root==null)
                     {
                         return ;
                     }
                     Queue<Node> q= new LinkedList<>();
                     q.add(root);
                     q.add(null);// Next Line ka liya.
                     while(!q.isEmpty())
                         {
                             Node currNode= q.remove();
                             if(currNode==null)
                             {
                                 System.out.println();
                                 if(q.isEmpty())
                                 {
                                     break;
                                 }
                                 else
                                 {
                                     q.add(null);
                                 }
                             }
                             else
                             {
                                 System.out.print(currNode.data+" ");
                                 if(currNode.left!=null)
                                 {
                                     q.add(currNode.left);
                                 }
                                  if(currNode.right!=null)
                                 {
                                     q.add(currNode.right);
                                 }
                             }
                         }
                     
                 }
 
                 public static  int  NodeHeight(Node root)
                 {
                     if(root==null)
                     {
                      return 0;   
                     }
                  
                     int leftheight=NodeHeight(root.left);
                     int rightHeight=NodeHeight(root.right);
                     return Math.max(leftheight,rightHeight)+1;
                     
                 }
//---------------------------------------COUNT NODES--------------------------------------
                 public  static int countNodes(Node root)
                 {
                     if(root==null)
                     {
                         return 0;
                     }
                     //  int leftheight=NodeHeight(root.left);
                     //  int rightHeight=NodeHeight(root.right);
                     // return(leftheight+rightHeight)+2;
                return((NodeHeight(root.left)+NodeHeight(root.right))+2);
                 }
//---------------------------------------SUM OF NODES------------------------------------
                public static int sumofNodes(Node root)
                 {
                     if(root==null)
                     {
                         return 0;
                     }
                     int lft=sumofNodes(root.left);
                     int rgt=sumofNodes(root.right);
                     return lft+rgt+root.data;
                 }
                 
 

    }
      
        public static void main(String args[])
        {
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree  tree=  new BinaryTree();
            Node  root=tree.buildTree(nodes);
            System.out.println(root.data);  
            tree.preorder(root);
            System.out.println();
            tree.inOrder(root);
            System.out.println();
            tree.postOrder(root);
            System.out.println();
            tree.levelOrder(root);
            System.out.println();
            System.out.println("MAX HEIGHT IS:"+tree.NodeHeight(root));
            System.out.println();
            System.out.println("TOTAL NODES:"+tree.countNodes(root));
            System.out.println();
            System.out.println("SUM OF NODES:"+tree.sumofNodes(root));
            
        }
    }