package animals;

import behavior.Swim;
import service.CharacterService;
import service.impl.DogCharacterService;

/**
 * @author liva
 */
public class Dog extends Animal implements Swim {

	CharacterService characterService = new DogCharacterService();

	public Dog(String name, Gender gender) {
		super(name, gender);
	}

	@Override
	public int jump() {
		CharacterValue characterValue = characterService.getCharacterValue(ActType.JUMP, getGender());
		return characterValue.getValue();

	}

	@Override
	public int run() {
		CharacterValue characterValue = characterService.getCharacterValue(ActType.RUN, getGender());
		return characterValue.getValue();

	}

	@Override
	public int swim() {
		CharacterValue characterValue = characterService.getCharacterValue(ActType.SWIM, getGender());
		return characterValue.getValue();

	}
}
