package tenis;

public class Estadios {
	
	private int aforo;
	private Pista pista;
	
	public Estadios(int aforo, Pista pista) {
		
		this.aforo = aforo;
		this.pista = pista;
		
	}

	public int getAforo() {
		
		return aforo;
		
	}

	public void setAforo(int aforo) {
		
		this.aforo = aforo;
		
	}

	public Pista getPista() {
		
		return pista;
		
	}

	public void setPista(Pista pista) {
		
		this.pista = pista;
		
	}

	@Override
	public String toString() {
		return "Estadios [aforo=" + aforo + ", pista=" + pista + "]";
	}
	
}
