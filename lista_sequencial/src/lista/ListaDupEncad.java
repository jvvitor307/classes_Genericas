package lista;

public class ListaDupEncad<T>{
	Node<T> head;
	Node<T> tail;
	int size;
	
	public ListaDupEncad() {
		this.size = 0;
	}
	public void InserirPrim(T val) {
		Node<T> node = new Node<>(val);
		if(size==0) {
			head = node;
			tail = node;
			node.setNext(null);
			node.setPrev(null);
			size++;
			return;
		}
		node.setNext(head);
		head.setPrev(node);
		node.setPrev(null);
		head = node;
		size++;
	}
	public Node<T> find(T value) {
		Node<T> node = head;
		while(node != null) {
			if (node.getValue() == value) {
				return node;
			}
			node = node.getNext();
		}
		return node;
	}
	public void inserir(T val, T after) {
		if(size == 0) {
			InserirPrim(val);
			return;
		}
		Node<T> node = new Node<>(val);
		Node<T> p = find(after);
		if(p == null) {
			System.out.println("não existe!");
			return;
		}
		node.setNext(p.getNext());
		p.setNext(node);
		node.setPrev(p);
		if (node.getNext()!= null) {
		node.getNext().setPrev(node);
		return;
		}
		tail = node;
	}
	
	public void inserirUlt(T val) {
		Node<T> node = new Node<>(val);
		tail.setNext(node);
		node.setNext(null);
		node.setPrev(tail);
		tail = node;
		size++;
		
	}
	public void deletarPrim() {
		if (size == 0) {
			System.out.println("não tem nenhum elemento");
			return;
		}
		else if(size == 1) {
			tail = null;
			head = null;
			size--;
			return;
		}
		head=head.getNext();
		head.setPrev(null);
		size--;
	}
	public void deletarPorNome(T value) {
		Node<T> d = find(value);
		if(d==null) {
			System.out.println("não existe");
			return;
		}
		if(d.getNext()==null) {
			deletarUlt();
			return;
		}
		else if(d.getPrev()==null) {
			deletarPrim();
			return;
		}
		d.getPrev().setNext(d.getNext());
		d.getNext().setPrev(d.getPrev());
		
	}
	public void deletarUlt() {
		if (size == 0) {
			System.out.println("não tem nenhum elemento");
			return;
		}
		else if(size == 1) {
			tail = null;
			head = null;
			size--;
			return;
		}
		tail.getPrev().setNext(null);
		tail=tail.getPrev();
		size--;
	}
	
	public void vizualizar() {
		Node<T> node = head;
		while(node != null) {
			System.out.print(node.getValue() + " --> ");
			node = node.getNext();
		}
		System.out.println("END");
	}
}
