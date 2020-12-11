package ar.edu.unju.edm.model;

public class Reserva{
	
	private Long codigoReserva;
	private String usuarioReserva;
	private Boolean desayuno;
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reserva(Long codigoReserva, String usuarioReserva, Boolean desayuno) {
		super();
		this.codigoReserva = codigoReserva;
		this.usuarioReserva = usuarioReserva;
		this.desayuno = desayuno;
	}
	public Long getCodigoReserva() {
		return codigoReserva;
	}
	public void setCodigoReserva(Long codigoReserva) {
		this.codigoReserva = codigoReserva;
	}
	public String getUsuarioReserva() {
		return usuarioReserva;
	}
	public void setUsuarioReserva(String usuarioReserva) {
		this.usuarioReserva = usuarioReserva;
	}
	public Boolean getDesayuno() {
		return desayuno;
	}
	public void setDesayuno(Boolean desayuno) {
		this.desayuno = desayuno;
	}
	
}
