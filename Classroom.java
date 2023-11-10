import java.util.ArrayList;

public class Classroom extends State{
	private Model model;
	
	public Classroom(Model model) {
		this.model = model;
	}
	
	@Override
	public String getDescription() {
		String description = "You decide to go to class since you are taking a test today. Your friend meets you in the classroom after the class period is over. While there she asks you if you want to come to her club meeting. She is the Vice President of the Musical Theater Club. Do you want to join her?";
		return description;
	}

	@Override
	public ArrayList<String> getOptions() {
		ArrayList<String>getOptions = new ArrayList<String>();
		getOptions.add("Type 1 for yes");
		getOptions.add("Type 2 for no");
		return getOptions;
		
	}

	@Override
	public void processChoice(int choice) {
		if(choice == 1) {
			model.setCurrentState(StateType.Auditorium);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.EndOfGame);
		}
	}

}
