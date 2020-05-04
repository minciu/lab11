package lab11;

import java.awt.List;
import java.util.ArrayList;

public class PlayerService {

	public List<Player> getPlayers(){
		
        List<Player> listOfPlayers= new ArrayList<>() ;
        listOfPlayers.add(new Player("Ion",16,15));
        listOfPlayers.add(new Player("George",15,16));
     return listOfPlayers;
	}
	
	
	
}
