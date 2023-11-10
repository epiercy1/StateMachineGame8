import java.util.ArrayList;

public class Auditorium extends State{
	private Model model;
	
	public Auditorium(Model model) {
		this.model = model;
	}
	
	@Override
	public String getDescription() {
		String description = "You decide to go with your friend to the club meeting. You follow her to the auditorium. There, you meet three other girls. The first is a shy girl with long, black hair and blue eyes. The second is a cute but tough girl with short, blond hair and green eyes. The third is the Club President. She is the most popular girl in school. She has long brown hair with matching eyes. The Club President asks you if you want to join the club. Do you want to join the club?";
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
			model.setCurrentState(StateType.Cafeteria);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.EndOfGame);
		}
	}
}
