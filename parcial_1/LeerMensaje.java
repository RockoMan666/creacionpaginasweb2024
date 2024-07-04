import java.util.Scanner;
public class LeerMensaje{

	private String texto="";
	Scanner entrada_teclado = new Scanner(System.in);

	public void leer_mensaje(){
		System.out.println("Escribe un mensaje: ");
		texto = entrada_teclado.nextLine();
	}

	public void pinta_mensaje(){
		System.out.println(texto);
	}

}

