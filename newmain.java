
public class newmain {
	public static void main(String [] args) {
		Arvbin<Integer> arvore = new Arvbin<Integer>(1);
		Arvbin<Integer> node1 = new Arvbin<Integer>(1);
		Arvbin<Integer> node2 = new Arvbin<Integer>(2);
		Arvbin<Integer> node3 = new Arvbin<Integer>(3);
		Arvbin<Integer> node4 = new Arvbin<Integer>(4);
		Arvbin<Integer> node5 = new Arvbin<Integer>(5);
		Arvbin<Integer> node6 = new Arvbin<Integer>(6);
		Arvbin<Integer> node7 = new Arvbin<Integer>(7);
		Arvbin<Integer> node8 = new Arvbin<Integer>(8);
		Arvbin<Integer> node9 = new Arvbin<Integer>(9);
		Arvbin<Integer> node10 = new Arvbin<Integer>(10);
		Arvbin<Integer> node11 = new Arvbin<Integer>(10);
		
		arvore.defineDir(node1);
		node1.defineDir(node3);
		node1.defineEsq(node2);
		arvore.defineEsq(node4);
		node4.defineDir(node5);
		node4.defineEsq(node6);
		node6.defineEsq(node7);
		node6.defineDir(node8);
		node8.defineEsq(node10);
		node8.defineDir(node9);
		node10.defineEsq(node11);
		
		System.out.println(arvore.calculaDiametro());
		System.out.println(arvore.calculaDiametroalt());
		System.out.println(arvore.calculaAltura());
		
	}
}
