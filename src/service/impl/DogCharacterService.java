package service.impl;

import animals.ActType;
import animals.CharacterValue;
import animals.Gender;
import service.CharacterService;

/**
 * @author liva
 */
public class DogCharacterService implements CharacterService {

	CharacterValue characterValue = new CharacterValue();

	@Override
	public CharacterValue getCharacterValue(ActType actType, Gender gender) {
		if (actType == ActType.RUN) {
			if (gender == Gender.MALE) {
				characterValue.setName("���, ������");
				characterValue.setValue(2000);
			}
			else {
				characterValue.setName("���, ������");
				characterValue.setValue(1500);
			}
		}
		else if (actType == ActType.JUMP) {
			if (gender == Gender.MALE) {
				characterValue.setName("������, ������");
				characterValue.setValue(2);
			}
			else {
				characterValue.setName("������, ������");
				characterValue.setValue(1);
			}
		}
		else if (actType == ActType.SWIM) {
			if (gender == Gender.MALE) {
				characterValue.setName("�����, ������");
				characterValue.setValue(2000);
			}
			else {
				characterValue.setName("�����, ������");
				characterValue.setValue(1500);
			}
		}

		return characterValue;
	}
}
