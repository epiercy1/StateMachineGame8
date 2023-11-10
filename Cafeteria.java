import java.util.ArrayList;

public class Cafeteria extends State{
	private Model model;
	
	public Cafeteria(Model model) {
		this.model = model;
	}
	
	@Override
	public String getDescription() {
		String description = "You decide to join the club so you can get closer to each of these girls. Maybe you can start a relationship with one of them? You and the four girls go to the cafeteria for lunch. While there, the girls discuss the upcoming musical they are performing. Each of the girls are doing something different. The shy girl is designing the set. The cute girl is doing coreography. The Club President is writing the script. Your friend is writing the lyrics for the songs. Which one of these girls do you want to help out?";
		return description;
	}

	@Override
	public ArrayList<String> getOptions() {
		ArrayList<String>getOptions = new ArrayList<String>();
		getOptions.add("Type 1 for the shy girl");
		getOptions.add("Type 2 for the cute girl");
		getOptions.add("Type 2 for the Club President");
		getOptions.add("Type 2 for your best friend");
		return getOptions;
		
	}

	@Override
	public void processChoice(int choice) {
		if(choice == 1) {
			model.setCurrentState(StateType.Hallway1);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.Hallway2);
		}
		if(choice == 3) {
			model.setCurrentState(StateType.Hallway3);
		}
		if(choice == 4) {
			model.setCurrentState(StateType.Hallway4);
		}
	}
}
