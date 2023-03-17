package tenis;

public class Jugador {

	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int ranking;
	private char sexo;
	private String nacionalidad;
	private int victorias;
	
	public Jugador(String nombre, String apellido1, String apellido2, int ranking, char sexo, String nacionalidad,
			int victorias) {
	;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.ranking = ranking;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.victorias = victorias;
		
	}

	public Jugador(String nombre, String apellido1, int ranking, char sexo, String nacionalidad, int victorias) {
		
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.ranking = ranking;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.victorias = victorias;
		
	}
	
	
	
}
