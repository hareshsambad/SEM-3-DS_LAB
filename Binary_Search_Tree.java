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

        if(value > root.value)
        {
            root.right = insertRec(root.right,value);
        }

        return root;
    }

    
    public static void main(String[] args) {
        Binary_Search_Tree b1 = new Binary_Search_Tree();
        b1.insert(50);
        b1.insert(40);
        b1.insert(60);
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