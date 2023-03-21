package factories;

//Importando Dependencias
import button.Button;
import checkbox.Checkbox;
//Criando Interface GUIFactory 
public interface GUIFactory {
	//Criando Métodos que Serão Utilizados Nas classes MacOS
	 Button createButton();
	 Checkbox createCheckbox();
}
