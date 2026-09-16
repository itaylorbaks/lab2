import java.util.Scanner;

public class UserPlayer extends AbstractPlayer{
    private Scanner scanner;

    public UserPlayer(int playerNumber){
        super(playerNumber);
        this.scanner = new Scanner(System.in);
    }

    public int decideRank(){
        System.out.println("Your Cards");
        for (int i = 0; i < this.hand.length; i++){
            System.out.println(this.hand[i].getSuit() + " of " + this.hand[i].getRank());
        }
        System.out.print("Desired Rank ");
        try { 
            String userString = scanner.nextLine();
            int desired = Integer.parseInt(userString);
                if (countCards(desired) != 0){
                    return desired;
                }
                else {
                    System.out.println("Rank not found in Your Hand");
                    return decideRank();
                }
            }
        catch (NumberFormatException e) {
            System.out.println("Must be an integer!");
            return decideRank();
        }
        
    }

    public static void main(String args[]){
        UserPlayer userPlayer = new UserPlayer(1);
        int rank = userPlayer.decideRank();
    } 

}