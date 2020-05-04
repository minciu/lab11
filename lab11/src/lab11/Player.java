package lab11;

public class Player {
   private String name;
   private int victories;
   private int loses;
   
   public Player (String name,int victories,int loses){
	   this.name=name;
	   this.victories=victories;
	   this.loses=loses;
	   
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getVictories() {
	return victories;
}

public void setVictories(int victories) {
	this.victories = victories;
}

public int getLoses() {
	return loses;
}

public void setLoses(int loses) {
	this.loses = loses;
}
   
}
