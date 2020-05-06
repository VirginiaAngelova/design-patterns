package fitnessExercises;

public class GetUp implements Exercises {
	private PracticeTrainer practiceTrainer;
	
	public GetUp(PracticeTrainer practiceTrainer) {
		this.practiceTrainer = practiceTrainer;
	}

	@Override
	public void execute() {
		this.practiceTrainer.GetUp();
	}

}
