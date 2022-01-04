package entities;

public class Tese extends Obra {

	private String instituicao, areaConcentracao;

	public Tese() {

	}

	public Tese(String titulo, String autorNome, String autorSobrenome, String local, Integer totalPaginas,
			Integer anoPublicacao, String instituicao, String areaConcentracao) {
		super(titulo, autorNome, autorSobrenome, local, totalPaginas, anoPublicacao);
		this.instituicao = instituicao;
		this.areaConcentracao = areaConcentracao;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;

	}

	public String getAreaConcentracao() {
		return areaConcentracao;
	}

	public void setAreaConcentracao(String areaConcentracao) {
		this.areaConcentracao = areaConcentracao;
	}

	public void imprimirTese() {

		System.out.println("Referência gerada segundo os padrões ABNT: ");
		System.out.println();
		System.out.println(super.getAutorSobrenome() + ", " + super.getAutorNome() + ". " + super.getTitulo() + ". "
				+ super.getAnoPublicacao() + ". " + super.getTotalPaginas() + " páginas. " + getAreaConcentracao()
				+ " - " + getInstituicao() + ", " + super.getLocal() + ", " + super.getAnoPublicacao() + ".");

	}
}
