package fitnessExercises;

public class Participants implements IFitnessParticipants {
	private String name;
	private IPracticeTeacher participants;
	
	public Participants(String name) {
		this.name= name;
	}
	
	@Override
	public void update() {
		if(this.participants == null) {
			System.out.println(this.name + "has not set exercises");
			return;
		}
		String newExercise = this.participants.getUpdate();
		System.out.println(this.name + "changes the exercise to" + newExercise);
	}
	
	@Override
	public void setPractice(IPracticeTeacher participants) {
		this.participants = participants;
		
	}
	
}
