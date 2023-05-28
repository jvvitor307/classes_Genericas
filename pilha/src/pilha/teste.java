package pilha;

public class teste {
    public static void main(String[] args) {
        Pilha<Integer> p1 = new Pilha<>();
        p1.pop();
        p1.top();
        p1.push(2);
        System.out.println( p1.top());
        System.out.println( p1.pop());
        System.out.println( p1.top());
    }
}
