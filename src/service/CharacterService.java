package service;

import animals.ActType;
import animals.CharacterValue;
import animals.Gender;

/**
 * @author liva
 */
public interface CharacterService {

	CharacterValue getCharacterValue(ActType actType, Gender gender);

}
