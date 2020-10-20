import java.io.Serializable;
import java.time.LocalDate;

public class Persona implements Serializable{
			private String nombre;
			private String apellidos;
			private LocalDate fechaNacimiento;
		
	//toString
		public String toString() {
				return nombre+""+apellidos+""+fechaNacimiento+"";
				
			}
		
	//getters y setters
		public String getNombre() {
				return nombre;
			}


			public void setNombre(String nombre) {
				this.nombre = nombre;
			}


			public String getApellidos() {
				return apellidos;
			}


			public void setApellidos(String apellidos) {
				this.apellidos = apellidos;
			}


			public LocalDate getFechaNacimiento() {
				return fechaNacimiento;
			}


			public void setFechaNacimiento(LocalDate fechaNacimiento) {
				this.fechaNacimiento = fechaNacimiento;
			}

	//constructor
		public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fechaNacimiento = fechaNacimiento;			
		}
		
	}