package TreeImplementations;
import java.util.Iterator;


public class BinaryTree<T> implements BinaryTreeInterface<T> 
{
    private BinaryNode<T> root;

    public BinaryTree() {root = null;}

    //Intantiates root attribute with a rootData
    public BinaryTree(T rootData) 
    {
        root = new BinaryNode<>(rootData);
    }   

    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
    {
        initializeTree(rootData, leftTree, rightTree);
    }

     @Override
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, 
                                    BinaryTreeInterface<T> rightTree) 
    {
        //Need to cast this as BinaryTree<T> because initializeTree requires
        //BiaryTree<T> 
        initializeTree(rootData, (BinaryTree<T>)leftTree, (BinaryTree<T>)rightTree);
    }

    //First Draft of initializeTree()
    private void initializeTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
    {
        root = new BinaryNode<>(rootData);

        if(leftTree != null)
            root.setLeftChild(leftTree.root);
        if(rightTree != null)
            root.setRightChild(rightTree.root);
    }

   



    
    //Methods from the interface
    @Override
    public T getRootData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRootData'");
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHeight'");
    }

    @Override
    public int getNumberOfNodes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumberOfNodes'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public Iterator<T> getPreorderIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPreorderIterator'");
    }

    @Override
    public Iterator<T> getPostorderIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPostorderIterator'");
    }

    @Override
    public Iterator<T> getInorderIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInorderIterator'");
    }

    @Override
    public Iterator<T> getLevelOrderIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLevelOrderIterator'");
    }

    @Override
    public void setRootData(T rootData) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setRootData'");
    }
    
}
