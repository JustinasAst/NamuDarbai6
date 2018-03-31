package KlasiuHerarchija;

public class Keturkampis implements Figura{
	int ilgis = 5;
	int plotis= 5;
	int plotas;
	int perimetras;
	
	
	public void plotas() {
		
		this.plotas = plotis * 2 + ilgis * 2;

	}

	public void perimetras() {
		
		this.perimetras = ilgis * plotis;
				
	}

	@Override
	public void showInfo() {
		System.out.println("Keturkampio perimetras: " + this.plotas + " cm" );
		System.out.println("Keturkampio plotas: " + this.perimetras + " cm2" );
		
	}

}
