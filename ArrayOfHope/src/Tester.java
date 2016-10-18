
public class Tester {

	public static void main(String[] args) {
		
		for(int i = 65; i <= 90; i++){
			String ch[] = new String[26];
			ch[0] = "A";
			ch[1] = "B";
			ch[2] = "C";
			ch[3] = "D";
			ch[4] = "E";
			ch[5] = "F";
			ch[6] = "G";
			ch[7] = "H";
			ch[8] = "I";
			ch[9] = "J";
			ch[10] = "K";
			ch[11] = "L";
			ch[12] = "M";
			ch[13] = "N";
			ch[14] = "O";
			ch[15] = "P";
			ch[16] = "Q";
			ch[17] = "R";
			ch[18] = "S";
			ch[19] = "T";
			ch[20] = "U";
			ch[21] = "V";
			ch[22] = "W";
			ch[23] = "X";
			ch[24] = "Y";
			ch[25] = "Z";
		
			for(int j = 64; j <= 90; j++){
				System.out.print(ch[j - 64]);
				System.out.print(", ");
			}
		}
	}
}

