package entities;

public class Obra {
	
	private String titulo;
	private String autorNome;
	private String autorSobrenome;
	private String local;
	private Integer totalPaginas;
	private Integer anoPublicacao;
	
	public Obra () {
		
	}
	public Obra(String titulo, String autorNome, String autorSobrenome, String local, Integer totalPaginas,
			Integer anoPublicacao) {
		this.titulo = titulo;
		this.autorNome = autorNome;
		this.autorSobrenome = autorSobrenome;
		this.local = local;
		this.totalPaginas = totalPaginas;
		this.anoPublicacao = anoPublicacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutorNome() {
		return autorNome;
	}
	public void setAutorNome(String autorNome) {
		this.autorNome = autorNome;
	}
	public String getAutorSobrenome() {
		return autorSobrenome;
	}
	public void setAutorSobrenome(String autorSobrenome) {
		this.autorSobrenome = autorSobrenome.toUpperCase();
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Integer getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(Integer totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	
	
	
	
}
