package ar.edu.unju.edm.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
@Component
@Entity
public class Habitacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id;
	@Column
	private Integer codigo;
	@Column
	private String tipo;
	@Column
	private String descripcion;
	@Column
	private Integer precioNombre;
	@Column
	private String user;
	@Column
	private Boolean desayuno;
	
	public Habitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Habitacion(Long id, Integer codigo, String tipo, String descripcion, Integer precioNombre, String user,
			Boolean desayuno) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.precioNombre = precioNombre;
		this.user = user;
		this.desayuno = desayuno;
	}

	
	public Habitacion(Long id, Integer codigo, String tipo, String descripcion, Integer precioNombre) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.precioNombre = precioNombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPrecioNombre() {
		return precioNombre;
	}

	public void setPrecioNombre(Integer precioNombre) {
		this.precioNombre = precioNombre;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Boolean getDesayuno() {
		return desayuno;
	}

	public void setDesayuno(Boolean desayuno) {
		this.desayuno = desayuno;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
