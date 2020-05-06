package fitnessExercises;

import java.util.ArrayList;
import java.util.List;

public class PracticeTrainer implements IPracticeTeacher {
	
	public List<IFitnessParticipants> participants = new ArrayList<IFitnessParticipants>();
	public String exercise;
	private Boolean lieDown;
	
	public void LieDown() {
		System.out.println("Lie down!");
		this.lieDown = true;
	}
	
	public void GetUp() {
		System.out.println("Get up!");
		this.lieDown = false;
	}
	
	@Override
	public void subsrcibre(IFitnessParticipants iFintessParticipants) {
		this.participants.add(iFintessParticipants);
		iFintessParticipants.setPractice(this);
		
	}

	@Override
	public void unsubscribe(IFitnessParticipants iFintessParticipants) {
		this.participants.remove(iFintessParticipants);
		
	}

	@Override
	public void notifyFitnessParticipants() {
		for(IFitnessParticipants iFintessParticipants:this.participants) {
			iFintessParticipants.update();
		}
		
	}
	public void setExercise(String exercise) {
		this.exercise=exercise;
		this.notifyFitnessParticipants();
	}
	@Override
	public String getUpdate() {
		return this.exercise;
	}

}
