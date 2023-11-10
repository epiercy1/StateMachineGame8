import java.util.ArrayList;

public class Playground extends State{
	private Model model;
	
	public Playground(Model model) {
		this.model = model;
	}
	
	@Override
	public String getDescription() {
		String description = "You decide to go to the playground with your friend since you are not doing anything important in class today other than lectures. After a while of hanging out, she asks you if you want to go with her to her club meeting. She is the Vice President of the Musical Theater Club. Do you want to go to her club meeting?";
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
