package projet;

public class Piece {
	public String type;
	public String emplacement;
	
	public Piece(String type,String emplacement) {
		this.type=type;
		this.emplacement=emplacement;
		
		if(type =="0x2656" || type =="0x265C") {  //Coup possible pour la tour
			
		}
		
		if(type =="0x2658" || type =="0x265E") {  //Coup possible pour le cavalier
			
		}
		
		if(type =="0x2657" || type =="0x265D") {  //Coup possible pour la fou
			
		}
		
		if(type =="0x2659" || type =="0x265F") {  //Coup possible pour le pion
			
		}
		
		if(type =="0x2655" || type =="0x265B") {  //Coup possible pour la reine
			
		}
		
		if(type =="0x2656" || type =="0x265A") {  //Coup possible pour le roi
			
		}
	}
	
}
