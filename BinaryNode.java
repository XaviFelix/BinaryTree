package TreeImplementations;

class BinaryNode<T>
{
    private T data;
    private BinaryNode<T> leftChild;
    private BinaryNode<T> rightChild;

    public BinaryNode()
    {
        this(null);
    }

    public BinaryNode(T dataPortion)
    {
        this(dataPortion, null, null);
    }

    public BinaryNode(T dataPortion, BinaryNode<T> newLeftChild, 
                                     BinaryNode<T> newRightChild)
    {
        data = dataPortion;
        leftChild = newLeftChild;
        rightChild = newRightChild;
    }

    //Mutators and Accessors

    public T getData() {return data;}
    public void setData(T newData) {data = newData;}

    public BinaryNode<T> getLeftChild() {return leftChild;}
    public void setLeftChild(BinaryNode<T> newLeftChild) {leftChild = newLeftChild;}
    public boolean hasLeftChild() {return leftChild != null;}

    public BinaryNode<T> getrightChild() {return rightChild;}
    public void setRightChild(BinaryNode<T> newrightChild) {rightChild = newrightChild;}
    public boolean hasRightChild() {return rightChild != null;}

    public boolean isLeaf() {return (leftChild == null) && (rightChild == null);}

    //preOrder traversal of the subtree for this copy
    public BinaryNode<T> copy()
    {
        BinaryNode<T> newRoot = new BinaryNode<>(data);

        if(leftChild != null)
            newRoot.setLeftChild(leftChild.copy());
        if(rightChild != null)
            newRoot.setRightChild(rightChild.copy());

        return newRoot;
    }

    //Implement these methods later

    // public int getNumberOfNodes() {}
    // public int getHeight() {}
    // public BinaryNode<T> copy() {}


}
