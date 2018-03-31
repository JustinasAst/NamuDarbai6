package MIF;

public class Uzduotis {
	public static void main(String[] args) {
		Suo so = new Suo();
		Kate kat = new Kate();
		Gyvunas [] gyvunas = new Gyvunas[10];
	    gyvunas[0] = so;
	    gyvunas[1] = kat;
	    for(int i = gyvunas.length - 1; i >= 0; i--) {
	    	if (gyvunas[i] != null) {
	    		gyvunas[i].gyvunasKalba();
	    	}	    
	    }
	    
	    for(int i = 0; i < gyvunas.length; i++) {
	    	Gyvunas gyvis = gyvunas[i];
	    	if (gyvis != null && gyvis instanceof Suo) {
	    		((Suo)gyvis).vizgintiUodega();
	    	}
	    }
	    
	}

}
