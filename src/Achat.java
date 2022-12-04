import java.util.Scanner;

public class Achat {
	article supermarche [];
	
	Achat(int capacite)
	{ 
		supermarche= new article[capacite];
	}
 
	public static void main(String[] args) {
		Achat a= new Achat(4);
	  article[] b = a.supermarche;
		b[0]=new Vetement (123,"Jupe",39,2,"S","bleue");
		b[1]=new ProduitElec(145,"TV Led 80cm",1450,0,"TV");
		b[2]=new Vetement(178,"Pantalon",42,5,"M","noir");
		b[3]=new ProduitGC(191,"Pâtes",(float)0.410,18);
		 
		Scanner obj= new Scanner( System.in );
		for (int i=0; i<=4;i++) {
			
			int qte=obj.nextInt();
			a.supermarche[i].decrire();
			float prix=0;
			if(b[i].appartientPromo()==false) {
		    prix=qte*b[i].calculPrixTTC();
			}
			else
				if(b[i] instanceof Vetement) {
					prix=b[i].prixAvecRemise()*qte;
			}
			else 
				if(b[i] instanceof ProduitElec) {
					prix=b[i].prixAvecRemise()*qte;
			}
			System.out.println(prix);
			
	}

}
