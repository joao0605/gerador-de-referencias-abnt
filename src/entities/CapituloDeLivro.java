package entities;

public class CapituloDeLivro extends Livro {

	private String capitulo;
	private Integer paginaInicial, paginaFinal;
	
	public CapituloDeLivro() {

	}

	public CapituloDeLivro(String titulo, String autorNome, String autorSobrenome, String local, Integer totalPaginas,
			Integer anoPublicacao, String editora, Integer edicao, Integer paginaInicial, Integer paginaFinal,
			String capitulo) {
		super(titulo, autorNome, autorSobrenome, local, totalPaginas, anoPublicacao, editora, edicao);
		this.paginaInicial = paginaInicial;
		this.paginaFinal = paginaFinal;
		this.capitulo = capitulo;
	}

	public Integer getPaginaInicial() {
		return paginaInicial;
	}

	public void setPaginaInicial(Integer paginaInicial) {
		this.paginaInicial = paginaInicial;
	}

	public Integer getPaginaFinal() {
		return paginaFinal;
	}

	public void setPaginaFinal(Integer paginaFinal) {
		this.paginaFinal = paginaFinal;
	}

	public String getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(String capitulo) {
		this.capitulo = capitulo;
	}

	public void imprimirCapituloDeLivro() {

		System.out.println("Referência gerada segundo os padrões ABNT: ");
		System.out.println();
		System.out.println(super.getAutorSobrenome() + ", " + super.getAutorNome() + ". " + getCapitulo() + ". In: "
				+ super.getTitulo() + ". " + getEdicao() + "º Edição. " + super.getLocal() + ": Editora "
				+ super.getEditora() + ", " + super.getAnoPublicacao() + ". " + "p." + getPaginaInicial() + " - "
				+ getPaginaFinal());

	}

}
