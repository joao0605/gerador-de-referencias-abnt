package entities;

public class ArtigoPeriodico extends Obra {

	private String nomeRevista, mesPublicacao;
	private Integer volume;
	private Integer paginaInicial, paginaFinal;

	public ArtigoPeriodico() {

	}

	public ArtigoPeriodico(String titulo, String autorNome, String autorSobrenome, String local, Integer totalPaginas,
			Integer anoPublicacao, String nomeRevista, String mesPublicacao, Integer volume, Integer paginaInicial,
			Integer paginaFinal) {
		super(titulo, autorNome, autorSobrenome, local, totalPaginas, anoPublicacao);
		this.nomeRevista = nomeRevista;
		this.mesPublicacao = mesPublicacao;
		this.volume = volume;
		this.paginaInicial = paginaInicial;
		this.paginaFinal = paginaFinal;
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

	public String getNomeRevista() {
		return nomeRevista;
	}

	public void setNomeRevista(String nomeRevista) {
		this.nomeRevista = nomeRevista;
	}

	public String getMesPublicacao() {
		return mesPublicacao;
	}

	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public void imprimirArtigo() {

		System.out.println("Referência gerada segundo os padrões ABNT: ");
		System.out.println();
		System.out.println(super.getAutorSobrenome() + ", " + super.getAutorNome() + ". " + super.getTitulo() + ". "
				+ getNomeRevista() + ", " + super.getLocal() + ", nº " + getVolume() + ", " + "p." + getPaginaInicial()
				+ " - " + getPaginaFinal() + ". " + getMesPublicacao() + " de " + super.getAnoPublicacao());

	}
}
