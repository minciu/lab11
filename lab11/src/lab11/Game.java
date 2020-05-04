package lab11;

public class Game {
	
	private String player1;
	private String player2;
	private String content;
	private String result;
	private double date;
	
	
	public Game(String player1,String player2,String content,String result,double date)
	{
		this.player1=player1;
		this.player2=player2;
		this.content=content;
		this.result=result;
		this.date=date;
		
	}
	
	
	
	public String getPlayer1() {
		return player1;
	}


	public void setPlayer1(String player1) {
		this.player1 = player1;
	}


	public String getPlayer2() {
		return player2;
	}


	public void setPlayer2(String player2) {
		this.player2 = player2;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public double getDate() {
		return date;
	}


	public void setDate(double date) {
		this.date = date;
	}


	
	
	
}
