// Clase Nodo para almacenar un nodo del árbol
class Nodo {
  int dato;
  Nodo izquierda, derecha;

  public Nodo(int dato) {
    this.dato = dato;
    izquierda = derecha = null;
  }
}

// Clase ArbolBinario 
class ArbolBinario {

  // Raíz del árbol
  Nodo raiz;

  // Constructor
  ArbolBinario() {
    raiz = null;
  }

  // Método para insertar un nuevo nodo
  public void insertar(int dato) {
    Nodo nuevo = new Nodo(dato);
    if (raiz == null) {
      raiz = nuevo;
    } else {
      Nodo padre = null, recorrido = raiz;
      while (recorrido != null) {
        padre = recorrido;
        if (dato < recorrido.dato) {
          recorrido = recorrido.izquierda;
        } else {
          recorrido = recorrido.derecha;
        }
      }
      if (dato < padre.dato) {
        padre.izquierda = nuevo;
      } else {
        padre.derecha = nuevo;
      }
    }
  }

  // Recorridos inorden, preorden y postorden
  public void inorden(Nodo nodo) {
    if (nodo != null) {
      inorden(nodo.izquierda);
      System.out.print(nodo.dato + " ");
      inorden(nodo.derecha);
    }
  }

  public void preorden(Nodo nodo) {
    if (nodo != null) {
      System.out.print(nodo.dato + " ");
      preorden(nodo.izquierda);
      preorden(nodo.derecha);
    }
  }

  public void postorden(Nodo nodo) {
    if (nodo != null) {
      postorden(nodo.izquierda);
      postorden(nodo.derecha);
      System.out.print(nodo.dato + " ");
    }
  }
}

// Programa principal 
public class ArbolBinarioApp {
  public static void main(String[] args) {

    ArbolBinario arbol = new ArbolBinario();

    // Insertamos nodos
    arbol.insertar(20);
    arbol.insertar(30);  
    arbol.insertar(50);
    arbol.insertar(75);
    arbol.insertar(80);
    arbol.insertar(25);  
    arbol.insertar(10);
    //arbol.insertar();
    //arbol.insertar();
    //arbol.insertar();  
    //arbol.insertar();

    // Recorridos
    System.out.print("Preorden: ");
    arbol.preorden(arbol.raiz);

    System.out.print("\nInorden: ");
    arbol.inorden(arbol.raiz);

    System.out.print("\nPostorden: ");
    arbol.postorden(arbol.raiz);
  }
}