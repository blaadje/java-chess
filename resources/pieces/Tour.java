package pieces;

public class Tour extends Piece
{
    public Tour(String color,String name,Boolean inGame)
    {
        super(color, name, inGame);
    }


    /**
     * Methode estValide, sert a verifier la validite du deplacement de la tour
     * true ou false si le deplacement de la tour est valide
     * prend en paramètre un déplacement
     */
    public boolean estValide(Deplacement deplacement) {
		/*
		 * Si le produit du déplacement x et du déplacement y est égal à 0, c'est que
		 * un des deux déplacement est de 0. Se qui veux dire que le mouvement est uniquement vertical ou
		 * horizontale
		 */
        return deplacement.getDeplacementX() * deplacement.getDeplacementY() == 0 && !deplacement.isNul();
    }
}
