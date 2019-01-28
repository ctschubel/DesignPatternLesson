package section_5.abstract_factory_pattern.domain;

import section_5.abstract_factory_pattern.model.Engine;
import section_5.abstract_factory_pattern.model.Regulator;

public interface AbstractFactory {
	Regulator createRegulator();

	Engine createEngine();

}
