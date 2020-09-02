package com.haunt.gaming.domain.enem;

public enum TipoCliente {
	PESSOAFISICA (1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int Getcod() {
		return cod;
	}
	
	public String Getdescricao() {
		return descricao;
	}
	
	public static TipoCliente ToEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.Getcod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("id invalido: "+ cod);
	}
}
