package lista_sequencial;

public class ListaEncad<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;
	public ListaEncad() {
		this.size = 0;
	}
	
	public void InserirPrim(T val) {
		Node<T> node = new Node<>(val);
		node.setNext(head);
		head = node;
		
		if (tail == null) {
			tail = head;
		}
		size += 1;
	}
	
	public void Inserir(T val, int index) {
		if (index == 0) {
			InserirPrim(val);
			return;
		}
		if (index == size) {
		InserirUlt(val);
		return;
		}
		Node<T> temp = head;
		for (int i = 1; i<index; i++) {
			temp = temp.getNext();
		}
		Node<T> node = new Node<>(val, temp.getNext());
		temp.setNext(node);
		
		size++;
	}
	
	public void InserirUlt(T val) {
		if (tail == null) {
			InserirPrim(val);
			return;
		}
		Node<T> node = new Node<>(val);
		tail.setNext(node);
		tail = node;
		size++;
	}
	
	public T DeletarPrim() {
		T val = head.getValue();
		head = head.getNext();
		if (head == null) {
		tail = null;
		}
		size--;
		return val;
		
	}
	public T deletar(int index) {
		if (index == 0) {
			return DeletarPrim();
		}
		if (index == size-1) {
			return DeletarUlt();
		}
		Node<T> ante = get(index-1);
		T val = ante.getNext().getValue();
		ante.setNext(ante.getNext().getNext());
		return val;
	}
	
	public T DeletarUlt() {
		if(size<=1) {
			return DeletarPrim();
		}
		Node<T> penultimo = get(size-2);
		T val = tail.getValue();
		tail = penultimo;
		tail.setNext(null);
		return val;
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
	
	public Node<T> get(int index) {
		Node<T> node = head;
		for(int i = 0; i<index; i++) {
			node = node.getNext();
		}
		return node;
	}
	
	public void Vizualizar() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.getValue()+" -> ");
			temp = temp.getNext();
		}
		System.out.println("END");
	}

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public int getSize() {
		return size;
	}
	
}
