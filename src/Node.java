public class Node {
    private int elemento;
    private Node esquerda;
    private Node direita;

    public Node(int elemento) {
        this.elemento = elemento;
    }

    public Node(int elemento, Node esquerda, Node direita) {
        this.elemento = elemento;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Node getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    public Node getDireita() {
        return direita;
    }

    public void setDireita(Node direita) {
        this.direita = direita;
    }

}
