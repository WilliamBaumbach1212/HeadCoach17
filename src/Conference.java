import java.util.ArrayList;

public class Conference 
{
	private ArrayList<Team> _conferenceTeams = new ArrayList<Team>();
	Standings standings = new Standings();
	
	public Conference(ArrayList<Team> conference)
	{
		_conferenceTeams = conference;
	}
	
	
}

