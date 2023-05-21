package lista_sequencial;

public class ListaDupEncad {
	Node head;
	Node tail;
	int size;
	
	public ListaDupEncad() {
		this.size = 0;
	}
	public void InserirPrim(int val) {
		Node node = new Node(val);
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
	public Node find(int value) {
		Node node = head;
		while(node != null) {
			if (node.getVal() == value) {
				return node;
			}
			node = node.getNext();
		}
		return node;
	}
	public void inserir(int val, int after) {
		if(size == 0) {
			InserirPrim(val);
			return;
		}
		Node node = new Node(val);
		Node p = find(after);
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
	
	public void inserirUlt(int val) {
		Node node = new Node(val);
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
	public void deletarPorNome(int value) {
		Node d = find(value);
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
		Node node = head;
		while(node != null) {
			System.out.print(node.getVal() + " --> ");
			node = node.getNext();
		}
		System.out.println("END");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	private class Node{
		int val;
		Node next;
		Node prev;
		
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node getPrev() {
			return prev;
		}
		public void setPrev(Node prev) {
			this.prev = prev;
		}
		public Node(int val) {
			this.val = val;
		}
		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		
	}
}
