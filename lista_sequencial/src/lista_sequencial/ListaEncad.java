package lista_sequencial;

public class ListaEncad {
	private Node head;
	private Node tail;
	private int size;
	public ListaEncad() {
		this.size = 0;
	}
	
	public void InserirPrim(int val) {
		Node node = new Node(val);
		node.setNext(head);
		head = node;
		
		if (tail == null) {
			tail = head;
		}
		size += 1;
	}
	
	public void Inserir(int val, int index) {
		if (index == 0) {
			InserirPrim(val);
			return;
		}
		if (index == size) {
		InserirUlt(val);
		return;
		}
		Node temp = head;
		for (int i = 1; i<index; i++) {
			temp = temp.getNext();
		}
		Node node = new Node(val, temp.getNext());
		temp.setNext(node);
		
		size++;
	}
	
	public void InserirUlt(int val) {
		if (tail == null) {
			InserirPrim(val);
			return;
		}
		Node node = new Node(val);
		tail.setNext(node);
		tail = node;
		size++;
	}
	
	public int DeletarPrim() {
		int val = head.getValue();
		head = head.getNext();
		if (head == null) {
		tail = null;
		}
		size--;
		return val;
		
	}
	public int deletar(int index) {
		if (index == 0) {
			return DeletarPrim();
		}
		if (index == size-1) {
			return DeletarUlt();
		}
		Node ante = get(index-1);
		int val = ante.getNext().getValue();
		ante.setNext(ante.getNext().getNext());
		return val;
	}
	
	public int DeletarUlt() {
		if(size<=1) {
			return DeletarPrim();
		}
		Node penultimo = get(size-2);
		int val = tail.getValue();
		tail = penultimo;
		tail.setNext(null);
		return val;
	}
	
	public Node find(int value) {
		Node node = head;
		while(node != null) {
			if (node.getValue() == value) {
				return node;
			}
			node = node.getNext();
		}
		return node;
	}
	
	public Node get(int index) {
		Node node = head;
		for(int i = 0; i<index; i++) {
			node = node.getNext();
		}
		return node;
	}
	
	public void Vizualizar() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getValue()+" -> ");
			temp = temp.getNext();
		}
		System.out.println("END");
	}
}
