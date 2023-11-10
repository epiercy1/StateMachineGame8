import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private HashMap<StateType, State> states = new HashMap<StateType, State> ();
	
	public static void main(String[] args) {
		Main m = new Main();
		m.go();
	}
	public void go(){
		Model model = new Model();
		StateType currentStateType = model.getCurrentState();
		
		createStates(model);
		
		//StateType = StateType.valueOf(input.nextLine ());

		
		while(currentStateType != StateType.EndOfGame) {
			State currentState = states.get(currentStateType);
					
			String description = currentState.getDescription();
			System.out.println(description);
			
			Scanner scanner = new Scanner(System.in);
			
			ArrayList<String>options = currentState.getOptions();
			
			System.out.println(options);
			
			int choice = scanner.nextInt();
			//output.println (StateType);
			
			//get the user's choice
			
			currentState.processChoice(choice);
			
			currentStateType = model.getCurrentState();
			
		}
	}
	
	public void createStates(Model model) {
		states.put(StateType.StreetOutsideHouse, new StreetOutsideHouse(model));
		states.put(StateType.OutsideSchoolBuilding, new OutsideSchoolBuilding(model));
		states.put(StateType.Classroom, new Classroom(model));
		states.put(StateType.Playground, new Playground(model));
		states.put(StateType.Auditorium, new Auditorium(model));
		states.put(StateType.Cafeteria, new Cafeteria(model));
		states.put(StateType.Hallway1, new Hallway1(model));
		states.put(StateType.Hallway2, new Hallway2(model));
		states.put(StateType.Hallway3, new Hallway3(model));
		states.put(StateType.Hallway4, new Hallway4(model));
		states.put(StateType.LivingRoom1, new LivingRoom1(model));
		states.put(StateType.LivingRoom2, new LivingRoom2(model));
		states.put(StateType.LivingRoom3, new LivingRoom3(model));
		states.put(StateType.LivingRoom4, new LivingRoom4(model));
		states.put(StateType.FrontLawn1, new FrontLawn1(model));
		states.put(StateType.FrontLawn2, new FrontLawn2(model));
		states.put(StateType.FrontLawn3, new FrontLawn3(model));
		states.put(StateType.Backstage1, new Backstage1(model));
		states.put(StateType.Backstage2, new Backstage2(model));
		states.put(StateType.Backstage3, new Backstage3(model));
		states.put(StateType.Backstage4, new Backstage4(model));
		states.put(StateType.Ending1,new Ending1(model));
		states.put(StateType.Ending2,new Ending2(model));
		states.put(StateType.Ending3,new Ending3(model));
		states.put(StateType.Ending4,new Ending4(model));
	}
}
