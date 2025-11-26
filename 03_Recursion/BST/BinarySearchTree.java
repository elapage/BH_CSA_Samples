public class BinarySearchTree
{
    private Node root;

    public BinarySearchTree()
    {
        root = null;
    }

    /**
     * Method called by driver
     * @param data
     */
    public void add(int data)
    {
    }


    private void add(Node newNode, Node currNode)
    {

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
