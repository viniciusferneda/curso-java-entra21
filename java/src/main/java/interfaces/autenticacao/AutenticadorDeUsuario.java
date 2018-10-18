package interfaces.autenticacao;

public class AutenticadorDeUsuario {

	public static boolean autentica(Usuario u) {
		System.out.println("Usuário: "+u.getUsuario());
		if(u.getUsuario().equals("jose") && u.getSenha().equals("123456")){
			System.out.println("Logado");
			return true;
		}
		System.out.println("Login ou senha inválidos");
		return false;
	}

}
