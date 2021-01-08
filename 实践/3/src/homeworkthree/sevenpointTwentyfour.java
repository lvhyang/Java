package homeworkthree;

public class sevenpointTwentyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		boolean[] huaSe = new boolean[4];
		int count = 0;
		while (!flag) {
			if (huaSe[0] && huaSe[1] && huaSe[2] && huaSe[3]) {
				flag = true;
			}
			else {
				if(choosePai(huaSe)=="Spades") {
					huaSe[0] = true;
				}
				else if(choosePai(huaSe)=="Hearts") {
					huaSe[1] = true;
				}
				else if(choosePai(huaSe)=="Diamonds") {
					huaSe[2] = true;
				}
				else {
					huaSe[3] = true;
				}
				count++;
			}
		}
		System.out.println("Number of picks: "+count);
	}
	
	public static String choosePai(boolean[]huaSe){
		int[] deck = new int[52];
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		for(int i = 0;i < deck.length;i++) {
			deck[i] = i;
		}
		for(int i = 0;i < deck.length;i++){
			int index = (int)(Math.random()*deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		int i = (int)(Math.random()*52);
		String suit = suits[deck[i] / 13];
		String rank = ranks[deck[i] % 13];
		if(suit=="Spades" && !huaSe[0]) {
				System.out.println(rank+" of "+suit);
				huaSe[0] = true;
		}
		else if(suit=="Hearts" && !huaSe[1]) {
				System.out.println(rank+" of "+suit);
				huaSe[1] = true;
		}
		else if(suit=="Diamonds" && !huaSe[2]) {
				System.out.println(rank+" of "+suit);
				huaSe[2] = true;
		}
		else if(suit=="Clubs" && !huaSe[3]) {
				System.out.println(rank+" of "+suit);
				huaSe[3] = true;
		}
		return suit;
		
	}

}
