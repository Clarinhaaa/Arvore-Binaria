public class BinaryTree {
    private Node raiz;

    //* inserir */
    public void inserir(int elemento) {
        this.inserir(this.raiz, elemento);
    }

    private void inserir(Node node, int elemento) {
        if (node != null) {
            if (elemento <= node.getElemento()) {
                if (node.getEsquerda() != null) {
                    this.inserir(node.getEsquerda(), elemento);
                } else {
                    node.setEsquerda(new Node(elemento));
                }
            } else {
                if (node.getDireita() != null) {
                    this.inserir(node.getDireita(), elemento);
                } else {
                    node.setDireita(new Node(elemento));
                }
            }
        } else {
            this.raiz = new Node(elemento);
        }
    }

    //* encaminhamentos */
    //raiz -> esquerda -> direita
    public void preOrder() {
        this.preOrder(this.raiz);
    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.getElemento() + " ");
            this.preOrder(node.getEsquerda());
            this.preOrder(node.getDireita());
        }
    }

    //esquerda -> raiz -> direita
    public void inOrder() {
        this.inOrder(this.raiz);
    }

    private void inOrder(Node node) {
        if (node != null) {
            this.inOrder(node.getEsquerda());
            System.out.print(node.getElemento() + " ");
            this.inOrder(node.getDireita());
        }
    }

    //esquerda -> direita -> raiz
    public void postOrder() {
        this.postOrder(this.raiz);
    }

    private void postOrder(Node node) {
        if (node != null) {
            this.postOrder(node.getEsquerda());
            this.postOrder(node.getDireita());
            System.out.print(node.getElemento() + " ");
        }
    }

    //* Pegar o maior número */
    public int maiorNumero() {}

    //* Remover o menor número */
}
