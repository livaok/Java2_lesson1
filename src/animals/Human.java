package animals;

import behavior.Swim;
import service.CharacterService;
import service.impl.HumanCharacterService;

/**
 * @author liva
 */
public class Human extends Animal implements Swim {

	private CharacterService characterService = new HumanCharacterService();

	public Human(String name, Gender gender) {
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
