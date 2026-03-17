import java.util.HashMap;
import java.util.Map;

public class GoalTracker {
	
	private String team_name;
	private HashMap<String, Integer> goalData = new HashMap<>();
	
	public GoalTracker(String name){
		this.team_name = name; 
	}
	
	public void printName(){
		System.out.println(team_name);
	}
	
	public void addGoal(String name){
		goalData.put(name, goalData.getOrDefault(name, 0)+1);
	}
	
	public void printTopScorer(){
		int max_goals = 0;
		String top_scorer = ""; 
		
		for(Map.Entry<String, Integer> entry : goalData.entrySet()){
			if (entry.getValue() > max_goals){
				max_goals = entry.getValue();
				top_scorer = entry.getKey();
			}
		}
		System.out.println(top_scorer + ":" + max_goals);
	}
	
	public int getTotal(String name){
		return goalData.getOrDefault(name, 0);
	}
}