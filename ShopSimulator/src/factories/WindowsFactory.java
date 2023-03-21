package factories;

import button.Button;
import checkbox.Checkbox;
import button.WindowsButton;
import checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
	//Sobrescreve o Método
	@Override
	//Definindo Método createButton() que retorna o um MacOSButton();
	public Button createButton() {
		return new WindowsButton();
	}
	//Sobrescreve o Método
	@Override
	//Definindo Método createCheckbox() que retorna o um MacOSCheckbox();
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
