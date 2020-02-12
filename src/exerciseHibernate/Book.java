package exerciseHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Libro")
public class Book {
	
	@Id
	@GeneratedValue
	@Column(name="idLibro")
	private int idLibro;
	
	@Column(name="nombreLibro")
	private String nombreLibro;
	
	//agregar los demas atributos
	
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}
	
	public int getIdLibro() {
		return idLibro;
	}
	public String getNombreLibro() {
		return nombreLibro;
	}

}
