import java.util.Vector;
import java.io.*;

public class Menu {
	private TodosAnimais ta;
	private TodosRestaurantes tr;
	private TodosShows ts;
	private ValidacoesGeral vg;
	private FicheiroTexto ft;
	
	public Menu() {
		ta = new TodosAnimais();
		tr = new TodosRestaurantes();
		ts = new TodosShows();
		vg = new ValidacoesGeral();
		ft = new FicheiroTexto();
	}
	
	public void menu() {		
		int op;
		do {
			/*
			System.out.println("										MENU								");
			System.out.println("1. Ler ficheiro de texto.");
			System.out.println("2. Calcular a quantidade de animais, e a quantidade total de animais.");
			System.out.println("3. Lucro total obtido pelos restaurantes e o lucro por cada tipo de restaurante.");
			System.out.println("4. Visualizar todos os dados de animais, restaurantes, e shows, e separadamente por especie, pelos diferentes tipos existentes.");
			System.out.println("5. Pesquisar um show, recebendo o codigo ou nome do Show.");
			System.out.println("6. Calcular o valor total obtido pelos shows.");
			System.out.println("7. Remover um Restaurante pelo nome.");
			System.out.println("8. Visualizar qual o animal que mais rendeu em termos monetarios no show.");
			System.out.println("9. Visualizar o animal mais antigo do jardim zoologico.");
			System.out.println("10. Sair.");
			*/
			menuMensagem();
			op = vg.validarInt("Introduza a opcao: ", 1, 13);
			
			switch(op) {
			case 1: ta.lerDFicheiroAni();
				tr.lerFicheiroRes();
				ts.lerFicheiroShow();
				
				System.out.println("Ficheiro lido com sucesso."); break;
				
			case 2: ta.adaptQtdEspAni(); break;
			
			case 3: tr.adaptLucros(); break;
			
			case 4:
				int op1;
				do{
					System.out.println("1. Visualizar dados dos animais, restaurantes e shows.");
					System.out.println("2. Visualizar dados de animais por especie.");
					System.out.println("3. Visualizar dados de cada tipo de restaurante.");
					System.out.println("4. Voltar para menu principal.");
					op1 = vg.validarInt("Introduza a opcao: ", 1, 4);
					
					switch(op1) {
					case 1: System.out.println("Dados de Animais: ");
						ta.adaptVisu();
						System.out.println();
						System.out.println("Dados de Restaurantes: ");
						tr.visuRestaurante();
						System.out.println();
						System.out.println("Dados de Shows: ");
						ts.visuShows(); break;
						
					case 2: ta.adaptVisuSeparadoAnimal(); break;
					
					case 3: tr.visuSeparadoRes(); break;
					
					}
				}while(op1!=4); break;
				
			case 5: int code = vg.validarInt("Introduza o codigo do show: ", 0, 999);
				String nome = vg.validarString("Introduza o nome do show: ");
				/*
				System.out.println("Introduza o codigo ou nome do show: ");
				int code = vg.validarCodigo(0, 999);
				String nome = vg.validarNome(); 
				*/
				ts.adaptPesquisarShows(code, nome); break;
				
			case 6: ts.adaptValorTotalShow();
					break;
			
			case 7: String nomeRe = vg.validarString("Introduza o nome do responsavel: ");
				tr.adaptRemoverRes(nomeRe);
				System.out.println("Dados depois da remocao: ");
				tr.visuResRemocao(); break;
				
			case 8: 
				System.out.println("Pesquisa o show atraves do codigo e nome.");
				int codeS = vg.validarInt("Introduza o codigo do show: ", 0, 999);
				
				System.out.println("Alterar.");
				int codeAni = vg.validarInt("Introduza o codigo do animal: ", 0, 999);
				String nomeAni = vg.validarString("Introduza o nome do animal: ");
				ts.adaptAlteracao(codeS, "", codeAni, nomeAni); break;
				
			case 9: System.out.println("O animal que mais rendeu em termos monetarios: ");
				ts.adaptAnimalProfit(); break;
				
			case 10: System.out.println("O animal mais antigo: ");
				ta.adaptAnimalAntigo(); break;
				
			case 11: System.out.println("Info de Animais: ");
				ta.adaptEscFichAni();
				ta.adaptLerFichAni();
				System.out.println();
				System.out.println("Info de Restaurantes: ");
				tr.adaptEscFichRes();
				tr.adaptLerFichRes();
				System.out.println();
				System.out.println("Info de Shows: ");
				ts.adaptEscFichShow();
				ts.adaptLerFichShow(); 
				System.out.println(); break;
				
			case 12: 
				System.out.println("Escrevendo os valores dos animais");
				Vector vs = ts.getVs(); // vector de shows
				ta.adaptFichTexto(vs);
				break;
				
			case 13: 
				System.out.println("========================================================================================================");
            	System.out.println("||                                     Obrigada!Volte Sempre!                                         ||");
            	System.out.println("========================================================================================================");
			}
		}while(op!=13);
	}
	
	public void menuMensagem(){
	       System.out.print("||=================================================================================================================================================||" +"\n"+
	                        "||                                                                 Menu Principal                                                                  ||" +"\n"+
	                        "||=================================================================================================================================================||" +"\n"+
	                        "||  1.  Ler o ficheiro de texto.                                                                                                                   ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||" +"\n"+
	                        "||  2.  Calcular a quantidade de animais, e a quantidade total de animais.                                                                         ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||" +"\n"+
	                        "||  3.  Lucro total obtido pelos restaurantes e o lucro por cada tipo de restaurante.                                                              ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||" +"\n"+
	                        "||  4.  Visualizar todos os dados de animais, restaurantes, e shows, e separadamente por especie, pelos diferentes tipos existentes.               ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||" +"\n"+
	                        "||  5.  Pesquisar um show, recebendo o codigo ou nome do Show.                                                                                     ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||" +"\n"+
	                        "||  6.  Calcular o valor total obtido pelos shows.                                                                                                 ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||" +"\n"+
	                        "||  7.  Remover um Restaurante pelo nome.                                                                                                          ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||" +"\n"+
	                        "||  8.  Alterar o código do animal e o nome do animal, recebendo o código do show.                                                                 ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||" +"\n"+
	                        "||  9.  Visualizar qual o animal que mais rendeu em termos monetarios no show.                                                                     ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||" +"\n"+
	                        "||  10. Visualizar o animal mais antigo do jardim zoologico.                                                                                       ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||" +"\n"+
	                        "||  11. Escrever os dados num ficheiro de objectos, e ler do ficheiro de Objectos                                                                  ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||"+"\n"+
	                        "||  12. Escrever as especies e seus valores                                                                                                        ||" +"\n"+
	                        "||-------------------------------------------------------------------------------------------------------------------------------------------------||"+"\n"+
	                        "||  13. Sair do programa.                                                                                                                          ||"+"\n"+
	                        "||=================================================================================================================================================||" +"\n"+
	                        "||                                       |             Introduza Uma Opcao Do Menu                |                                                ||" +"\n"+
	                        "||=================================================================================================================================================||" +"\n");

	        System.out.println("");

	        
	    }

}
