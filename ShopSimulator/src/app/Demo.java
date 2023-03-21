package app;

import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class Demo {
	private static Application configureApplication() {
		//Criando uma variavel do tipo Application
		Application app;
		//Criando uma variavel do tipo da interface GUIFactory
		GUIFactory factory;
		//Captura a propriedade e armazena na variavel osName
		String osName = System.getProperty("os.name").toLowerCase();
		//Verifica o Conteudo de osName = "Mac"
		if (osName.contains("mac")) {
			//Se for verdade a variavel factory recebe a classe MacOSFcatory 
			// que realiza contrato da interface GUIFactory
			factory = new MacOSFactory();
			// Senão recebe WindowsFactory, que tambem esta implementando o GUIFactory.
		} else {
			factory = new WindowsFactory();
		}
		////app recebe o retorno do construtor de Application.
		app = new Application(factory);
		//Retorna variavel app
		return app;
	}
	
	public static void main (String[] args) {
		////Chamar o metodo e armazenar o retono dele dentro da variavel app.
		Application app = configureApplication();
		//Chamar o metodo para retornar uma mensagem
		app.paint();
	}

}
