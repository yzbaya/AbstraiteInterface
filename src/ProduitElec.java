
public class ProduitElec extends article implements Promotion {
     
	String categories;
	
	public ProduitElec(long ref, String lib, float p, int q, String cat) {
		super(ref, lib, p, q);
		categories=cat;
	}

	@Override
	float calculPrixTTC() {
		float prixTTC = (float) (prixHt*(1.08+TVA));
		return prixTTC;
	}
 
	  @Override
		void decrire() {
			super.decrire();
			System.out.println("catégories est "+this.categories);
		}
	  static void prixAvecRemise(){
	 
			float prixR= (float) (prixTTC-(prixTTC*0.2));
	    }
}
