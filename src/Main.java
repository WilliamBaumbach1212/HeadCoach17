import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	private static boolean running = true;
	
	// Easter Conference Settup
	public static Team bucks = new Team();
	Team bulls = new Team();
	Team cavaliers = new Team();
	Team celtics = new Team();
	Team hawks = new Team();
	Team heat = new Team();
	Team hornets = new Team();
	Team knicks = new Team();
	Team magic = new Team();
	Team nets = new Team();
	Team pacers = new Team();
	Team pistons = new Team();
	Team raptors = new Team();
	Team seventysixers = new Team();
	Team wizards = new Team();

	ArrayList<Team> ec = new ArrayList<Team>(Arrays.asList(bucks, bulls, cavaliers, celtics, hawks, heat, hornets, knicks, 
			magic, nets, pacers, pistons, raptors, seventysixers, wizards));
	
	
	public static void main(String[] args) 
	{
		
		Conference Eastern = new Conference();
		Conference Western = new Conference();
		
		while(running)
		{
			
		}

	}
	
	public void run()
	{
		
	}

}
