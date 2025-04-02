package projet;
import java.util.Scanner;

import in360.tp2.Piece;

public class Chess {
	public static void main(String[] args) {
		new Chess().execute();
		
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
		int nb_coup=0;
		Scanner myObj = new Scanner(System.in);  // Creation du scanner 
		
		System.out.println("Etes vous les blancs ou les noires (0/1) ?");
		String BouN = myObj.nextLine();  // reponse si blanc ou noir
		if(BouN = Blanc && nb_coup=0|| nb_coup>0) {
			while(true)
				System.out.println("Depart :");  // Demande à l'utilisateur quel piece il veut deplacer
				String Depart = myObj.nextLine();   // Coup de depart
				System.out.println("Arrivé :");  // Demande à l'utilisateur quel piece il veut deplacer
				String Arrivé = myObj.nextLine();   // Coup de depart
				
		}
		myObj.close();
		
			
		// 
		System.out.println("8|"+show(ROOK_BLACK)+"|"+show(KNIGHT_BLACK)+"|"+show(BISHOP_BLACK)+"|"+show(QUEEN_BLACK)+"|"+show(KING_BLACK)+"|"+show(BISHOP_BLACK)+"|"+show(KNIGHT_BLACK)+"|"+show(ROOK_BLACK)+"|");
		System.out.println("7|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|"+show(PAWN_BLACK)+"|");
		System.out.println("6|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|");
		System.out.println("5|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|");
		System.out.println("4|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|");
		System.out.println("3|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|"+empty()+"|");
		System.out.println("2|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|"+show(PAWN_WHITE)+"|");
		System.out.println("1|"+show(ROOK_WHITE)+"|"+show(KNIGHT_WHITE)+"|"+show(BISHOP_WHITE)+"|"+show(QUEEN_WHITE)+"|"+show(KING_WHITE)+"|"+show(BISHOP_WHITE)+"|"+show(KNIGHT_WHITE)+"|"+show(ROOK_WHITE)+"|");
		System.out.println("  A B C D E F G H");
		
	}
	
	static private Piece[] init_board() {
    	Piece[] board = {new Piece(show(ROOK_WHITE), "A1"), new Piece(show(ROOK_WHITE), "H1"), new Piece(show(KNIGHT_WHITE), "B1"), new Piece(show(KNIGHT_WHITE), "G1"),
    					new Piece(show(BISHOP_WHITE), "C1"), new Piece(show(BISHOP_WHITE), "F1"), new Piece(show(QUEEN_WHITE), "D1"), new Piece(show(KING_WHITE), "E1"),
    					new Piece(show(PAWN_WHITE), "A2"), new Piece(show(PAWN_WHITE), "B2"), new Piece(show(PAWN_WHITE), "C2"), new Piece(show(PAWN_WHITE), "D2"), 
    					new Piece(show(PAWN_WHITE), "E2"), new Piece(show(PAWN_WHITE), "F2"), new Piece(show(PAWN_WHITE), "G2"), new Piece(show(PAWN_WHITE), "H2"),
    					new Piece(show(ROOK_BLACK), "A8"), new Piece(show(ROOK_BLACK), "H8"), new Piece(show(KNIGHT_BLACK), "B8"), new Piece(show(KNIGHT_BLACK), "G8"),
    					new Piece(show(BISHOP_BLACK), "C8"), new Piece(show(BISHOP_BLACK), "F8"), new Piece(show(QUEEN_BLACK), "D8"), new Piece(show(KING_BLACK), "E8"),
    					new Piece(show(PAWN_BLACK), "A7"), new Piece(show(PAWN_BLACK), "B7"), new Piece(show(PAWN_BLACK), "C7"), new Piece(show(PAWN_BLACK), "D7"), 
    					new Piece(show(PAWN_BLACK), "E7"), new Piece(show(PAWN_BLACK), "F7"), new Piece(show(PAWN_BLACK), "G7"), new Piece(show(PAWN_BLACK), "H7")};          
    	return board;
    	
	}
	
	private String empty() 
	{
		return " ";
	}


	private String show(int piece)
	{
		return new String(Character.toChars(piece));
	}
}
