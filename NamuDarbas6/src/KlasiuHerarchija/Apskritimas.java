package KlasiuHerarchija;

public class Apskritimas implements Figura {
	double pi = 3.14;
	double spindulys = 6;
	double plotas;
	double perimetras;
	

	public void plotas() {
		plotas = (2*pi * spindulys)*2;
		
		
	}

	public void perimetras() {
		perimetras = 2*pi * spindulys;
		
		
	}

	@Override
	public void showInfo() {
		System.out.println("Apskritimo plotas yra: " + plotas + " cm");
		System.out.println("Apskritimo perimetras yra: " + perimetras + " cm2");
		
		
	}

	

}
