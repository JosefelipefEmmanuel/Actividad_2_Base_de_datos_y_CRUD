class NodoAVL {
    int valor;
    int altura;
    NodoAVL izquierdo;
    NodoAVL derecho;

    public NodoAVL(int valor) {
        this.valor = valor;
        this.altura = 1;
        this.izquierdo = null;
        this.derecho = null;
    }
}

class ArbolAVL {
    NodoAVL raiz;

    public ArbolAVL() {
        raiz = null;
    }

    private int altura(NodoAVL nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.altura;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private int obtenerBalance(NodoAVL nodo) {
        if (nodo == null) {
            return 0;
        }
        return altura(nodo.izquierdo) - altura(nodo.derecho);
    }

    private NodoAVL rotacionDerecha(NodoAVL y) {
        NodoAVL x = y.izquierdo;
        NodoAVL T2 = x.derecho;

        x.derecho = y;
        y.izquierdo = T2;

        y.altura = max(altura(y.izquierdo), altura(y.derecho)) + 1;
        x.altura = max(altura(x.izquierdo), altura(x.derecho)) + 1;

        return x;
    }

    private NodoAVL rotacionIzquierda(NodoAVL x) {
        NodoAVL y = x.derecho;
        NodoAVL T2 = y.izquierdo;

        y.izquierdo = x;
        x.derecho = T2;

        x.altura = max(altura(x.izquierdo), altura(x.derecho)) + 1;
        y.altura = max(altura(y.izquierdo), altura(y.derecho)) + 1;

        return y;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoAVL insertarRec(NodoAVL nodo, int valor) {
        if (nodo == null) {
            return new NodoAVL(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        } else {
            return nodo;
        }

        nodo.altura = 1 + max(altura(nodo.izquierdo), altura(nodo.derecho));

        int balance = obtenerBalance(nodo);

        // Casos de rotación
        if (balance > 1) {
            if (valor < nodo.izquierdo.valor) {
                return rotacionDerecha(nodo);
            } else {
                nodo.izquierdo = rotacionIzquierda(nodo.izquierdo);
                return rotacionDerecha(nodo);
            }
        }

        if (balance < -1) {
            if (valor > nodo.derecho.valor) {
                return rotacionIzquierda(nodo);
            } else {
                nodo.derecho = rotacionDerecha(nodo.derecho);
                return rotacionIzquierda(nodo);
            }
        }

        return nodo;
    }

    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(NodoAVL nodo) {
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

    private void preordenRec(NodoAVL nodo) {
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

    private void postordenRec(NodoAVL nodo) {
        if (nodo != null) {
            postordenRec(nodo.izquierdo);
            postordenRec(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}

public class Arboles_avl_conNumeros {
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();

        // Insertar valores en el árbol
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



        // Realizar recorridos
        System.out.println("Recorrido en orden (inorden):");
        arbol.inorden();

        System.out.println("Recorrido en preorden:");
        arbol.preorden();

        System.out.println("Recorrido en postorden:");
        arbol.postorden();
    }
}
