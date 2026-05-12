import java.util.Scanner;

public class Main {

    public Card [] deck;
    public player[] dealer;
    public player[] player1;


    public static void main(String[] args) {
        Main myapp = new Main();
    }
    public Main(){
        deck = new Card [52];
        for(int i=0;i<deck.length;i++){
            if(i<13){
                deck[i] = new Card(i%13,"Spades", false);
            }
            else if(i<26){
                deck[i] = new Card(i%13,"Diamonds", false);
            }
            else if(i<39){
                deck[i] = new Card(i%13,"Hearts", false);
            }
            else if(i<52){
                deck[i] = new Card(i%13,"Clubs", false);
            }
        }

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        player player = new player(1);
        player dealer = new player(2);

        shuffle();

            player.addCard(deck[0]);
            player.addCard(deck[1]);
            player.printHand();

    }
    public void printDeck(){
        System.out.println("This deck:");
        for(int i=0;i<deck.length;i++){
            deck[i].printCard();
        }
    }
    public void shuffle(){
        for(int i=0;i<deck.length;i++){
            Card holder = null;
            int randNum = (int) (Math.random()*52);
            holder = deck[randNum];
            deck[randNum] = deck[i];
            deck[i] = holder;
        }
    }
}
