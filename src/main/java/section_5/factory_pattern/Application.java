package section_5.factory_pattern;

import section_5.factory_pattern.domain.TransportFactory;
import section_5.factory_pattern.domain.impl.GroundTransportFactoryImpl;

/**
 * @author ctschubel
 *
 */
public class Application {

	public static void main(final String[] args) {
		TransportFactory groundTransportFactory = new GroundTransportFactoryImpl();
		groundTransportFactory.manageTransportForCustomer("sea").transportStuff();
		groundTransportFactory.manageTransportForCustomer("train").transportStuff();
		groundTransportFactory.manageTransportForCustomer("street").transportStuff();
	}

}
