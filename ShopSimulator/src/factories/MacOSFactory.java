package factories;

//Importando Dependencias
import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

//Determinando Classse MacOSFactory que ira implementar os M�todos da Interface GUIFactory
public class MacOSFactory implements GUIFactory{
	//Sobrescreve o M�todo
	@Override
	
	//Definindo M�todo createButton() que retorna o um MacOSButton();
	public Button createButton() {
		return new MacOSButton();
	}
	//Sobrescreve o M�todo
	@Override
	//Definindo M�todo createCheckbox() que retorna o um MacOSCheckbox();
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}


}
