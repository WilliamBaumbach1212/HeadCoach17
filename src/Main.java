import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	private static boolean running = true;
	
	// Easter Conference Setup
	static Team bucks = new Team();
	static Team bulls = new Team();
	static Team cavaliers = new Team();
	static Team celtics = new Team();
	static Team hawks = new Team();
	static Team heat = new Team();
	static Team hornets = new Team();
	static Team knicks = new Team();
	static Team magic = new Team();
	static Team nets = new Team();
	static Team pacers = new Team();
	static Team pistons = new Team();
	static Team raptors = new Team();
	static Team seventysixers = new Team();
	static Team wizards = new Team();
	static ArrayList<Team> ec = new ArrayList<Team>(Arrays.asList(bucks, bulls, cavaliers, celtics, hawks, heat, hornets, knicks, 
			magic, nets, pacers, pistons, raptors, seventysixers, wizards));
	
	// Western Conference Setup
	static Team clippers = new Team();
	static Team grizzlies = new Team();
	static Team jazz = new Team();
	static Team kings = new Team();
	static Team lakers = new Team();
	static Team mavericks = new Team();
	static Team nuggets = new Team();
	static Team pelicans = new Team();
	static Team rockets = new Team();
	static Team spurs = new Team();
	static Team suns = new Team();
	static Team thunder = new Team();
	static Team timberwolves = new Team();
	static Team trailblazers = new Team();
	static Team warriors = new Team();
	static ArrayList<Team> wc = new ArrayList<Team>(Arrays.asList(clippers, grizzlies, jazz,
			kings, lakers, mavericks, nuggets, pelicans, rockets, spurs, suns, thunder,
			timberwolves, trailblazers, warriors));
	
	
	public static void main(String[] args) 
	{
		Conference Eastern = new Conference(ec);
		Conference Western = new Conference(wc);
		
	
		while(running)
		{
			
		}

	}
	
	public void run()
	{
		
	}

}
