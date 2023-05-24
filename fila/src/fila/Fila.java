package fila;
import deletarPrim;
public class Fila {
    ListaEncad<T> lista = new ListaEncad<>(); 
    public void enqueue(T add){
        lista.inserirUlt(add);
    }
    public T dequeue(){
        return lista.deletarPrim();
    }
    public int size(){
        return lista.getSize();
    }
    public boolean isEmpty(){
        if(lista.getSize()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public T front(){
        return lista.getTail();
    }
    public Fila() {
    }
    
}
