package tenis;

public class Organizacion {

	public class JuezSilla {
		
		private int id;
		private String nombre;
		private String apellido1;
		private String apellido2;
		
		public JuezSilla(String nombre, String apellido1, String apellido2) {
			
			this.id = 1;
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			
		}
		
		public JuezSilla(String nombre, String apellido) {
			
			this.id = 1;
			this.nombre = nombre;
			this.apellido1 = apellido;
			
		}

		public int getId() {
			
			return id;
			
		}

		public void setId(int id) {
			
			this.id = id;
			
		}

		public String getNombre() {
			
			return nombre;
			
		}

		public void setNombre(String nombre) {
			
			this.nombre = nombre;
			
		}

		public String getApellido1() {
			
			return apellido1;
			
		}

		public void setApellido1(String apellido1) {
			
			this.apellido1 = apellido1;
			
		}

		public String getApellido2() {
			
			return apellido2;
			
		}

		public void setApellido2(String apellido2) {
			
			this.apellido2 = apellido2;
			
		}

		@Override
		public String toString() {
			
			return "JuezSilla [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido1 + "]";
			
		}
		
	}
	
	public class JuezLinea {
		
		private int id;
		private String nombre;
		private String apellido1;
		private String apellido2;
		
		public JuezLinea(String nombre, String apellido1, String apellido2) {
			
			this.id = 1;
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			
		}
		
		public JuezLinea(String nombre, String apellido) {
			
			this.id = 1;
			this.nombre = nombre;
			this.apellido1 = apellido;
			
		}

		public int getId() {
			
			return id;
			
		}

		public void setId(int id) {
			
			this.id = id;
			
		}

		public String getNombre() {
			
			return nombre;
			
		}

		public void setNombre(String nombre) {
			
			this.nombre = nombre;
			
		}

		public String getApellido1() {
			
			return apellido1;
			
		}

		public void setApellido1(String apellido1) {
			
			this.apellido1 = apellido1;
			
		}

		public String getApellido2() {
			
			return apellido2;
			
		}

		public void setApellido2(String apellido2) {
			
			this.apellido2 = apellido2;
			
		}

		@Override
		public String toString() {
			
			return "JuezSilla [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido1 + "]";
			
		}
		
	}
	
	public class Recogepelotas {
		
		private int id;
		private String nombre;
		private String apellido1;
		private String apellido2;
		
		public Recogepelotas(String nombre, String apellido1, String apellido2) {
			
			this.id = 1;
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			
		}
		
		public Recogepelotas(String nombre, String apellido) {
			
			this.id = 1;
			this.nombre = nombre;
			this.apellido1 = apellido;
			
		}

		public int getId() {
			
			return id;
			
		}

		public void setId(int id) {
			
			this.id = id;
			
		}

		public String getNombre() {
			
			return nombre;
			
		}

		public void setNombre(String nombre) {
			
			this.nombre = nombre;
			
		}

		public String getApellido1() {
			
			return apellido1;
			
		}

		public void setApellido1(String apellido1) {
			
			this.apellido1 = apellido1;
			
		}

		public String getApellido2() {
			
			return apellido2;
			
		}

		public void setApellido2(String apellido2) {
			
			this.apellido2 = apellido2;
			
		}

		@Override
		public String toString() {
			
			return "JuezSilla [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido1 + "]";
			
		}
		
	}
	
}
