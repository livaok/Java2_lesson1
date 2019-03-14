package animals;

/**
 * @author liva
 */
public class Course {

	public int distanceRun;
	public int distanceJump;
	//public int distanceSwim;

	public Course(int distanceRun, int distanceJump){
		this.distanceRun = distanceRun;
		this.distanceJump = distanceJump;
		//this.distanceSwim = distanceSwim;
	}

	public void doIt(Team team){
		if (team.getAnimal1().run() > distanceRun && team.getAnimal2().jump() > distanceJump) {
			System.out.println("Дистанция пройдена");
		}
		else {
			System.out.println("Дистанция не пройдена");
		}
	}
}
