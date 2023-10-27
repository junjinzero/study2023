package DataStructure.NonLinearStructure.Tree;

public class BinarySearchTree
{
    /**
     * 이진 검색 트리 Binary Search Tree, BST
     * 이진 트리의 일종으로, 데이터를 저장하고 검색하는데 효율적인 자료 구조이다.
     * 1. 순서 정렬 : 각 노드의 왼쪽 서브 트리에는 현재 노드보다 작은 값의 노드만 존재하고, 오른쪽 서브 트리에는 현재 노드보다 큰 값의 노드만 존재한다.
     *      이러한 순서 정렬을 통해 검색 작업을 효율적으로 수행할 수 있다.
     * 2. 이진 트리 구조 : 각 노드는 최대 두 개의 자식 노드를 가진다.
     *      왼쪽 서브 트리는 현재 노드보다 작은 값을 갖는 노드로 이루어져 있고, 오른쪽 서브 트리는 현재 노드보다 큰 값을 갖는 노드로 이루어져 있다.
     */
    TreeNode root;

    public BinarySearchTree()
    {
        root = null;
    }
    // 삽입 메서드
    public void insert(int data)
    {
        root = insertRec(root,data);
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
    // 검색 메서드
    public boolean search(int data)
    {
        return searchRec(root, data);
    }
    private boolean searchRec(TreeNode root, int data)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == data)
        {
            return true;
        }
        if(data < root.data)
        {
            return searchRec(root.left, data);
        }
        else
        {
            return searchRec(root.right, data);
        }
    }
    // 중위 순회로 출력
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
        BinarySearchTree bst = new BinarySearchTree();

        // 노드 삽입
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // 중위 순회로 출력
        bst.inOrderTraversal(bst.root);

        // 검색
        boolean found = bst.search(60);
        System.out.println("\n검색 결과 : " + found);
    }
}
