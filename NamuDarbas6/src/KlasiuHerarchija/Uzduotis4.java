package KlasiuHerarchija;

public class Uzduotis4 {
	public static void main(String[] args) {
		//Figura figura = new Figura();
		Keturkampis ketur = new Keturkampis();
		ketur.plotas();
		ketur.perimetras();
		Staciakampis stat = new Staciakampis();	
		stat.plotas();
		stat.perimetras();
		Apskritimas apsk = new Apskritimas();
		apsk.plotas();
		apsk.perimetras();
		
		Figura info1 = ketur;
		info1.showInfo();
		
		
		Figura info2 = stat;
		info2.showInfo();
		
		
		Figura info3 = apsk;
		info3.showInfo();
		
		
		
	}

}
