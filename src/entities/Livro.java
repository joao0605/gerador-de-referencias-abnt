package entities;

public class Livro extends Obra {

	private String editora;
	private Integer edicao;

	public Livro() {

	}

	public Livro(String titulo, String autorNome, String autorSobrenome, String local, Integer totalPaginas,
			Integer anoPublicacao, String editora, Integer edicao) {
		super(titulo, autorNome, autorSobrenome, local, totalPaginas, anoPublicacao);
		this.editora = editora;
		this.edicao = edicao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}

	public void imprimirLivro() {

		System.out.println("Referência gerada segundo os padrões ABNT: ");
		System.out.println();
		System.out.println(super.getAutorSobrenome() + ", " + super.getAutorNome() + ". " + super.getTitulo() + ". "
				+ getEdicao() + "º Edição. " + super.getLocal() + ": Editora " + editora + ", "
				+ super.getAnoPublicacao() + ". " + super.getTotalPaginas() + "p.");

	}
}
