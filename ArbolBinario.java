package ArbolB;

public class ArbolBinario {
	// Clase Nodo representa cada nodo en el árbol binario
	public class Nodo {
	    int valor;
	    Nodo izquierda, derecha;

	    public Nodo(int item) {
	        valor = item;
	        izquierda = derecha = null;
	    }
	}
	// Clase ArbolBinario representa el árbol binario en sí
	    Nodo raiz;

	    public ArbolBinario() {
	        raiz = null;
	    }
	    // Método para insertar un valor en el árbol
	    public void insertar(int valor) {
	        raiz = insertarRecursivo(raiz, valor);
	    }

	    public Nodo insertarRecursivo(Nodo raiz, int valor) {
	        if (raiz == null) {
	            raiz = new Nodo(valor);
	            return raiz;
	        }

	        if (valor < raiz.valor)
	            raiz.izquierda = insertarRecursivo(raiz.izquierda, valor);
	        else if (valor > raiz.valor)
	            raiz.derecha = insertarRecursivo(raiz.derecha, valor);

	        return raiz;
	    }

	    // Método para recorrido preorden (raíz, izquierda, derecha)
	    public  void preorden(Nodo nodo) {
	        if (nodo != null) {
	            System.out.print(nodo.valor + " ");
	            preorden(nodo.izquierda);
	            preorden(nodo.derecha);
	        }
	    }
	    // Método para recorrido postorden (izquierda, derecha, raíz)
	    public void postorden(Nodo nodo) {
	        if (nodo != null) {
	            postorden(nodo.izquierda);
	            postorden(nodo.derecha);
	            System.out.print(nodo.valor + " ");
	        }
	    }
	
	    public static void main(String[] args) {
	        ArbolBinario arbol = new ArbolBinario();
	        arbol.insertar(50);
	        arbol.insertar(30);
	        arbol.insertar(70);
	        arbol.insertar(20);
	        arbol.insertar(40);
	        arbol.insertar(60);
	        arbol.insertar(80);

	        System.out.println("Recorrido preorden del árbol:");
	        arbol.preorden(arbol.raiz);
	        System.out.println("\nRecorrido postorden del árbol:");
	        arbol.postorden(arbol.raiz);
	    }
}
