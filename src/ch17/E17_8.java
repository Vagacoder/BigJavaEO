package ch17;

/*
* E17.8 Using a visitor, compute the average value of the elements in a binary 
* tree filled with Integer objects.
* 
*/
public class E17_8 {

    static class IntegerVisitor implements Visitor {

        int sum;
        int count;

        @Override
        public void visit(Object data) {
            sum += (int) data;
            count++;
        }

        public double getAverage() {
            return sum * 1.0 / count;
        }

    }

    public static void inorder(BinaryTree.Node node, IntegerVisitor visitor) {
        if (node == null) {
            return;
        }
        inorder(node.left, visitor);
        visitor.visit(node.data);
        inorder(node.right, visitor);
    }

    public static void main(String[] args) {

        int[] ints = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        BinaryTree t0 = new BinaryTree(0);
        BinaryTree t1 = new BinaryTree(1);
        BinaryTree t2 = new BinaryTree(2, t0, t1);
        BinaryTree t3 = new BinaryTree(4);
        BinaryTree t4 = new BinaryTree(5);
        BinaryTree t5 = new BinaryTree(3, t3, t4);
        BinaryTree t6 = new BinaryTree(9);
        BinaryTree t7 = new BinaryTree(10);
        BinaryTree t8 = new BinaryTree(7, t6, t7);
        BinaryTree t9 = new BinaryTree(6, t2, t5);
        BinaryTree tree = new BinaryTree(8, t9, t8);

        System.out.println(tree.height());
        IntegerVisitor visitor = new IntegerVisitor();
        inorder(tree.getRoot(), visitor);
        System.out.println(visitor.sum);
        System.out.println(visitor.count);
        System.out.println(visitor.getAverage());
    }
}