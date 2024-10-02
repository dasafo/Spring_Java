package es.pildoras.conexionHibernate;

import javax.persistence.*;

//PAra que Hibernate pueda hacer el mapeo de clase a la tabla de Clientes y despues a cada
//uno de los campos/atributos de la tabla de Clientes (creada con MySql Brench),
//necesitamos meter Anotaciones

@Entity //Hiberntate transforma las clases en entidades para hacer el mapeo
@Table(name="clientes") //indicamos la tabla que queremos de nuestra BBDD
public class Clientes {
	
	public Clientes() {
		
	}

	public Clientes(String nombre, String apellidos, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ "]";
	}



	@Id //indicamos cual es nuestra Id de la tabla Clientes
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Nuestr PrimaryKey(ver BDD_PrimaryKey.png) elegimos identity 
	@Column(name="Id")
	private int id;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Apellidos")
	private String apellidos;
	
	@Column(name="Direccion")
	private String direccion;

}
