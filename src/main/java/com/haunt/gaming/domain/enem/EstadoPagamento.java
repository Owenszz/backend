package com.haunt.gaming.domain.enem;

public enum EstadoPagamento {
	PEDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int Getcod() {
		return cod;
	}
	
	public String Getdescricao() {
		return descricao;
	}
	
	public static EstadoPagamento ToEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(EstadoPagamento x : EstadoPagamento.values()) {
			if(cod.equals(x.Getcod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("id invalido: "+ cod);
	}
}
