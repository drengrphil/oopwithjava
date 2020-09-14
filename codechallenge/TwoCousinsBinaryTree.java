// Check if two nodes are cousins in a binary tree
// Two nodes of a binary tree are cousins if they have the
// same depth but different parents.
// Maximum depth or height: number of nodes from the root down
// to the furthest leaf node. Also, known as height of binary tree.
class TwoCousinsBinaryTree {
    // Calculating the depth or height of a binary tree
    Node root;

    TwoCousinsBinaryTree(){
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.right.left = new Node(8);
        root.right.left.right = new Node(7);
    }

    // Find depth of a binary tree
    public int calculateDepthOfTree(Node Innerroot){
        if (Innerroot == null){
            return 0;
        }

        // Using recursion
        // Get the depth of the left and right subtree
        int leftDepth = calculateDepthOfTree(Innerroot.left);
        int rightDepth = calculateDepthOfTree(Innerroot.right);

        // Choose the larger one and add the root to it.
        if (leftDepth > rightDepth){
            return (leftDepth + 1);
        } else {
            return (rightDepth + 1);
        }
    }

    // Are two nodes cousins?
    // Two nodes are cousins if they are at the same level
    // but have different parents
    boolean CousinNodes(Node head, Node firstNode, Node secondNode){
        if (head == null){
            return false;
        }
        /*
         * 1. The two nodes should be on the same level
         * 2. The two nodes should not have same parant (sibling)
         */
        return ( (NodeLevelInTree(head, firstNode, 1) == NodeLevelInTree(head, secondNode, 1)) &&
                 (!SiblingNodes(head, firstNode, secondNode)) );
    }

    // Belong to same parent (sibling)
    boolean SiblingNodes(Node head, Node firstNode, Node secondNode){
        if (head == null){
            return false;
        }

        // Recursively
        return ( (head.left == firstNode && head.right == secondNode) ||
                 (head.left == secondNode && head.right == firstNode) ||
                 SiblingNodes(head.left, firstNode, secondNode) ||
                 SiblingNodes(head.right, firstNode, secondNode) );
    }

    // Find the level of a node in a binary tree
    int NodeLevelInTree(Node head, Node targetNode, int level){
        if (head == null){
            return 0;
        }

        if (head == targetNode){
            return level;
        }

        // If node is in left subtree, return level
        int left = NodeLevelInTree(head.left, targetNode, level + 1);
        if (left != 0){
            return left;
        }

        // Search right subtree
        return NodeLevelInTree(head.right, targetNode, level + 1);
    }

    class Node{
        int value;
        Node left, right;
        Node(int val){
            value = val;
            left = right = null;
        }
    }
}
