package fitnessExercises;

public class FitnessInstructor {
	private Exercises exercises;

	public Exercises getExercises() {
		return exercises;
	}

	public void setExercises(Exercises exercises) {
		this.exercises = exercises;
	}
	
	public void Instruction() {
		this.exercises.execute();
	}

}
