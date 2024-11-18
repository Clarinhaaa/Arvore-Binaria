public class BinaryTree {
    private Node raiz;

    //* Inserir */
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

    //* Encaminhamentos */
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
    public int getMaiorNumero() {
        return this.getMaiorNumero(this.raiz).getElemento();
    }
    
    private Node getMaiorNumero(Node node) {
        Node aux = node;
        while (aux.getDireita() != null) {
            aux = aux.getDireita();
        }

        return aux;
    }

    //* Pegar o menor número */
    public int getMenorNumero() {
        return this.getMenorNumero(this.raiz).getElemento();
    }

    private Node getMenorNumero(Node node) {
        Node aux = node;
        while (aux.getEsquerda() != null) {
            aux = aux.getEsquerda();
        }

        return aux;
    }

    //* Remover o menor número */
    public int removerMenorNumero() {
        Node aux = this.getMenorNumero(this.raiz);

        int num = aux.getEsquerda().getElemento();
        aux.setEsquerda(null);
        return num;
    }

    //* Remover em qualquer posição */
    public void remover(int elemento)throws Exception {
        this.remover(elemento, this.raiz);
    }

    private Node remover(int elemento, Node node) throws Exception {
        if (this.raiz == null) {
            throw new Exception("A árvore está vazia");
        } else {
            // Recursividade
            if (elemento < node.getElemento()) {
                node.setEsquerda(this.remover(elemento, node.getEsquerda()));
            } else if (elemento > node.getElemento()) {
                node.setDireita(this.remover(elemento, node.getDireita()));
            // Caso o nó tenha duas sub-árvores
            } else if (node.getDireita() != null && node.getEsquerda() != null) {
                node.setElemento(this.getMenorNumero(node.getDireita()).getElemento());
                node.setDireita(this.getMenorNumero(node.getDireita()).getDireita());
            // Caso o nó tenha 1 ou 0 sub-árvores
            } else {
                node = (node.getEsquerda() != null) ? node.getEsquerda() : node.getDireita();
            }
        }
        return node;
    }
}
