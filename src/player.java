public class player {
    public boolean isDealer = false;
    public int numPlayer;
    public Card [] hand;
    public int numCards;
    public boolean isBust;
    public int totalsum =0;


    public player(int pnumPlayer){
        numPlayer = pnumPlayer;
        hand = new Card[11];
        numCards = 0;

    }

    public void addCard(Card newCard){
        hand[numCards] = newCard;
        numCards ++;

    }

    public void sumHand(){
        for(int i=0;i<=numCards;i++) {
            totalsum += hand[i].value;
        }
        System.out.println("Player "+numPlayer+" has a hand of: "+totalsum);
    }

    public void printHand() {
        for(int i = 0; i<numCards;i++) {
            hand[i].printCard();
        }
    }

    public void stand(){

    }
    public void hit(){
        numCards++;
        for(int i=0;i<numCards;i++){
            hand[numCards] = hand[i];
        }
    }
}
