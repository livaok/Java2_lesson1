import animals.*;


/**
 * @author liva
 */
public class ProgramLauncher {

	public static void main(String[] args) {

		Course course = new Course(20000, 1);
		Team cats = new Team(new Cat("a", Gender.FEMALE), new Cat("b", Gender.MALE));
		course.doIt(cats);
	}
}
