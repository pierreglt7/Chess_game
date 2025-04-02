package projet;

import java.util.Scanner;

import in360.tp2.Piece;

public class Chess1 {
	public static void main(String[] args) {
		new Chess1().execute();
		
		
		
		
		
	}

	static public final int ROOK_WHITE = 0x2656; 
	static public final int ROOK_BLACK = 0x265C;
	
	static public final int KNIGHT_WHITE = 0x2658;
	static public final int KNIGHT_BLACK = 0x265E;
	
	static public final int BISHOP_WHITE = 0x2657;
	static public final int BISHOP_BLACK = 0x265D;
	
	static public final int PAWN_WHITE = 0x2659;
	static public final int PAWN_BLACK = 0x265F;
	
	static public final int QUEEN_WHITE = 0x2655;
	static public final int QUEEN_BLACK = 0x265B;
	
	static public final int KING_WHITE = 0x2656;
	static public final int KING_BLACK = 0x265A;
	
	static public final int Blanc = 0;
	static public final int Noire = 1;
	
	private void execute() 
	{
		System.out.println("8|"+show(ROOK_BLACK)+"|"+show(KNIGHT_BLACK)+"|"+show(BISHOP_BLACK)+"|"+show(QUEEN_BLACK)+"|"+show(KING_BLACK)+"|"+show(BISHOP_BLACK)+"|"+show(KNIGHT_BLACK)+"|"+show(ROOK_BLACK)+"|");
		System.out.println("7|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|");
		System.out.println("6|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|");
		System.out.println("5|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|");
		System.out.println("4|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|");
		System.out.println("3|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|");
		System.out.println("2|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|");
		System.out.println("1|"+show(ROOK_WHITE)+"|"+show(KNIGHT_WHITE)+"|"+show(BISHOP_WHITE)+"|"+show(QUEEN_WHITE)+"|"+show(KING_WHITE)+"|"+show(BISHOP_WHITE)+"|"+show(KNIGHT_WHITE)+"|"+show(ROOK_WHITE)+"|");
		System.out.println("  A B C D E F G H");
		
		String[][] board = init_affiche();  // tableau de jeu
		afficher(board);  // Affichage 
		
		
		int nb_coup=0;
		String temp;
		Scanner myObj = new Scanner(System.in);  // Creation du scanner 
		
		System.out.println("Etes vous les blancs ou les noires (0/1) ?");
		String BouN = myObj.nextLine();  // reponse si blanc ou noir
		while(true){
			
			if(BouN.equals("0") && nb_coup ==0|| nb_coup>0) {
				System.out.println("Depart :");  // Demande à l'utilisateur quel piece il veut deplacer
				String Depart = myObj.nextLine();   // Coup de depart
				System.out.println("Arrivé :");  // Demande à l'utilisateur quel piece il veut deplacer
				String Arrive = myObj.nextLine();   // Coup de depart
				
				int colonne_d = Depart.charAt(0) - 'A' +1;
				int ligne_d = Depart.charAt(1);
				
				int colonne_a = Arrive.charAt(0) - 'A' +1;
				int ligne_a = Arrive.charAt(1);
				
				temp = board[ligne_d][colonne_d];
	        		board[ligne_a][colonne_a] = empty();
	        		board[ligne_a][colonne_a] = temp;
			}	
			
			else {
				System.out.println("C'est au blanc de commencer");
			}
				
		}	
		
		myObj.close();		
		
	}
	
	static init_affiche
	
	private String empty() 
	{
		return " ";
	}
	
	static private void afficher(String[][] board) {
    	for (int l=0; l<8; l++) {
        	System.out.print(8-l);
        	System.out.print("|");
        	for (int c=0; c<8; c++) {
        		System.out.print(board[l][c] + "|");
        	}
        	System.out.print("\n");
        }
        System.out.println("  A B C D E F G H");
    } 


	private String show(int piece)
	{
		return new String(Character.toChars(piece));
	}
}
