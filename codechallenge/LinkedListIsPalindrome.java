import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// import org.graalvm.compiler.graph.Node;

class LinkedListIsPalindrome {
    Node head = new Node(1);
    NodeChar headChar, temp_prt, temp_ptr_v, second_half;

    LinkedListIsPalindrome(){
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(3);
        Node sixth = new Node(2);
        Node sev = new Node(1);
        
        head.ptr = second;
        second.ptr = third;
        third.ptr = fourth;
        fourth.ptr = fifth;
        fifth.ptr = sixth;
        sixth.ptr = sev;
    }
    
    /*
     * First approach: using Stack, perform the following steps:
     * 1. Traverse the given list head to tail, and push every visited node to stack
     * 2. Traverse the list again, for each visited node, pop a node from stack
     *    and compare data of popped node with currently visited node.
     * 3. If all nodes matched, list is a palindrome.
     * O(n)
     */
    public boolean isPalindrome(){
        boolean isPal = false;
        Node copied = head;
        Stack<Integer> nodeStack = new Stack<Integer>();

        // Push content of each node to stack
        while (copied != null){
            nodeStack.push(copied.data);
            copied = copied.ptr;
        }

        // Check if each node data matches stack order.
        while (head != null){
            // Top of stack
            int nodeData = nodeStack.pop();
            if (nodeData == head.data){
                isPal = true;
            } else {
                // Once one doesn't match, we are done checking.
                isPal = false;
                break;
            }
            head = head.ptr;
        }

        return isPal;
    }

    /*
     * Second approach: using Stack, perform the following steps:
     * 1. Convert LinkedList into ArrayList
     * 2. Use two-pointer technique to check for palidrome
     * 3. If all nodes matched, list is a palindrome.
     * O(n)
     */
    public boolean isPalindrome(boolean useThis){
        if (useThis){
            System.out.println("Two-pointer technique is used.");
        }
        List<Integer> listVals = new ArrayList<>();

        // Convert LinkedList into ArrayList
        Node currentNode = head;
        while (currentNode != null){
            listVals.add(currentNode.data);
            currentNode = currentNode.ptr; // Next
        }

        // Use two-pointer technique to check for palidrome
        int front = 0;
        int back = listVals.size() - 1;
        while (front < back){
            if (!listVals.get(front).equals(listVals.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    /*
     *
     * Third Approach: Reverse the list
     * 1. Get middle of the LinkedList
     * 2. Reverse the second half of the linkedlist
     * 3. Is first half equal second half?
     * 
     * O(n) time O(1) extra space
     */
    public boolean isPalindrome(NodeChar head){
        boolean isPal = true;
        temp_prt = head;
        temp_ptr_v = head;
        NodeChar temp_ptr_prev = head;
        NodeChar midNode = null; // For odd size list.

        if (head != null && head.ptr != null){
            // temp_ptr_v move twice while temp_ptr moves once
            // temp_ptr will have middle node
            while (temp_ptr_v != null && temp_ptr_v.ptr != null){
                temp_ptr_v = temp_ptr_v.ptr.ptr; // next.next
                temp_ptr_prev = temp_prt;
                temp_prt = temp_prt.ptr;
            }

            if (temp_ptr_v != null){
                midNode = temp_prt;
                temp_prt = temp_prt.ptr;
            }

            // Reverse second half
            second_half = temp_prt;
            temp_ptr_prev.ptr = null;
            reverseLinkedList();
            isPal = compareTwoLists(head, second_half);

            // Construct the original list again
            reverseLinkedList();
            if (midNode != null){
                temp_ptr_prev.ptr = midNode;
                midNode.ptr = second_half;
            } else {
                temp_ptr_prev.ptr = second_half;
            }
        }
        return isPal;
    }

    void reverseLinkedList(){
        NodeChar prev = null;
        NodeChar current = second_half;
        NodeChar next;
        while (current != null){
            next = current.ptr;
            current.ptr = prev;
            prev = current;
            current = next;
        }
        second_half = prev;
    }

    // Compare two nodes list
    boolean compareTwoLists(NodeChar headNode1, NodeChar headNode2){
        NodeChar firstTemp = headNode1;
        NodeChar secondTemp = headNode2;

        if (firstTemp == null && secondTemp == null){
            return true;
        }

        while (firstTemp != null && secondTemp != null){
            if (firstTemp.data == secondTemp.data){
                firstTemp = firstTemp.ptr; // Next
                secondTemp = secondTemp.ptr; // Next
            } else {
                return false;
            }
        }
        return false;
    }

    // Print node list
    void printNodeLists(NodeChar head){
        while (head != null){
            System.out.print(head.data + "-->");
        }
        System.out.println("NULL");
    }

    // Push node to linked list.
    public void pushToNodeList(char newData){
        // New node
        NodeChar newNode = new NodeChar(newData);
        // Link to the old list
        newNode.ptr = headChar;
        // Move head to point to new node
        headChar = newNode;
    }
}

class Node{
    int data;
    Node ptr;
    Node(int da){
        ptr = null;
        data = da;
    }
}

class NodeChar{
    char data;
    NodeChar ptr;

    NodeChar(char da){
        ptr = null;
        data = da;
    }
}