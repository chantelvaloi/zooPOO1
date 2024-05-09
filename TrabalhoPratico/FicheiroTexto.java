import java.io.*;
import java.util.Vector;

//>Escrever no ficheiro de texto, espécie animal e valor total obtido por espécie no show.
 
public class FicheiroTexto {

	public FicheiroTexto() {}
	
	public void escrFichTexto(float va, float vm, float vaq) {		
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter("FicheiroTexto.txt"));
			
			bf.write("Aves;"+va);
			bf.newLine();
			bf.write("Aquatico;"+vaq);
			bf.newLine();
			bf.write("Mamiferos;"+vm);
			
			bf.close();
		}catch(IOException i) {
			System.out.println("Erro ao escrever no ficheiro");
		}
	}
}
