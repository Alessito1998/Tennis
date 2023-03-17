package tenis;

public class Torneos {

	private String ciudad;
	private Modo modo;
	
	public Torneos(String ciudad, Modo modo) {

		this.ciudad = ciudad;
		this.modo = modo;
		
	}

	public String getCiudad() {
		
		return ciudad;
		
	}

	public void setCiudad(String ciudad) {
		
		this.ciudad = ciudad;
		
	}

	public Modo getModo() {
		
		return modo;
		
	}

	public void setModo(Modo modo) {
		
		this.modo = modo;
		
	}

	@Override
	public String toString() {
		
		return "Torneos [ciudad=" + ciudad + ", modo=" + modo + "]";
		
	}
	
}
