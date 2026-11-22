package Level_3.Task_3;

public class BinarySearchTree {
    TreeNode root;

    //Constructor
    public BinarySearchTree()
    {
        this.root=null;
    }

    //Insert method
    public void insert(int data)
    {
        root=insertRecursive(root,data);
    }

    //Recursive insert method
    private TreeNode insertRecursive(TreeNode current,int data)
    {
        //empty position found
        if(current==null)
        {
            return new TreeNode(data);
            
        }
        //go left
        if(data<current.data)
        {
            current.left=insertRecursive(current.left, data);
        }

        //go right
        else if (data > current.data)
        {
            current.right=insertRecursive(current.right, data);
        }
        return current;
    }
    //Search method
    public boolean search(int data)
    {
        return searchRecursive(root, data);
    }

    //Recursive Search
    private boolean searchRecursive(TreeNode root, int data)
        {
            if(root==null)
            {
                return false;
            }

        //found
        if(root.data == data)
        {
            return true;

        }
        //search left 
        if( data< root.data)
        {
            return searchRecursive(root.left, data);
        }
        else
        {
            return searchRecursive(root.right, data);
        }
    }
    //In-order traversal
    public void inOrder()
    {
        inOrderRecursive(root);
    }
    private void inOrderRecursive(TreeNode root)
    {
        if(root!=null)
        {
            inOrderRecursive(root.left);

            System.out.println(root.data+" ");

            inOrderRecursive(root.right);
        }
    }
    //pre-order traversal
    public void preOrder()
    {
        preOrderRecursive(root);

    }
    private void preOrderRecursive(TreeNode root)
    {
        if(root !=null)
        {
            System.out.println(root.data+" ");

            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }
    //Post-order traversal
    public void postOrder()
    {
        postOrderRecursive(root);
        
    }
    private void postOrderRecursive(TreeNode root)
    {
        if(root !=null){
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.println(root.data+" ");
        }
    }
    public void delete(int data)
    {
        root= deleteRecursive(root, data);
    }
    //Recursive delete
    private TreeNode deleteRecursive(TreeNode root, int data)
    {
        //tree empty
        if( root==null)
        {
            return null;
        }
        //Search left side
        //Delete လုပ်မယ့် Node ကို ရှာ
        if(data< root.data)
        {
            root.left = deleteRecursive(root.left, data);
        }

        //Search right side
        else if( data>root.data)
        {
            root.right=deleteRecursive(root.right, data);
        }
        //found node
        else
        {
            //Case 1 and Case2
            if(root.left==null)
            {
                return root.right;
            }else if(root.right==null)
            {
                return root.left;
            }
            //Case 3: two children
            root.data=findMin(root.right);

            root.right=deleteRecursive(root.right, root.data);
        }
        return root;
    }
    //find smallest value
    private int findMin(TreeNode root)
    {
        int minValue=root.data;

        while(root.left!=null)
        {
            minValue=root.left.data;
            root =root.left;
        }
        return minValue;
    }
}
