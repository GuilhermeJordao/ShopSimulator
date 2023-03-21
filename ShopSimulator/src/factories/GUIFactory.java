package factories;

//Importando Dependencias
import button.Button;
import checkbox.Checkbox;
//Criando Interface GUIFactory 
public interface GUIFactory {
	//Criando M�todos que Ser�o Utilizados Nas classes MacOS
	 Button createButton();
	 Checkbox createCheckbox();
}
