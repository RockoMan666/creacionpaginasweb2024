public class programa1{
	public static void main(String[] args) {
		MuestraMensaje objeto01 = new MuestraMensaje();

		objeto01.settexto("hey");

		objeto01.pinta_mensaje();

		MuestraMensaje objeto02 = new MuestraMensaje();

		objeto02.settexto("kekeke");

		objeto02.pinta_mensaje();

		objeto01.pinta_mensaje();
		objeto02.pinta_mensaje();

		LeerMensaje objeto03 = new LeerMensaje();
		objeto03.leer_mensaje();
		objeto03.pinta_mensaje();
	}
}