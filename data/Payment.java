package data;

public class Payment {
	
	// This Data Structure was provided by PedidoOK exportation, that's why is in Portuguese.

	private String tipo_do_registro, prazo_em_dias;

	public Payment(String tipo_do_registro) {
		super();
		this.tipo_do_registro = tipo_do_registro;
	}

	public String getPrazo_em_dias() {
		return prazo_em_dias;
	}

	public void setPrazo_em_dias(String prazo_em_dias) {
		this.prazo_em_dias = prazo_em_dias;
	}

	public String getTipo_do_registro() {
		return tipo_do_registro;
	}

	public void setTipo_do_registro(String tipo_do_registro) {
		this.tipo_do_registro = tipo_do_registro;
	}

}
