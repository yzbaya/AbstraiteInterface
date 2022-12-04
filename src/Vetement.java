
public class Vetement extends ProduitGC implements Promotion {
	
		String taille;
    String couleur;
	
    public Vetement(long ref, String lib, float p, int q, String t, String c) {
		super(ref, lib, p, q);
		taille=t;
		couleur=c;
	}

    @Override
  	void decrire() {
  		super.decrire();
		System.out.println("le couleur est "+ this.couleur+"la taille égale"+this.taille);
  	}
    
 void prixAvecRemise(){
		float prixRemise=(float)(calculPrixTTC()-(calculPrixTTC()*0.3));
    }
}
