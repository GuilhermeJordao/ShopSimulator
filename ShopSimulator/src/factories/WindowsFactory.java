package factories;

import button.Button;
import checkbox.Checkbox;
import button.WindowsButton;
import checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
	//Sobrescreve o M�todo
	@Override
	//Definindo M�todo createButton() que retorna o um MacOSButton();
	public Button createButton() {
		return new WindowsButton();
	}
	//Sobrescreve o M�todo
	@Override
	//Definindo M�todo createCheckbox() que retorna o um MacOSCheckbox();
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
