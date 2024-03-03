package personDao;
import users.User;

public class Veterinarian {
	 private String cedula;
	    private String nombre;
	    private int edad;
	    private User user;

	    public Veterinarian(String cedula, String nombre, int edad, String username, String password) {
	        this.cedula = cedula;
	        this.nombre = nombre;
	        this.edad = edad;
	        this.user = new User(username, password);
	    }

	    // Getter for user
	    public User getUser() {
	        return user;
	    }

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public void setUser(User user) {
			this.user = user;
		}
	}

	class Owner {
	    // Constructor
	    public Owner(String cedula, String nombre, int edad) {
	        // Implement owner registration here
	    }
	}

	class Pet {
	    // Constructor
	    public Pet(String nombre, String cedula_dueño, int edad, String especie, String raza,
	               String características, double peso) {
	        // Implement pet registration here
	    }
	}

	class MedicalRecord {
	    // Constructor
	    public MedicalRecord(/* Parameters */) {
	        // Implement medical record creation here
	    }
	}

	class Invoice {
	    // Constructor
	    public Invoice(/* Parameters */) {
	        // Implement invoice creation here
	    }
	

}
