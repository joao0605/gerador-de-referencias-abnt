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

		System.out.println("**** BEM VINDO AO GERADOR DE REFER�NCIAS ABNT ****");
		System.out.println();

		do {
			System.out.println("Voc� deseja formatar uma refer�ncia de qual tipo de obra?");

			System.out.println("Para LIVRO COMPLETO, digite '1';");
			System.out.println("Para CAP�TULO DE LIVRO, digite '2';");
			System.out.println("Para ARTIGO EM PERI�DICO, digite '3';");
			System.out.println("Para TESE, DISSERTA��O ou MONOGRAFIA, digite '4'.");

			n = sc.nextInt();
			sc.nextLine();

			switch (n) {

			case 1:

				Livro livro = new Livro();
				System.out.println("Digite o nome do autor do livro, sem o �ltimo sobrenome:");
				String nome = sc.nextLine();
				livro.setAutorNome(nome);

				System.out.println("Digite o �ltimo sobrenome do autor do livro:");
				String sobrenome = sc.next();
				livro.setAutorSobrenome(sobrenome);
				sc.nextLine();

				System.out.println("Informe o t�tulo do livro:");
				String titulo = sc.nextLine();
				livro.setTitulo(titulo);

				System.out.println("Agora informe o n�mero da edi��o:");
				Integer edicao = sc.nextInt();
				livro.setEdicao(edicao);
				sc.nextLine();

				System.out.println("Editora:");
				String editora = sc.nextLine();
				livro.setEditora(editora);

				System.out.println("Qual � o local da publica��o?");
				String local = sc.nextLine();
				livro.setLocal(local);

				System.out.println("Qual � o ano de publica��o do livro?");
				Integer ano = sc.nextInt();
				livro.setAnoPublicacao(ano);

				System.out.println("Quantas p�ginas tem o livro?");
				Integer paginas = sc.nextInt();
				livro.setTotalPaginas(paginas);

				livro.imprimirLivro();
				System.out.println("");

				break;

			case 2:
				CapituloDeLivro cap = new CapituloDeLivro();
				System.out.println("Digite o nome do autor do cap�tulo do livro, sem o �ltimo sobrenome:");
				String nomeCapitulo = sc.nextLine();
				cap.setAutorNome(nomeCapitulo);

				System.out.println("Digite o �ltimo sobrenome do autor do cap�tulo do livro:");
				String sobrenomeCapitulo = sc.next();
				cap.setAutorSobrenome(sobrenomeCapitulo);
				sc.nextLine();

				System.out.println("Informe o t�tulo do livro:");
				String tituloLivro = sc.nextLine();
				cap.setTitulo(tituloLivro);

				System.out.println("Informe o t�tulo do cap�tulo do livro:");
				String tituloCapitulo = sc.nextLine();
				cap.setCapitulo(tituloCapitulo);

				System.out.println("Agora informe o n�mero da edi��o:");
				Integer edicaoCapitulo = sc.nextInt();
				cap.setEdicao(edicaoCapitulo);
				sc.nextLine();

				System.out.println("Editora:");
				String editoraCapitulo = sc.nextLine();
				cap.setEditora(editoraCapitulo);

				System.out.println("Qual � o local da publica��o?");
				String localCapitulo = sc.nextLine();
				cap.setLocal(localCapitulo);

				System.out.println("Qual � o ano de publica��o do livro?");
				Integer anoCapitulo = sc.nextInt();
				cap.setAnoPublicacao(anoCapitulo);

				System.out.println("Quantas p�ginas tem o livro?");
				Integer paginasCapitulo = sc.nextInt();
				cap.setTotalPaginas(paginasCapitulo);

				System.out.println("Em que p�gina come�a o cap�tulo do livro?");
				Integer pagInicialCapitulo = sc.nextInt();
				cap.setPaginaInicial(pagInicialCapitulo);

				System.out.println("Em que p�gina termina o cap�tulo do livro?");
				Integer pagFinalCapitulo = sc.nextInt();
				cap.setPaginaFinal(pagFinalCapitulo);

				cap.imprimirCapituloDeLivro();
				System.out.println("");

				break;

			case 3:

				ArtigoPeriodico art = new ArtigoPeriodico();
				System.out.println("Digite o nome do autor do artigo de revista, sem o �ltimo sobrenome:");
				String nomeArtigo = sc.nextLine();
				art.setAutorNome(nomeArtigo);

				System.out.println("Digite o �ltimo sobrenome do autor: ");
				String sobrenomeArtigo = sc.next();
				art.setAutorSobrenome(sobrenomeArtigo);
				sc.nextLine();

				System.out.println("Informe o t�tulo da Revista:");
				String nomeRevista = sc.nextLine();
				art.setNomeRevista(nomeRevista);

				System.out.println("Informe o t�tulo do artigo: ");
				String tituloArtigo = sc.nextLine();
				art.setTitulo(tituloArtigo);

				System.out.println("Agora informe o volume da Revista:");
				Integer volumeArtigo = sc.nextInt();
				art.setVolume(volumeArtigo);
				sc.nextLine();

				System.out.println("Qual � o local da publica��o?");
				String localArtigo = sc.nextLine();
				art.setLocal(localArtigo);

				System.out.println("Qual � o ano de publica��o da Revista?");
				Integer anoArtigo = sc.nextInt();
				art.setAnoPublicacao(anoArtigo);

				System.out.println("Qual � o m�s de publica��o da Revista?");
				String mesArtigo = sc.next();
				art.setMesPublicacao(mesArtigo);

				System.out.println("Em que p�gina come�a o Artigo?");
				Integer pagInicialArtigo = sc.nextInt();
				art.setPaginaInicial(pagInicialArtigo);

				System.out.println("Em que p�gina termina o Artigo?");
				Integer pagFinalArtigo = sc.nextInt();
				art.setPaginaFinal(pagFinalArtigo);

				art.imprimirArtigo();
				System.out.println("");

				break;

			case 4:

				Tese tese = new Tese();

				System.out.println(" Trata-se de uma Monografia, Disserta��o ou Tese? ");
				System.out.println("1 - Monografia; 2 - Disserta��o; 3 - Tese");
				int t = sc.nextInt();
				String tipo = null;
				
				if (t == 1) {

					tipo = "Monografia";
				} else if (t == 2) {

					tipo = "Disserta��o";

				} else if (t == 3) {
					tipo = "Tese";
				}
				sc.nextLine();
				System.out.println("Digite o nome do autor da " + tipo + ":");
				String nomeTese = sc.nextLine();
				tese.setAutorNome(nomeTese);

				System.out.println("Digite o �ltimo sobrenome do autor: ");
				String sobrenomeTese = sc.next();
				tese.setAutorSobrenome(sobrenomeTese);
				sc.nextLine();

				System.out.println("Informe o t�tulo da " + tipo + ": ");
				String tituloTese = sc.nextLine();
				tese.setTitulo(tituloTese);

				System.out.println("Qual � o ano de apresenta��o da " + tipo + "?");
				Integer anoTese = sc.nextInt();
				tese.setAnoPublicacao(anoTese);
				sc.nextLine();
				
				System.out.println("Qual � o local da publica��o?");
				String localTese = sc.nextLine();
				tese.setLocal(localTese);

				System.out.println("Quantas p�ginas tem a " + tipo + "?");
				Integer paginasTese = sc.nextInt();
				tese.setTotalPaginas(paginasTese);
				sc.nextLine();
				
				System.out.println("Qual � a �rea de Concentra��o da " + tipo + "?");
				String areaConcentracao = sc.nextLine();
				tese.setAreaConcentracao(areaConcentracao);
				
				System.out.println("Qual � a institui��o onde a " + tipo + " foi apresentada?");
				String instituicaoTese = sc.nextLine();
				tese.setInstituicao(instituicaoTese);
				

				tese.imprimirTese();
				System.out.println("");

				break;

			}
			System.out.println("Voc� deseja formatar uma nova refer�ncia?");
			System.out.println("1 - para SIM");
			System.out.println("2 - para N�O");
			m = sc.nextInt();

		} while (m == 1);

		System.out.println("*** PROGRAMA ENCERRADO ***");
		System.out.println("*** Desenvolvido por Jo�o Pedro ***");

		sc.close();

	}

}
