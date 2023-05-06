package br.com.alura.loja.modelo;

import javax.persistence.Entity;

@Entity
public class Livro  extends Produto{
	private String autor;
	private Integer numerodePaginas;
	
	
	
	public Livro(String autor, Integer numerodePaginas) {
		super();
		this.autor = autor;
		this.numerodePaginas = numerodePaginas;
	}
	public Livro() {
	}
	public String getAuttor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getNumerodePaginas() {
		return numerodePaginas;
	}
	public void setNumerodePaginas(Integer numerodePaginas) {
		this.numerodePaginas = numerodePaginas;
	}
	
	
}
