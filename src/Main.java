public class Main {
    public static void main(String[] args) throws Exception {
        BinaryTree bt = new BinaryTree();

        //* Inserir */
        bt.inserir(4);
        bt.inserir(2);
        bt.inserir(3);
        bt.inserir(1);
        bt.inserir(6);
        bt.inserir(5);
        bt.inserir(7);

        //* Imprimir nas três formas */
        bt.preOrder();
        System.out.println();
        bt.inOrder();
        System.out.println();
        bt.postOrder();
        System.out.println();

        //* Pegar o maior número e remover o menor */
        System.out.println("Maior número da árvore: " + bt.getMaiorNumero());
        System.out.println("Menor número da árvore removido: " + bt.removerMenorNumero());

        //* Imprimir depois das mudanças */
        System.out.println();
        bt.inOrder();
    }
}
