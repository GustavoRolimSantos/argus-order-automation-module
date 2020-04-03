package data;

public class Product {
	
	// This Data Structure was provided by PedidoOK exportation, that's why is in Portuguese.

	private String tipo_do_registro, codigo_do_produto, nome_do_produto, quantidade, embalagem, qtd_embalagem, desconto_ou_acrescimo_em_percentual, valor_bruto, valor_liquido, valor_custo, valor_ipi, numero_de_pecas, observacao_do_item, valor_st;

	public Product(String tipo_do_registro, String codigo_do_produto, String nome_do_produto, String quantidade, String embalagem, String qtd_embalagem, String desconto_ou_acrescimo_em_percentual, String valor_bruto, String valor_liquido, String valor_custo, String valor_ipi, String numero_de_pecas, String observacao_do_item, String valor_st) {
		super();
		this.tipo_do_registro = tipo_do_registro;
		this.codigo_do_produto = codigo_do_produto;
		this.nome_do_produto = nome_do_produto;
		this.quantidade = quantidade;
		this.embalagem = embalagem;
		this.qtd_embalagem = qtd_embalagem;
		this.desconto_ou_acrescimo_em_percentual = desconto_ou_acrescimo_em_percentual;
		this.valor_bruto = valor_bruto;
		this.valor_liquido = valor_liquido;
		this.valor_custo = valor_custo;
		this.valor_ipi = valor_ipi;
		this.numero_de_pecas = numero_de_pecas;
		this.observacao_do_item = observacao_do_item;
		this.valor_st = valor_st;
	}

	public String getTipo_do_registro() {
		return tipo_do_registro;
	}

	public void setTipo_do_registro(String tipo_do_registro) {
		this.tipo_do_registro = tipo_do_registro;
	}

	public String getCodigo_do_produto() {
		return codigo_do_produto;
	}

	public void setCodigo_do_produto(String codigo_do_produto) {
		this.codigo_do_produto = codigo_do_produto;
	}

	public String getNome_do_produto() {
		return nome_do_produto;
	}

	public void setNome_do_produto(String nome_do_produto) {
		this.nome_do_produto = nome_do_produto;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

	public String getQtd_embalagem() {
		return qtd_embalagem;
	}

	public void setQtd_embalagem(String qtd_embalagem) {
		this.qtd_embalagem = qtd_embalagem;
	}

	public String getDesconto_ou_acrescimo_em_percentual() {
		return desconto_ou_acrescimo_em_percentual;
	}

	public void setDesconto_ou_acrescimo_em_percentual(String desconto_ou_acrescimo_em_percentual) {
		this.desconto_ou_acrescimo_em_percentual = desconto_ou_acrescimo_em_percentual;
	}

	public String getValor_bruto() {
		return valor_bruto;
	}

	public void setValor_bruto(String valor_bruto) {
		this.valor_bruto = valor_bruto;
	}

	public String getValor_liquido() {
		return valor_liquido;
	}

	public void setValor_liquido(String valor_liquido) {
		this.valor_liquido = valor_liquido;
	}

	public String getValor_custo() {
		return valor_custo;
	}

	public void setValor_custo(String valor_custo) {
		this.valor_custo = valor_custo;
	}

	public String getValor_ipi() {
		return valor_ipi;
	}

	public void setValor_ipi(String valor_ipi) {
		this.valor_ipi = valor_ipi;
	}

	public String getNumero_de_pecas() {
		return numero_de_pecas;
	}

	public void setNumero_de_pecas(String numero_de_pecas) {
		this.numero_de_pecas = numero_de_pecas;
	}

	public String getObservacao_do_item() {
		return observacao_do_item;
	}

	public void setObservacao_do_item(String observacao_do_item) {
		this.observacao_do_item = observacao_do_item;
	}

	public String getValor_st() {
		return valor_st;
	}

	public void setValor_st(String valor_st) {
		this.valor_st = valor_st;
	}

}
