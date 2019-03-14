package service.impl;

import animals.ActType;
import animals.CharacterValue;
import animals.Gender;
import service.CharacterService;

/**
 * @author liva
 */
public class HumanCharacterService implements CharacterService {

	CharacterValue characterValue = new CharacterValue();

	@Override
	public CharacterValue getCharacterValue(ActType actType, Gender gender) {

		if (actType == ActType.RUN) {
			if (gender == Gender.MALE) {
				characterValue.setValue(60000);
			}
			else {
				characterValue.setValue(56000);
			}
		}
		else if (actType == ActType.JUMP) {
			if (gender == Gender.MALE) {
				characterValue.setValue(1);
			}
			else {
				characterValue.setValue(1);
			}
		}
		else if (actType == ActType.SWIM) {
			if (gender == Gender.MALE) {
				characterValue.setName("Длина, метров");
				characterValue.setValue(20000);
			}
			else {
				characterValue.setName("Длина, метров");
				characterValue.setValue(15000);
			}
		}

		return characterValue;
	}
}
