package br.com.addario.pousadaapi.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Fornecedor {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "razao_social")
	private String razaoSocial;
	
	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "email")
	private String email;
}
