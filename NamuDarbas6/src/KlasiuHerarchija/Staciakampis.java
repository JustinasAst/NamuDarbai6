package KlasiuHerarchija;

public class Staciakampis implements Figura {
	int ilgis = 7;
	int plotis= 10;
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
		System.out.println("Staciakampio perimetras: " +  plotas + " cm");
		System.out.println("Staciakampio plotas: " + perimetras + " cm2");
	}

	
		
	}
	
		


