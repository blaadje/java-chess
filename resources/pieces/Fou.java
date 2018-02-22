package pieces;

public class Fou extends Piece
{
    public Fou(String color,String name,Boolean inGame)
    {
        super(color, name, inGame);
    }




    /**
     * Methode estValide, sert a verifier la validite du deplacement du fou
     * retourne true ou false si le deplacement du fou est valide
     *  prend en paramètre le deplacement de la piece
     */
    public boolean estValide(Deplacement deplacement) {
		/*Le mouvement du fou est une diagonale, ainsi si l'on fais la différence des valeurs absolu des déplacement X et Y,
		 * le résultat  devrait toujours être 0.
		 */
        return Math.abs(deplacement.getDeplacementX()) - Math.abs(deplacement.getDeplacementY()) == 0 && !deplacement.isNul();

    }
}
