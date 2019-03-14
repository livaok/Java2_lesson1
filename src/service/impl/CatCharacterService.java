package service.impl;

import animals.ActType;
import animals.CharacterValue;
import animals.Gender;
import service.CharacterService;

/**
 * @author liva
 */
public class CatCharacterService implements CharacterService {

	CharacterValue characterValue = new CharacterValue();

	@Override
	public CharacterValue getCharacterValue(ActType actType, Gender gender) {
		if (actType == ActType.RUN) {
			if (gender == Gender.MALE) {
				characterValue.setName("Бег, метров");
				characterValue.setValue(500);
			}
			else {
				characterValue.setName("Бег, метров");
				characterValue.setValue(300);
			}
		}
		else if (actType == ActType.JUMP) {
			if (gender == Gender.MALE) {
				characterValue.setName("Высота, метров");
				characterValue.setValue(3);
			}
			else {
				characterValue.setName("Высота, метров");
				characterValue.setValue(2);
			}
		}
		return characterValue;
	}
}
