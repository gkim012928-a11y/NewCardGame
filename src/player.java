public class player {
    public boolean isDealer = false;
    public int numPlayer;
    public Card [] hand;
    public int numCards;


    public player(int pnumPlayer){
        numPlayer = pnumPlayer;
        hand = new Card[11];
        numCards = 0;

    }

    public void printHand() {
        for(int i = 0; i<numCards;i++) {
            hand[i].printCard();

        }
    }

    public void addCard(Card newcard){
        hand[numCards] = newcard;
        numCards++;

    }

    public void sumCards(){
        for(int i = 0;i<numCards;i++){

        }
    }

    public void stand(){
        numCards++;
        for(int i=0;i<numCards;i++){
            hand[numCards] =
        }

    }
    public void hit(){

    }
}
