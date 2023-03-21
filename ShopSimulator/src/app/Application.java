package app;

//Definindo a Importa��o das Classes
import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;
//Definindo Classe Aplica��o
public class Application {
	// Criando variavel Button
	private Button button;
	// Criando variavel Checkbox
	private Checkbox checkbox;
	//Construtor que Recebe GuiFactory 
	public Application(GUIFactory factory) {
		//A variaveis recebem o Retorno do m�todo que sera utilizado na implementa��o da interface
		button = factory.createButton();
		//A variaveis recebem o Retorno do m�todo que sera utilizado na implementa��o da interface
		checkbox = factory.createCheckbox();
	}
	//Criando o M�todo Paint
	public void paint() {
		button.paint();//Utilizando a variavel do construtor para chamar paint 
		checkbox.paint();//Utilizando a variavel do construtor para chamar paint 
	}
}
