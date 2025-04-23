import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        boolean book = true ;
        while (book) {
            System.out.println("=== Sports Court Booking System \uD83C\uDFC0 ===");
            System.out.println("1. add court");
            System.out.println("2. add player");
            System.out.println("3. remove court");
            System.out.println("4. book court");
            System.out.println("5. list of courts");
            System.out.println("6. list of players");
            System.out.println("7. exit");
            System.out.println("Enter your choice : ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter the sport type : ");
                    String courtTypeadd = scanner.nextLine();
                    Court court = new Court(courtTypeadd);
                    admin.addCourt(court);
                    break;

                case 2 :
                    System.out.println("enter player name :" );
                    String playername = scanner.nextLine();
                    Player player = new Player(playername);
                    admin.addplayer(player);
                    System.out.println("plyer " + playername + " added !");
                    break;
                case 3 :

                    System.out.println("enter the sport type : ");
                    String courtTyperem = scanner.nextLine();
                    Court removecourt = null;
                    for(Court courts : admin.getCourts()) {
                        if(courts.getSportType().equals(courtTyperem)) {
                            removecourt = courts;
                        }
                    }
                    if(removecourt == null) {
                        System.out.println("court not found");
                    }
                    else {
                        admin.removeCourt(removecourt);
                        // System.out.println(courtTyperem + " court removed ");
                    }
                    break;

                case 4 :
                    System.out.println("enter player name :");
                    String playerbook =  scanner.nextLine();
                    Player playerbooker = null;

                    for(Player players : admin.getPlayers()) {
                        if(players.getName().equals(playerbook)) {
                            playerbooker = players;
                        }
                    }
                    if(playerbooker == null) {
                        System.out.println("player not found");
                    }
                    else {
                        System.out.println("enter the type of court : ");
                        String courtType = scanner.nextLine();
                        Court courtbook = null ;
                        for(Court courts : admin.getCourts()) {
                            if(courts.equals(courtType)){
                                courtbook = courts;
                            }
                        }
                        if(courtbook == null) {
                            System.out.println("court not found");
                        }
                        else {
                            playerbooker.bookCourt(courtbook);
                        }

                    }
                    break;

                case 5 :
                    admin.printcourts();
                    break;


                case 6 :
                    admin.printplayers();
                    break;

                case 7 :
                    book = false ;
                    System.out.println("Exiting... Goodbye!");
                    break;

                default :  System.out.println("wrong choice !!!");
            }
        }

       /* Court basketballCourt = new Court("Basketball");
        Court tennisCourt = new Court("Tennis");

        admin.addCourt(basketballCourt);
        admin.addCourt(tennisCourt);

        Player player1 = new Player("John");
        Player player2 = new Player("Alice");

        player1.bookCourt(basketballCourt);
        player2.bookCourt(basketballCourt); // Should print "Court is already booked!"*/
    }
}