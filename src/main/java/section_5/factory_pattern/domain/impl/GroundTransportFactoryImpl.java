package section_5.factory_pattern.domain.impl;

import section_5.factory_pattern.domain.TransportFactory;
import section_5.factory_pattern.model.Transport;
import section_5.factory_pattern.model.impl.SeaTransport;
import section_5.factory_pattern.model.impl.StreetTransport;
import section_5.factory_pattern.model.impl.TrainTransport;


/**
 * Konkrete Factory Klasse.
 * @author ctschubel
 *
 */
public class GroundTransportFactoryImpl extends TransportFactory {

	@Override
	protected Transport transportFactory(final String transportType) {

		switch(transportType) {
		case("sea"): return new SeaTransport();
		case("street"): return new StreetTransport();
		case("train"): return new TrainTransport();
		default: {
			System.out.println( transportType + " is an invalid transport type!");
			return null;
		}
		}
	}

}
