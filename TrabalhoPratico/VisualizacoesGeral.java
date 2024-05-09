import java.text.DecimalFormat;
import java.util.Vector;

public class VisualizacoesGeral {
	
	public VisualizacoesGeral() {}
	
	//>Calcular a quantidade de animais, por espécie, e a quantidade total de animais; 
	public void visuQtdAnimais(int aves, int mami, int peix, int rept, int anf, int anim) {
		System.out.println("A quantidade da especie Aves: "+aves+", da especie Mamiferos: "+mami+", de Repteis: "+rept+", de Anfibios: "+anf+", de Peixes: " + peix);
		System.out.println("Totalizando todos animais, temos um total de: "+anim);
	}
		
	//visualizacao separada de Animais
	public void visuSeparadaAnimal(Vector v) {
		Animais a;
		Aquaticos aq;
		Aves av;
		Mamiferos m;
			
		for(int j = 0; j < v.size(); j++) {
			a = (Animais)v.elementAt(j);
			if(a instanceof Aquaticos) {
				aq = (Aquaticos)a;
				System.out.println("Dados da especie Aquatico: \n");
				System.out.println(aq.toString());
			}else {
				if(a instanceof Aves) {
					av = (Aves)a;
					System.out.println("Dados da especie Aves: \n");
					System.out.println(av.toString());
				}else {
					m = (Mamiferos)a;
					System.out.println("Dados da especie Mamifeors \n");
					System.out.println(m.toString());
				}
			}
		}
			
	}
	
	//visualizacao separada de restaurantes
	public void visuSeparadaRestaurante(Vector vc) {
		Restaurantes r;
		Bar b;
		Esplanada e;
		
		for(int i = 0; i < vc.size(); i++) {
			r = (Restaurantes)vc.elementAt(i);
			if(r instanceof Bar) {
				b = (Bar)r;
				System.out.println("Dados do Bar:");
				System.out.println(b.toString());
			}else {
				e = (Esplanada)r;
				System.out.println("Dados das esplanadas:");
				System.out.println(e.toString());
			}
		}
	}
	
	//visualizacao de shows
	public void visuShows(Vector vc) {
		Shows s;
		
		for(int i = 0; i < vc.size(); i++) {
			s = (Shows)vc.elementAt(i);
			System.out.println(s.toString());
		}
	}
	
	//visualizacao de todos os dados
	public void visuAnimal(Vector v) {
		Animais a;
				
		for(int i = 0; i < v.size(); i++) {
			a = (Animais)v.elementAt(i);
			System.out.println(a.toString());
		}
	}
	
	//visualizacao de todos os restaurantes
	public void visuRestaurantes(Vector vc) {
		Restaurantes r;
		
		for(int i = 0; i < vc.size(); i++) {
			r = (Restaurantes)vc.elementAt(i);
			System.out.println(r.toString());
		}
	}
	
	// >Visualizar qual o animal que mais rendeu em termos monetários no show;
	public void visuAnimalProfit(Vector vc) {
		CalculosIVAFinal s;
		float valor = 0;
		int pos = 0;
		
		
		for(int i = 0; i < vc.size(); i++) {
			s = (Shows) vc.elementAt(i);
			if(s.valorFinal() > valor) {
				valor = s.valorFinal();
				pos = i;
				
			}
		}
		System.out.println(vc.elementAt(pos));
	}
	
	//>Visualize o animal mais antigo do jardim zoológico;
	public void visuAnimalAntigo(Vector vc) {
		Animais a;
		int idade = 0;
		
		for(int i = 0; i < vc.size(); i++) {
			a = (Animais)vc.elementAt(i);
			if(a.getIdade() > idade) {
				idade = a.getIdade();
				System.out.println(vc.elementAt(i));
			}
		}
	}

}
