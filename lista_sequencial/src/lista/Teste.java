package lista;

public class Teste {

	public static void main(String[] args) {
//		ListaEncad list = new ListaEncad();
//		list.InserirPrim(3);
//		list.InserirPrim(5);
//		list.InserirPrim(7);
//		list.InserirPrim(19);
//		list.InserirUlt(100);
//		list.Inserir(4, 3);
//		list.Vizualizar();
//		System.out.println(list.DeletarPrim());
//		list.Vizualizar();
//		System.out.println(list.DeletarUlt());
//		list.Vizualizar();
//		System.out.println(list.deletar(1));
//		list.Vizualizar();
		ListaDupEncad<Integer> list = new ListaDupEncad<>();
		list.InserirPrim(3);
		list.InserirPrim(5);
		list.InserirPrim(7);
		list.inserir(4, 3);
		list.InserirPrim(19);
		list.vizualizar();
		list.deletarUlt();
		list.vizualizar();
		list.inserirUlt(2);
		list.vizualizar();
		list.deletarPrim();
		list.vizualizar();
		list.deletarPorNome(3);
		list.vizualizar();
	}

}
