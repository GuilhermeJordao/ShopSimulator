package app;

//Definindo a Importação das Classes
import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;
//Definindo Classe Aplicação
public class Application {
	// Criando variavel Button
	private Button button;
	// Criando variavel Checkbox
	private Checkbox checkbox;
	//Construtor que Recebe GuiFactory 
	public Application(GUIFactory factory) {
		//A variaveis recebem o Retorno do método que sera utilizado na implementação da interface
		button = factory.createButton();
		//A variaveis recebem o Retorno do método que sera utilizado na implementação da interface
		checkbox = factory.createCheckbox();
	}
	//Criando o Método Paint
	public void paint() {
		button.paint();//Utilizando a variavel do construtor para chamar paint 
		checkbox.paint();//Utilizando a variavel do construtor para chamar paint 
	}
}
