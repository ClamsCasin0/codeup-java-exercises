public class ServerNameGenerator {

    public static String randomString(String[] strings) {
        int randomIndex = (int) (Math.random() * strings.length);
        return strings[randomIndex];
    }

    public static void main(String[] args) {



    String[] adjectives = {"corpulent", "lackadaisical", "odious", "ubiquitous", "unnerving", "deceitful", "charlatan", "strumpet", "harlot", "lecherous"};

    String[] nouns = {"dog", "bull", "girl", "whale", "lord", "priest", "nun", "florist", "salesman", "mailman"};

    String serverName = randomString(adjectives) + " " + randomString(nouns);

    System.out.println("Your server name is: " + serverName);

    }


}
