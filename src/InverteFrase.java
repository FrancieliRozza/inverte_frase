import java.util.Scanner;

public class InverteFrase {
	
	public static void main(String[] args){
		Scanner entrada =  new Scanner(System.in);
		while(true){
			System.out.println("Digite uma frase");
			String valoresEntrada = entrada.nextLine();
			String fraseInvertida = inverte(valoresEntrada);
			System.out.println("frase invertida:"+fraseInvertida);
			System.out.println("Deseja digitar mais frases? (1)sim (2)não");
			String valoresEntradaContinucao = entrada.nextLine();
			if(valoresEntradaContinucao.equals("2")) {
				break;
			}
		}
		
	}

	public static String inverte(String frase) {
		String fraseInvertida = "";
		
		for(int i = frase.length()-1; i >= 0; i--){
			 fraseInvertida = fraseInvertida + frase.charAt(i);
		};
		
		return fraseInvertida;
	}

}
