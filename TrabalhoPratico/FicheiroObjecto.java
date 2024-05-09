import java.io.*;
import java.util.Vector;

public class FicheiroObjecto 
{
	public FicheiroObjecto() {}
	
	public void lerFichObj(Vector vc) 
	{
		try 
		{
			FileInputStream fis = new FileInputStream("TodosDados.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			vc = (Vector) ois.readObject();
			System.out.println("Ficheiro de objectos lido com sucesso!");
			ois.close();
		} 
		catch(FileNotFoundException f) { System.out.println("Ficheiro nao encontrado!"); }
		catch(ClassNotFoundException c) { System.out.println(c.getMessage());}
		catch(IOException io) { System.out.println(io.getMessage()); }
	}
	
	public void escreverFichObj(Vector vc) 
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream("TodosDados.dat");
			ObjectOutputStream os = new ObjectOutputStream(fos);		
			os.writeObject(vc);
			System.out.println("Ficheiro de objectos gravado com sucesso!");
			os.close();
		}
		catch(IOException io) { System.out.println(io.getMessage()); }
	}
	
}