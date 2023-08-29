
public class teste {
	public static void main(String[] args) {
		Animal animal = new Animal("homo sapiens", 67, "grande");
		
		
		System.out.println("---------------CACHORRO--------------\n");
		
		Cachorro doguinho = new Cachorro("canis lupus familiaris", 20 ,"medio");

		
		System.out.println(doguinho.latir());
		System.out.println(doguinho.alimentar("ração"));
		System.out.println(doguinho.repousar(5, "min"));
		
		Animal bicho = new Animal();
		//Animal bicho = new Cachorro("canis lupus familiaris", 20 ,"medio");
		
		//Cachorro dog = (Cachorro)bicho;
		
		System.out.println(bicho.reproduzir());
		System.out.println(doguinho.reproduzir()+"\n");
		
		System.out.println("---------------PEIXE--------------\n");
		
		peixe peixonauta = new peixe("peixonauta",1,"pequeno");
		
		System.out.println(peixonauta.pular());
		System.out.println(peixonauta.bolhas());
		System.out.println(peixonauta.mortalidade());
		
		System.out.println("---------------SAPO--------------\n");
		
		Sapo cururu = new Sapo ("anura",3,"pequeno" );
		
		System.out.println(cururu.pula());
		System.out.println(cururu.veneno());
		System.out.println(cururu.nome());


	}
}
