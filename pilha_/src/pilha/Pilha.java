package pilha;
import java.util.ArrayList;

public class Pilha<T> {
    ArrayList<T> lista;
    T item;
    public Pilha() {
        lista = new ArrayList<>();
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return null;
        }
        item = lista.get(size()-1);
        lista.remove(lista.size() - 1);
        return item;
    }

    public int size() {
        return lista.size();
    }

    public void push(T add) {
        lista.add(add);
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public T top() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return null;
        }
        return lista.get(lista.size() - 1);
    }

    public void clear() {
        lista.clear();
    }
}

