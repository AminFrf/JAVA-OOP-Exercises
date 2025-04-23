import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Court> bookcourts;

    public Player(String name) {
        this.name = name;
        this.bookcourts = new ArrayList<Court>();
    }

    public List<Court> getbookCourts() {
        return bookcourts;
    }

    public void addbookcourts(Court bookcourt) {
        bookcourts.add(bookcourt);
    }

    public void removebookCourt(Court court) {
        bookcourts.remove(court);
    }

    public String getName() {
        return name;
    }

    public boolean bookCourt(Court court) {
        if (court.bookCourt()) {
            System.out.println(name + " successfully booked a " + court.getSportType() + " court.");
            return true;
        }
        System.out.println("Court is already booked!");
        return false;
    }
}