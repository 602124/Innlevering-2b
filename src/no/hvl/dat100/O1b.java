package no.hvl.dat100;

public class O1b {

	public static void main(String[] args) {
		int[][] flereTall = { {1, 2, 3 }, {2, 3, 4}};
		System.out.println(tilString(flereTall));
	}
		public static String tilString(int[][] tabell) {
	        String matrisetiString = "   "; 
	        for (int [] i: tabell) {
	            for(int n: i) {
	                matrisetiString += n + "    ";
	            } 
	            matrisetiString += "\n";
	        }
	        return matrisetiString;
	}

}
