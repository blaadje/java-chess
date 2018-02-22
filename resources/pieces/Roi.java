package pieces;

public class Roi extends Piece
{
    public Roi(String color,String name,Boolean inGame)
    {
        super(color, name, inGame);
    }

    /**
     * Methode estValide, sert a verifier la validite du deplacement du roi
     * retourne true ou false si le deplacement du roi est valide
     * @ prend en paramètre le deplacement de la piece
     */
    public boolean estValide(Deplacement deplacement) {
		/*La somme des déplacements x et y ne devrait jamais être supérieur à deux, pour gérer le cas ou le roi
		 * ferais deux pas dans la même direction on ajoute donc la condition disant que la diffŽrence ne devrais jamais
		 * exéder 1. (un pas en diagonale = 0, un pas dans un autre axe = 1). On vérifie également si le roi est demeurer sur place.
		 */
        return Math.abs(deplacement.getDeplacementX()) * Math.abs(deplacement.getDeplacementY()) <= 1
                && Math.abs(deplacement.getDeplacementX()) - Math.abs(deplacement.getDeplacementY()) <= 1
                && Math.abs(deplacement.getDeplacementX()) - Math.abs(deplacement.getDeplacementY()) >= -1
                && !deplacement.isNul();
    }
}
