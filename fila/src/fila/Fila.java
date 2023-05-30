package fila;
import lista.ListaEncad;
public class Fila<T> {
    ListaEncad<T> lista = new ListaEncad<>(); 
    public void enqueue(T add){
        lista.InserirUlt(add);
    }
    public T dequeue(){
        return lista.DeletarPrim();
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
        return lista.getTail().getValue();
    }
    public Fila() {
    }
    
}
