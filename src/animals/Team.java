package animals;

/**
 * @author liva
 */
public class Team {

	public String nameTeam;
	Animal animal1;
	Animal animal2;
	//Animal animal3;

	public Animal getAnimal1() {
		return animal1;
	}

	public void setAnimal1(Animal animal1) {
		this.animal1 = animal1;
	}

	public Animal getAnimal2() {
		return animal2;
	}

	public void setAnimal2(Animal animal2) {
		this.animal2 = animal2;
	}

	public Team(Animal animal1, Animal animal2){
		this.animal1 = animal1;
		this.animal2 = animal2;
	}
}


