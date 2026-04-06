package TreeSetPkg;

import java.util.TreeSet;

public class PlayerMain {

	public static void main(String[] args) {
		
		TreeSet<Player> players = new TreeSet<>();

        players.add(new Player(101, 80));
        players.add(new Player(102, 95));
        players.add(new Player(103, 70));
        players.add(new Player(104, 85));

        System.out.println("Players Sorted by Score:");

        for(Player p : players) {
            p.display();
        }

	}

}
