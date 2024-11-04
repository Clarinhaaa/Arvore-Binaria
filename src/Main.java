public class Main {
    public static void main(String[] args) throws Exception {
        BinaryTree bt = new BinaryTree();

        bt.inserir(4);
        bt.inserir(2);
        bt.inserir(3);
        bt.inserir(1);
        bt.inserir(6);
        bt.inserir(5);
        bt.inserir(7);

        bt.preOrder();
        System.out.println();
        bt.inOrder();
        System.out.println();
        bt.postOrder();
    }
}
