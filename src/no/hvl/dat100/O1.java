package no.hvl.dat100;

public class O1 {
	
	public static void main(String[] args) {
		int[][] flereTall = { {1, 2, 3 }, {2, 3, 4}};
		skrivut(flereTall);
		
		
	}
	public static void skrivut(int[][] tabell) {

        for (int [] i: tabell) {
            String matrixString = "{";
            for(int n: i) {
                matrixString += n + ",";
            }
            matrixString += "}";
            System.out.println(matrixString);
        }
    }

}
