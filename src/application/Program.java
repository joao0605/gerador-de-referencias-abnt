package application;

import java.util.Scanner;

import entities.ArtigoPeriodico;
import entities.CapituloDeLivro;
import entities.Livro;
import entities.Tese;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, m;

		System.out.println("**** BEM VINDO AO GERADOR DE REFERÊNCIAS ABNT ****");
		System.out.println();

		do {
			System.out.println("Você deseja formatar uma referência de qual tipo de obra?");

			System.out.println("Para LIVRO COMPLETO, digite '1';");
			System.out.println("Para CAPÍTULO DE LIVRO, digite '2';");
			System.out.println("Para ARTIGO EM PERIÓDICO, digite '3';");
			System.out.println("Para TESE, DISSERTAÇÃO ou MONOGRAFIA, digite '4'.");

			n = sc.nextInt();
			sc.nextLine();

			switch (n) {

			case 1:

				Livro livro = new Livro();
				System.out.println("Digite o nome do autor do livro, sem o último sobrenome:");
				String nome = sc.nextLine();
				livro.setAutorNome(nome);

				System.out.println("Digite o último sobrenome do autor do livro:");
				String sobrenome = sc.next();
				livro.setAutorSobrenome(sobrenome);
				sc.nextLine();

				System.out.println("Informe o título do livro:");
				String titulo = sc.nextLine();
				livro.setTitulo(titulo);

				System.out.println("Agora informe o número da edição:");
				Integer edicao = sc.nextInt();
				livro.setEdicao(edicao);
				sc.nextLine();

				System.out.println("Editora:");
				String editora = sc.nextLine();
				livro.setEditora(editora);

				System.out.println("Qual é o local da publicação?");
				String local = sc.nextLine();
				livro.setLocal(local);

				System.out.println("Qual é o ano de publicação do livro?");
				Integer ano = sc.nextInt();
				livro.setAnoPublicacao(ano);

				System.out.println("Quantas páginas tem o livro?");
				Integer paginas = sc.nextInt();
				livro.setTotalPaginas(paginas);

				livro.imprimirLivro();
				System.out.println("");

				break;

			case 2:
				CapituloDeLivro cap = new CapituloDeLivro();
				System.out.println("Digite o nome do autor do capítulo do livro, sem o último sobrenome:");
				String nomeCapitulo = sc.nextLine();
				cap.setAutorNome(nomeCapitulo);

				System.out.println("Digite o último sobrenome do autor do capítulo do livro:");
				String sobrenomeCapitulo = sc.next();
				cap.setAutorSobrenome(sobrenomeCapitulo);
				sc.nextLine();

				System.out.println("Informe o título do livro:");
				String tituloLivro = sc.nextLine();
				cap.setTitulo(tituloLivro);

				System.out.println("Informe o título do capítulo do livro:");
				String tituloCapitulo = sc.nextLine();
				cap.setCapitulo(tituloCapitulo);

				System.out.println("Agora informe o número da edição:");
				Integer edicaoCapitulo = sc.nextInt();
				cap.setEdicao(edicaoCapitulo);
				sc.nextLine();

				System.out.println("Editora:");
				String editoraCapitulo = sc.nextLine();
				cap.setEditora(editoraCapitulo);

				System.out.println("Qual é o local da publicação?");
				String localCapitulo = sc.nextLine();
				cap.setLocal(localCapitulo);

				System.out.println("Qual é o ano de publicação do livro?");
				Integer anoCapitulo = sc.nextInt();
				cap.setAnoPublicacao(anoCapitulo);

				System.out.println("Quantas páginas tem o livro?");
				Integer paginasCapitulo = sc.nextInt();
				cap.setTotalPaginas(paginasCapitulo);

				System.out.println("Em que página começa o capítulo do livro?");
				Integer pagInicialCapitulo = sc.nextInt();
				cap.setPaginaInicial(pagInicialCapitulo);

				System.out.println("Em que página termina o capítulo do livro?");
				Integer pagFinalCapitulo = sc.nextInt();
				cap.setPaginaFinal(pagFinalCapitulo);

				cap.imprimirCapituloDeLivro();
				System.out.println("");

				break;

			case 3:

				ArtigoPeriodico art = new ArtigoPeriodico();
				System.out.println("Digite o nome do autor do artigo de revista, sem o último sobrenome:");
				String nomeArtigo = sc.nextLine();
				art.setAutorNome(nomeArtigo);

				System.out.println("Digite o último sobrenome do autor: ");
				String sobrenomeArtigo = sc.next();
				art.setAutorSobrenome(sobrenomeArtigo);
				sc.nextLine();

				System.out.println("Informe o título da Revista:");
				String nomeRevista = sc.nextLine();
				art.setNomeRevista(nomeRevista);

				System.out.println("Informe o título do artigo: ");
				String tituloArtigo = sc.nextLine();
				art.setTitulo(tituloArtigo);

				System.out.println("Agora informe o volume da Revista:");
				Integer volumeArtigo = sc.nextInt();
				art.setVolume(volumeArtigo);
				sc.nextLine();

				System.out.println("Qual é o local da publicação?");
				String localArtigo = sc.nextLine();
				art.setLocal(localArtigo);

				System.out.println("Qual é o ano de publicação da Revista?");
				Integer anoArtigo = sc.nextInt();
				art.setAnoPublicacao(anoArtigo);

				System.out.println("Qual é o mês de publicação da Revista?");
				String mesArtigo = sc.next();
				art.setMesPublicacao(mesArtigo);

				System.out.println("Em que página começa o Artigo?");
				Integer pagInicialArtigo = sc.nextInt();
				art.setPaginaInicial(pagInicialArtigo);

				System.out.println("Em que página termina o Artigo?");
				Integer pagFinalArtigo = sc.nextInt();
				art.setPaginaFinal(pagFinalArtigo);

				art.imprimirArtigo();
				System.out.println("");

				break;

			case 4:

				Tese tese = new Tese();

				System.out.println(" Trata-se de uma Monografia, Dissertação ou Tese? ");
				System.out.println("1 - Monografia; 2 - Dissertação; 3 - Tese");
				int t = sc.nextInt();
				String tipo = null;
				
				if (t == 1) {

					tipo = "Monografia";
				} else if (t == 2) {

					tipo = "Dissertação";

				} else if (t == 3) {
					tipo = "Tese";
				}
				sc.nextLine();
				System.out.println("Digite o nome do autor da " + tipo + ":");
				String nomeTese = sc.nextLine();
				tese.setAutorNome(nomeTese);

				System.out.println("Digite o último sobrenome do autor: ");
				String sobrenomeTese = sc.next();
				tese.setAutorSobrenome(sobrenomeTese);
				sc.nextLine();

				System.out.println("Informe o título da " + tipo + ": ");
				String tituloTese = sc.nextLine();
				tese.setTitulo(tituloTese);

				System.out.println("Qual é o ano de apresentação da " + tipo + "?");
				Integer anoTese = sc.nextInt();
				tese.setAnoPublicacao(anoTese);
				sc.nextLine();
				
				System.out.println("Qual é o local da publicação?");
				String localTese = sc.nextLine();
				tese.setLocal(localTese);

				System.out.println("Quantas páginas tem a " + tipo + "?");
				Integer paginasTese = sc.nextInt();
				tese.setTotalPaginas(paginasTese);
				sc.nextLine();
				
				System.out.println("Qual é a Área de Concentração da " + tipo + "?");
				String areaConcentracao = sc.nextLine();
				tese.setAreaConcentracao(areaConcentracao);
				
				System.out.println("Qual é a instituição onde a " + tipo + " foi apresentada?");
				String instituicaoTese = sc.nextLine();
				tese.setInstituicao(instituicaoTese);
				

				tese.imprimirTese();
				System.out.println("");

				break;

			}
			System.out.println("Você deseja formatar uma nova referência?");
			System.out.println("1 - para SIM");
			System.out.println("2 - para NÃO");
			m = sc.nextInt();

		} while (m == 1);

		System.out.println("*** PROGRAMA ENCERRADO ***");
		System.out.println("*** Desenvolvido por João Pedro ***");

		sc.close();

	}

}
