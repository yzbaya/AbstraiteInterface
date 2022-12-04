
public class ProduitGC extends article {
	
      public ProduitGC(long ref, String lib, float p, int q) {
		super(ref, lib, p, q);
	}
      

	@Override
	float calculPrixTTC() {
		float prixTTC = prixHt*(1+TVA);
		return prixTTC;
	}
  @Override
	void decrire() {
		super.decrire();
	}


	}

