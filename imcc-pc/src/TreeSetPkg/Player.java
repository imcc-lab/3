package TreeSetPkg;

public class Player implements Comparable<Player>{

	int id;
    int score;

    public Player(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public void display() {
        System.out.println("Player ID: " + id + " Score: " + score);
    }

    @Override
    public int compareTo(Player p) {
        return this.score - p.score;   // sorting by score
    }

}
