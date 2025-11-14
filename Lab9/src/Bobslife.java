
public class Bobslife {
	// instance variables also known memory or state of the instance / nouns
	String bobsLo;
	int hunger;
	int fitness;
	int dollars;
	int time;
	boolean isDead;
	boolean inJail;

	// constructor
	Bobslife(String bobsLo, int hunger, int fitness, int dollars) {
		this.bobsLo = verifyLocation(bobsLo);
		this.hunger = hunger;
		this.fitness = fitness;
		this.dollars = dollars;
		time = 0;
		isDead = false;
		inJail = false;

	}

	public String verifyLocation(String bobsLo) {
		if (bobsLo.equals("home") || bobsLo.equals("work") || bobsLo.equals("gym")) {
			return bobsLo;
		} else
			return "home";
	}

	// methods also called functions or behavior / verbs
	public void move(String newLocation) {
		if(inJail || isDead) {
			return;
		}
		newLocation = bobsLo;
	}

	public void nextTime() {
		time++;
		if (bobsLo.equals("home")) {
			hunger -= 3;
			if (hunger < 0) {
				hunger = 0;
			}
			dollars -= 1;
		}

		if (bobsLo.equals("work")) {
			hunger += 2;
			dollars += 3;
			fitness -= 1;

		}

		if (bobsLo.equals("gym")) {
			hunger += 3;
			dollars -= 2;
			fitness += 2;
		}

		if (dollars <= 0) {
			inJail = true;
		}

		if (hunger > 6) {
			isDead = true;
		}

	}

	public String toString() {
		String str = "Time: ";

		str += time;
		str += " - location: ";
		str += bobsLo;
		str += ", - hunger: ";
		str += hunger;
		str += ", - dollars: ";
		str += dollars;
		str += ", - fitness: ";
		str += fitness;

		if (isDead) {
			str += " (Deceased)";
		} else if (inJail) {
			str += " (in Jail)";

		} else {
			str += " (alive and well)";
		}
		return str;

	}

}
