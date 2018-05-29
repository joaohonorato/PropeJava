package br.com.netprecision.prova.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Set<Produto> produtos = new HashSet<Produto>();

    @OneToMany
    public Set<Produto> getProdutos() {return  produtos;}
    void  setProdutos(Set produtos){this.produtos = produtos;}







}
