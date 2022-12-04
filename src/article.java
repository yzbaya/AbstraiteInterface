
public abstract class article   {
     long reference;
     String libellé;
     float prixHt;
     int qteStock;
    final static int TVA=10;
     
		public static int getTva() {
		return TVA;
	}

		
		public article(long ref, String lib, float p, int q) {
			reference = ref;
			libellé = lib;
			prixHt = p;
			qteStock = q;
	}
		
		void approvisionner(int nb) {
			this.qteStock=this.qteStock+nb;
		}
		
		void decrire() {
			System.out.println("la ref est"+reference+" intitulé "+libellé);
		}
		
 		abstract float calculPrixTTC();
	
 		boolean appartientPromo() {
 			if (this.libellé.equals("electroniques")|| this.libellé.equals("vetements")){
 				return true;
 			}
 			else return false;
 		}

		boolean estDispo(int qteAchat) {
 			if (this.qteStock==qteAchat) {
 				return true;
 			}
			return false;
 			
 		}


}
