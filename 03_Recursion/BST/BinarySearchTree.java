public class BinarySearchTree
{
    private Node root;

    public BinarySearchTree()
    {
        //nothing has been added yet; bst is empty
        root = null;
    }

    /**
     * Method called by driver
     * @param data
     */
    public void add(int data)
    {
        Node newNode = new Node(data);

        //is the tree empty?
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            //not empty
            add(newNode, root);
        }
    }

    private void add(Node newNode, Node currentNode)
    {
        //check which side to add (either left or right)
        //by comparing the data of each node
        if(newNode.getData() > currentNode.getData())
        {
            //go to the right
            if(currentNode.getRight() == null)
            {
                currentNode.setRight(newNode);
            }
            else
            {
                //same steps by with right child as current
                //node
                add(newNode, currentNode.getRight());
            }
        }
        else if(newNode.getData() < currentNode.getData())
        {
            //go to the left
            if(currentNode.getLeft() == null)
            {
                //no left child, add the new node to the left
                currentNode.setLeft(newNode);
            }
            else
            {
                //add new node using the left child as the current node
                add(newNode, currentNode.getLeft());
            }
        }
    }


    /**
     * Dummy method called by driver/client
     */
    public void print()
    {
        if(root != null)
        {
            print(root);
        }
    }

    /**
     * Recurisve method
     * @param current
     */
    private void print(Node current)
    {
        if(current.getLeft() != null)
        {
            print(current.getLeft());
        }

        //print this node
        System.out.print(current.getData() + " ");

        if(current.getRight() != null)
        {
            print(current.getRight());
        }

    }

}
