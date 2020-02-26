import java.util.*;


class Card {
	private String suit;
	private String symbol;
	
	public Card(String suit,String symbol) {
		this.suit = suit;
		this.symbol = symbol;
	}
	public String toString() {
		return suit + symbol;
	}
}
public class pokerRandom{
	private static List <Card> cards =  new ArrayList <> (52);
	static {
		for(int i = 0; i < 52 ; i++) {
			cards.add( new Card(suit(i+1),symbol(i+1)));
		}
	}
	private static String suit(int num) {
		switch((num-1)/13) {
		case 0 : return "®ç";
		case 1 : return "¤ß";
		case 2 : return "¿j";
		default: return "±ö";
		}
	}
	private static String symbol(int num) {
		int remain = num % 13;
		switch(remain){
		case 0 : return String.format("%c", 'K');
		case 1 : return String.format("%c", 'A');
		case 11: return String.format("%c", 'J');
		case 12: return String.format("%c", 'Q');
		default: return String.format("%-2d", remain);
		}
	}
	public static Card[] shuffle() {
		for(int i = 0; i < cards.size(); i++) {
			Collections.swap(cards, i, (int)(Math.random() * cards.size()-1));
		}
		return cards.toArray(new Card[52]);
	}
	public static void main(String[]args) {
		Card[] cards = shuffle();
		for(int i = 0 ; i < cards.length; i++) {
			System.out.printf("%s%c",cards[i], (i+1)%13 == 0 ? '\n' :' ');
		}
	}
}