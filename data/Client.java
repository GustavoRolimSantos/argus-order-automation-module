package data;

public class Client {
	
	// This Data Structure was provided by PedidoOK exportation, that's why is in Portuguese.

	private String tipo_do_registro, numero_do_pedido, codigo_do_cliente, nome_do_cliente, status_do_pedido, desconto_ou_acrescimo, em_percentual_ou_valor, total_bruto, total_liquido, total_custo, total_ipi, total_pecas, emissao, observacao, previsao_entrega, ordem_compra, frete, transportadora, transportadora_contato, peso, tabela_preco, percentual_tabela, percentual_tabela_comissao, data_faturamento, situacao, valor_frete, total_st, forma_pagto, base_vencimento, idVendedor, nomeVendedor;

	public Client(String tipo_do_registro, String numero_do_pedido, String codigo_do_cliente, String nome_do_cliente, String status_do_pedido, String desconto_ou_acrescimo, String em_percentual_ou_valor, String total_bruto, String total_liquido, String total_custo, String total_ipi, String total_pecas, String emissao, String observacao, String previsao_entrega, String ordem_compra, String frete, String transportadora, String transportadora_contato, String peso, String tabela_preco, String percentual_tabela, String percentual_tabela_comissao, String data_faturamento, String situacao, String valor_frete, String total_st, String forma_pagto, String base_vencimento, String idVendedor, String nomeVendedor) {
		super();
		this.tipo_do_registro = tipo_do_registro;
		this.numero_do_pedido = numero_do_pedido;
		this.codigo_do_cliente = codigo_do_cliente;
		this.nome_do_cliente = nome_do_cliente;
		this.status_do_pedido = status_do_pedido;
		this.desconto_ou_acrescimo = desconto_ou_acrescimo;
		this.em_percentual_ou_valor = em_percentual_ou_valor;
		this.total_bruto = total_bruto;
		this.total_liquido = total_liquido;
		this.total_custo = total_custo;
		this.total_ipi = total_ipi;
		this.total_pecas = total_pecas;
		this.emissao = emissao;
		this.observacao = observacao;
		this.previsao_entrega = previsao_entrega;
		this.ordem_compra = ordem_compra;
		this.frete = frete;
		this.transportadora = transportadora;
		this.transportadora_contato = transportadora_contato;
		this.peso = peso;
		this.tabela_preco = tabela_preco;
		this.percentual_tabela = percentual_tabela;
		this.percentual_tabela_comissao = percentual_tabela_comissao;
		this.data_faturamento = data_faturamento;
		this.situacao = situacao;
		this.valor_frete = valor_frete;
		this.total_st = total_st;
		this.forma_pagto = forma_pagto;
		this.base_vencimento = base_vencimento;
		this.idVendedor = idVendedor;
		this.nomeVendedor = nomeVendedor;
	}

	public String getTipo_do_registro() {
		return tipo_do_registro;
	}

	public void setTipo_do_registro(String tipo_do_registro) {
		this.tipo_do_registro = tipo_do_registro;
	}

	public String getNumero_do_pedido() {
		return numero_do_pedido;
	}

	public void setNumero_do_pedido(String numero_do_pedido) {
		this.numero_do_pedido = numero_do_pedido;
	}

	public String getCodigo_do_cliente() {
		return codigo_do_cliente;
	}

	public void setCodigo_do_cliente(String codigo_do_cliente) {
		this.codigo_do_cliente = codigo_do_cliente;
	}

	public String getNome_do_cliente() {
		return nome_do_cliente;
	}

	public void setNome_do_cliente(String nome_do_cliente) {
		this.nome_do_cliente = nome_do_cliente;
	}

	public String getStatus_do_pedido() {
		return status_do_pedido;
	}

	public void setStatus_do_pedido(String status_do_pedido) {
		this.status_do_pedido = status_do_pedido;
	}

	public String getDesconto_ou_acrescimo() {
		return desconto_ou_acrescimo;
	}

	public void setDesconto_ou_acrescimo(String desconto_ou_acrescimo) {
		this.desconto_ou_acrescimo = desconto_ou_acrescimo;
	}

	public String getEm_percentual_ou_valor() {
		return em_percentual_ou_valor;
	}

	public void setEm_percentual_ou_valor(String em_percentual_ou_valor) {
		this.em_percentual_ou_valor = em_percentual_ou_valor;
	}

	public String getTotal_bruto() {
		return total_bruto;
	}

	public void setTotal_bruto(String total_bruto) {
		this.total_bruto = total_bruto;
	}

	public String getTotal_liquido() {
		return total_liquido;
	}

	public void setTotal_liquido(String total_liquido) {
		this.total_liquido = total_liquido;
	}

	public String getTotal_custo() {
		return total_custo;
	}

	public void setTotal_custo(String total_custo) {
		this.total_custo = total_custo;
	}

	public String getTotal_ipi() {
		return total_ipi;
	}

	public void setTotal_ipi(String total_ipi) {
		this.total_ipi = total_ipi;
	}

	public String getTotal_pecas() {
		return total_pecas;
	}

	public void setTotal_pecas(String total_pecas) {
		this.total_pecas = total_pecas;
	}

	public String getEmissao() {
		return emissao;
	}

	public void setEmissao(String emissao) {
		this.emissao = emissao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getPrevisao_entrega() {
		return previsao_entrega;
	}

	public void setPrevisao_entrega(String previsao_entrega) {
		this.previsao_entrega = previsao_entrega;
	}

	public String getOrdem_compra() {
		return ordem_compra;
	}

	public void setOrdem_compra(String ordem_compra) {
		this.ordem_compra = ordem_compra;
	}

	public String getFrete() {
		return frete;
	}

	public void setFrete(String frete) {
		this.frete = frete;
	}

	public String getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}

	public String getTransportadora_contato() {
		return transportadora_contato;
	}

	public void setTransportadora_contato(String transportadora_contato) {
		this.transportadora_contato = transportadora_contato;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getTabela_preco() {
		return tabela_preco;
	}

	public void setTabela_preco(String tabela_preco) {
		this.tabela_preco = tabela_preco;
	}

	public String getPercentual_tabela() {
		return percentual_tabela;
	}

	public void setPercentual_tabela(String percentual_tabela) {
		this.percentual_tabela = percentual_tabela;
	}

	public String getPercentual_tabela_comissao() {
		return percentual_tabela_comissao;
	}

	public void setPercentual_tabela_comissao(String percentual_tabela_comissao) {
		this.percentual_tabela_comissao = percentual_tabela_comissao;
	}

	public String getData_faturamento() {
		return data_faturamento;
	}

	public void setData_faturamento(String data_faturamento) {
		this.data_faturamento = data_faturamento;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getValor_frete() {
		return valor_frete;
	}

	public void setValor_frete(String valor_frete) {
		this.valor_frete = valor_frete;
	}

	public String getTotal_st() {
		return total_st;
	}

	public void setTotal_st(String total_st) {
		this.total_st = total_st;
	}

	public String getForma_pagto() {
		return forma_pagto;
	}

	public void setForma_pagto(String forma_pagto) {
		this.forma_pagto = forma_pagto;
	}

	public String getBase_vencimento() {
		return base_vencimento;
	}

	public void setBase_vencimento(String base_vencimento) {
		this.base_vencimento = base_vencimento;
	}

	public String getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(String idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

}
