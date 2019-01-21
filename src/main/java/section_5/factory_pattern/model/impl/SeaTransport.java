package section_5.factory_pattern.model.impl;

import section_5.factory_pattern.model.Transport;


/**
 * @author ctschubel
 *
 */
public class SeaTransport implements Transport {

	@Override
	public void transportStuff() {
		System.out.println("Transport by sea.");

	}

}
