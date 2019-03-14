package animals;

import service.CharacterService;
import service.impl.CatCharacterService;

/**
 * @author liva
 */
public class Cat extends Animal {

	public Cat(String name, Gender gender) {
		super(name, gender);
	}

	private CharacterService characterService = new CatCharacterService();

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
}
