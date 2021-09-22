package br.com.mbas;

public class CadastroLivros {

	private String titulo;
	private String autor;
	private Boolean disponivel;
	
	public CadastroLivros(String titulo, String autor) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setDisponivel(true);
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Boolean getDisponivel() {
		return this.disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void status() {
		System.out.println("---------------STATUS DO LIVRO---------------");
		System.out.println("Titulo do Livro: " + this.getTitulo());
		System.out.println("Autor do Livro: " + this.getAutor());
		if(this.getDisponivel()) {
			System.out.println("Livro disponivel para alugar!");
		} else {
			System.out.println("Livro indisponivel para aluguel!");
		}
		System.out.println("---------------------------------------------");
	}
}
