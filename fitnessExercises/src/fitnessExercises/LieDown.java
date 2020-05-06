package fitnessExercises;

public class LieDown implements Exercises {
	private PracticeTrainer practiceTrainer;
	
	public LieDown(PracticeTrainer practiceTrainer) {
		this.practiceTrainer = practiceTrainer;
	}
	
	@Override
	public void execute() {
		this.practiceTrainer.LieDown();
	}

}
