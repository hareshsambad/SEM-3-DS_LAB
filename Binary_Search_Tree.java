public class Binary_Search_Tree {
    TreeNode root;
    Binary_Search_Tree()
    {
        root = null;
    }
    void insert(int value)
    {
        root = insertRec(root,value);
    }

    TreeNode insertRec(TreeNode root,int value)
    {
        if(root == null)
        {
            root = new TreeNode(value);
            return root;
        }

        if(value < root.value)
        {
            root.left = insertRec(root.left,value);
        }

        else if(value > root.value)
        {
            root.right = insertRec(root.right,value);
        }

        return root;
    }

    void inOrder(){
        inorderdTraveraser(root);
    }

    void inorderdTraveraser(TreeNode root)
    {
        if(root == null)
        {
            return ;
        }
        
        // inorderdTraveraser(root.left);
        System.out.print(root.value + " ");
        inorderdTraveraser(root.right);
    }

    // void delete(int value)
    // {
    //     root = deleteRec(root,value);
    // }


    // TreeNode deleteRec(TreeNode root , int value)
    // {
    //     if(value < root.value)
    //     {
    //         root.left = deleteRec(root.left,value);
    //     }
    //     else if(value > root.value)
    //     {
    //         root.right = deleteRec(root.right, value);
    //     }

    //     else
    //     {
    //         if(root.left == null)
    //         {
    //             return root.right;
    //         }
    //         else if(root.right == null)
    //         {
    //             return root.left;
    //         }

    //         root.value = minvalue(root.right);

    //         root.right = deleteRec(root.right,root.value);
    //     }
    //     return root;
    // }

    

    
    public static void main(String[] args) {
        Binary_Search_Tree b1 = new Binary_Search_Tree();
        b1.insert(50);
        b1.insert(40);
        b1.insert(60);
        b1.insert(30);
        b1.insert(55);
        b1.inOrder();
        // b1.delete(55);
    }
}
class TreeNode
{
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value)
    {
        this.value = value;
        this.left = null;
        this.right = null;
        
    }
}