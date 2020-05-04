package lab11;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class GameService {
	
	public List<Game> getGames(){
		
         List<Game> listOfGames= new ArrayList<>() ;
         listOfGames.add(new Game("Ion","George","one-sided","Ion",16));
         listOfGames.add(new Game("Ion","George","one-sided","Ion",14));
      return listOfGames;
	}
	
	public Game getGameByDate(double date) {
		Predicate<Game> byDate= p->p.getDate().equals(date);
		return filterGames(byDate);
		
	}

	private Game filterGames(Predicate<Game> strategy) {
		
		return getGames().stream().filter(strategy).findFirst().orElse(null);
	}

	public Game addGame(Game newGame) {
		newGame.setDate(21);
		return newGame;
		
	}
	
	
}
