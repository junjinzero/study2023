package DataStructure.NonLinearStructure.Tree;

public class BinaryTree
{
    TreeNode root;

    public BinaryTree()
    {
        root = null;
    }
    // 이진 트리에 새로운 노드를 삽입하는 메서드
    public void insert(int data)
    {
        root = insertRec(root, data);
    }
    private TreeNode insertRec(TreeNode root, int data)
    {
        if(root == null)
        {
            root = new TreeNode(data);
            return root;
        }
        if(data < root.data)
        {
            root.left = insertRec(root.left, data);
        }
        else if(data > root.data)
        {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    // 이진 트리를 중위 순회로 출력하는 메서드
    public void inOrderTraversal(TreeNode node)
    {
        if(node != null)
        {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        // 노드 삽입
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // 중위 순회로 출력
        tree.inOrderTraversal(tree.root);
    }
}
