package factories;

//Importando Dependencias
import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

//Determinando Classse MacOSFactory que ira implementar os Métodos da Interface GUIFactory
public class MacOSFactory implements GUIFactory{
	//Sobrescreve o Método
	@Override
	
	//Definindo Método createButton() que retorna o um MacOSButton();
	public Button createButton() {
		return new MacOSButton();
	}
	//Sobrescreve o Método
	@Override
	//Definindo Método createCheckbox() que retorna o um MacOSCheckbox();
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}


}
