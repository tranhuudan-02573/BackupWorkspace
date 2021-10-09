package AbstractFactory2;


/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
	Button createButton();

	Checkbox createCheckbox();
}
