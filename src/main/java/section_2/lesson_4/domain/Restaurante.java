package section_2.lesson_4.domain;

//To many Information for one Interface --> Split up to Payment Rating and Orders interfaces.
/**
 * @author ctschubel
 *
 */
public interface Restaurante {

	void payCreditCard();
	void payCash();
	void payWithSmartphone();
	void customerRatingService();
	void takeTelephoneOrder();

}
