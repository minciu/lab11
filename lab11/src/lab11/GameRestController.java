package lab11;

import java.awt.List;

@RestController
public class GameRestController {

	GameService gameService;
	
	public List<Game> getGames(){
		return gameService.getGames();
		
	}
	
	public Game getGameByDate(double gameDate) {
		return gameService.getGameByDate(gameDate);
		
	}
	
	
}
