import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Court> courts;
    private List<Player> players;

    public Admin() {
        this.courts = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public void addplayer(Player player) {
        players.add(player);
    }

    public void addCourt(Court court) {
        courts.add(court);
        System.out.println("Added " + court.getSportType() + " court.");
    }

    public void removeCourt(Court court) {
        courts.remove(court);
        System.out.println("Removed " + court.getSportType() + " court.");
    }

    public List<Court> getCourts() {
        return courts;
    }

    public void printcourts() {
        for(Court cccourts : courts) {
            String x = " not ";
            if(cccourts.isAvailable()){
                x= " " ;
            }
            System.out.println(cccourts.getSportType() + " court " + "is" + x + "available");
            System.out.println("--------------------------------------------------------");
        }
    }

    public void printplayers() {
        for(Player player : players) {
            System.out.println("player name : " + player.getName() + "     " + "book courts : ");

            System.out.println("--------------------------------------------------------");
        }
    }

    public List<Player> getPlayers() {
        return players;
    }
}