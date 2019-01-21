package section_5.factory_pattern.domain;

import section_5.factory_pattern.model.Transport;

/**
 * Abstrakte Factory Oberklasse.
 * @author ctschubel
 *
 */
public abstract class TransportFactory {

	//Factory Method
	protected abstract Transport transportFactory(String transportType);

	public Transport manageTransportForCustomer(final String transportType) {
		//Delegation der Objekterzeugung an Subklasse.
		return transportFactory(transportType);
	}

}
