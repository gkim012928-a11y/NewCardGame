public class player {
    public boolean isDealer = false;
    public int numPlayer;
    public Card [] hand;
    public int numCards;
    public int totalsum =0;


    public player(int pnumPlayer){
        numPlayer = pnumPlayer;
        hand = new Card[11];
        numCards = 0;



    }

    public void printHand() {
        for(int i = 0; i<numCards;i++) {
            totalsum += hand[i].value;
            hand[i].printCard();
        }
        System.out.println("The sum of this player's cards is "+totalsum);
    }

    public void addCard(Card newCard){
        hand[numCards] = newCard;
        numCards ++;

    }

    public void stand(){
        numCards++;
        for(int i=0;i<numCards;i++){
            hand[numCards] = hand[i];
        }

    }
    public void hit(){

    }
}
