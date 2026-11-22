package Level_3.Task_3;

public class Main {
    public static void main(String[] args) {
        //Create BST obj
        BinarySearchTree bst= new BinarySearchTree();

        //Insert data
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        //Traversal
        System.out.println("In-order Traversal:");
        bst.inOrder();

        System.out.println("\nPre-order Traversal:");
        bst.preOrder();

        System.out.println("\nPost-order Traversal:");
        bst.postOrder();

        //Search
        System.out.println("\nSearch 40:");
        if(bst.search(40))
        {
            System.out.println("40 found.");
        }
       else
       {
        System.out.println("40 not found.");
       }
       System.out.println("\nSearch 100:");
       if(bst.search(100))
       {
        System.out.println("100 found.");
       }
       else
       {
        System.out.println("100 not found.");
       }

       //Delete
       System.out.println("\nDelete 30");
       bst.delete(30);

       // display after deletion
       System.out.println("\nIn-order Traversal after deleting 30:");
       bst.inOrder();
    }
}
