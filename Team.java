
public class Team {
	public Team(String string) {
		// TODO Auto-generated constructor stub
		name = string;
	}
	private Coach headCoach;
	private Coach[] assistantCoaches;
	private Player[] players;
	private Player[] substitutes;
	private String colorOfJerseys;
	private String name;
	public void setHeadCoach(Coach headCoach) {
		this.headCoach = headCoach;
	}
	public void setAssistantCoaches(Coach[] assistantCoaches) {
		this.assistantCoaches = assistantCoaches;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	public void setSubstitutes(Player[] substitutes) {
		this.substitutes = substitutes;
	}
	public void setColorOfJerseys(String colorOfJerseys) {
		this.colorOfJerseys = colorOfJerseys;
	}
	public void setName(String name) {
		this.name = name;
	}

}
