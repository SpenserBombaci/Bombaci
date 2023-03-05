import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception 
    {
        //Looks at the constructor to create an object
        Player player1 = new Player("Spenser");
        player1.addSport(("Football"));
        player1.addSport(("Soccer"));
        player1.addSport(("Rugby"));

        Player player2 = new Player("Tyler");
        player2.addSport(("Snowboarding"));
        player2.addSport(("Golf"));

        Player player3 = new Player("Will");
        player3.addSport(("Tennis"));
        player3.addSport(("Badminton"));
        player3.addSport(("Esports"));

        Player player4 = new Player("Phil");
        player4.addSport(("Ping Pong"));
        player4.addSport(("Soccer"));
        player4.addSport(("Esports"));
        //creates an arrayList of the class Player and adds all created players above to it
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        //All known sports into their own string array
        String [] listOfSports = {"Football", "Soccer","Rugby","Tennis","Badminton","Snowboarding","Golf","Ping Pong","Esports"};

        for (String sport: listOfSports) //Loop through each of value of the ListOfSports array above
        {
            for(Player player: players)
            {
                ArrayList<String> sports = player.getSports();
                if (sports.contains(sport))
                {
                    System.out.println(player.name + " plays " + sport);
                }
            }
        }




    }
}
