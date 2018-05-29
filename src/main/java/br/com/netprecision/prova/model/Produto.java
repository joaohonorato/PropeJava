package br.com.netprecision.prova.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
@Entity
@Table(name="produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	@NotNull
	private String codigo;

	@Column
	@NotNull
	private BigDecimal preco;

	@Column(name="qntd")
	private int quantidade;
	
}
