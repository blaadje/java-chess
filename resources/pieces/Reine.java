package pieces;

public class Reine extends Piece
{
    public Reine(String color,String name,Boolean inGame)
    {
        super(color, name, inGame);
    }


    /**
     * Methode estValide, sert a verifier la validite du deplacement de la reine
     * retourne  true ou false si le deplacement de la reine  est valide
     * prend en paramètre le  déplacement de la piece
     */
    public boolean estValide(Deplacement deplacement) {
		/*Le déplacement d'une reine est un mouvement qui peut être diagonale OU rectiligne.
		 * On peut donc utiliser les déplacements de la tour et du fou car la tour c'est rectiligne et le fou en diagonale.
		 */

        return (Math.abs(deplacement.getDeplacementX()) - Math.abs(deplacement.getDeplacementY()) == 0
                | deplacement.getDeplacementX() * deplacement.getDeplacementY() == 0) && !deplacement.isNul();
    }

}
