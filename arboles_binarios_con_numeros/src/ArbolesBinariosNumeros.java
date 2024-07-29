class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        return raiz;
    }

    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(Nodo nodo) {
        if (nodo != null) {
            inordenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inordenRec(nodo.derecho);
        }
    }

    public void preorden() {
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preordenRec(nodo.izquierdo);
            preordenRec(nodo.derecho);
        }
    }

    public void postorden() {
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(Nodo nodo) {
        if (nodo != null) {
            postordenRec(nodo.izquierdo);
            postordenRec(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}

public class ArbolesBinariosNumeros {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Inserta valores en el árbol
        arbol.insertar(1);
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(5);
        arbol.insertar(8);
        arbol.insertar(13);
        arbol.insertar(21);
        arbol.insertar(34);
        arbol.insertar(55);
        arbol.insertar(89);
        arbol.insertar(99);
        arbol.insertar(7);
        arbol.insertar(6);


        // Realiza recorridos
        System.out.println("Recorrido en Enorden (inorden):");
        arbol.inorden();

        System.out.println("Recorrido en preorden:");
        arbol.preorden();

        System.out.println("Recorrido en postorden:");
        arbol.postorden();
    }
}
