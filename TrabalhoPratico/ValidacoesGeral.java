import java.io.*;
public class ValidacoesGeral {
	
	public ValidacoesGeral() {}
	
	public String validarString(String msg) {
		String a = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println(msg);
				a = br.readLine();
			}catch(IOException i) {
				i.printStackTrace();
			}
			
			if(a.length() < 3 || a.equals(" ")) {
				System.out.println("Invalido!");
			}
		}while(a.length() < 3 || a.equals(" "));
		
		return a;
	}
	
	//validar nome
	public String validarNome() {
		String a = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				//System.out.println(msg);
				a = br.readLine();
			}catch(IOException i) {
				i.printStackTrace();
			}
			
			if(a.length() < 3 || a.equals(" ")) {
				System.out.println("Invalido!");
			}
		}while(a.length() < 3 || a.equals(" "));
		
		return a;
	}
	
	public int validarInt(String msg, int min, int max) {
		int b = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println(msg);
				b = Integer.parseInt(br.readLine());
			}catch(NumberFormatException n) {
				System.out.println(n.getMessage());
			}catch(IOException i) {
				i.printStackTrace();
			}
			
			if(b < min || b > max) {
				System.out.println("Numero invalido!");
			}
		}while(b < min || b > max);
		
		return b;
	}
	
	//validar codigo
	public int validarCodigo(int min, int max) {
		int b = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				//System.out.println(msg);
				b = Integer.parseInt(br.readLine());
			}catch(NumberFormatException n) {
				System.out.println(n.getMessage());
			}catch(IOException i) {
				i.printStackTrace();
			}
			
			if(b < min || b > max) {
				System.out.println("Numero invalido!");
			}
		}while(b < min || b > max);
		
		return b;
	}

}
