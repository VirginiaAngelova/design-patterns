package fitnessExercises;

public class FitnessOnlineMain {

	public static void main(String[] args) {
		FitnessInstructor fitnessInstructor = new FitnessInstructor();
		PracticeTrainer practiceTrainer = new PracticeTrainer();
		
		IFitnessParticipants participant1 = new Participants("Ivan");
		IFitnessParticipants participant2 = new Participants("Georgi");
		IFitnessParticipants participant3 = new Participants("Petur");
		
		practiceTrainer.subsrcibre(participant1);
		practiceTrainer.subsrcibre(participant2);
		practiceTrainer.subsrcibre(participant3);
	
		LieDown lieDown = new LieDown(practiceTrainer);
		fitnessInstructor.setExercises(lieDown);
		fitnessInstructor.Instruction();
		practiceTrainer.setExercise("Lie down");
		
		GetUp getUp = new GetUp(practiceTrainer);
		fitnessInstructor.setExercises(getUp);
		fitnessInstructor.Instruction();
		practiceTrainer.setExercise("Get Up");
		
		practiceTrainer.unsubscribe(participant1);
		practiceTrainer.unsubscribe(participant2);
		practiceTrainer.unsubscribe(participant3);
		
		
		
		
	
		

	}

}
