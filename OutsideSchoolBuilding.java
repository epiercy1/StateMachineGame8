import java.util.ArrayList;

public class OutsideSchoolBuilding extends State{
	private Model model;
	
	public OutsideSchoolBuilding(Model model) {
		this.model = model;
	}
	
	@Override
	public String getDescription() {
		String description = "You decided to go to school. You walk very quickly and make it outside the school building just in time. There, you see your best friend and decide to talk to her. You two have been best friends since childhood. After a leghthy conversation, she asks you if you want to skip class and hang out in the Playground. Do you want to skip class?";
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
			model.setCurrentState(StateType.Playground);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.Classroom);
		}
	}

}
