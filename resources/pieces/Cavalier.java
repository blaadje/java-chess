package pieces;

public class Cavalier extends Piece
{
    public Cavalier(String color,String name,Boolean inGame)
    {
        super(color, name, inGame);
    }





    /**
     * Methode estValide, sert a verifier la validite du deplacement du cavalier
     * retourne true ou false si le deplacement du cavalier est valide
     *  prend en paramètre le deplacement de la piece
     */
    public boolean estValide(Deplacement deplacement) {
		/*Verifie si le quotient des deux deplacement est égal a 2 ou à .5, ce qui garantie que la
		 * pièce à fait un mouvement en "L".
		 */
        return (Math.abs(deplacement.getDeplacementX() / deplacement.getDeplacementY())) == 2 |
                (Math.abs(deplacement.getDeplacementX() / deplacement.getDeplacementY())) == .5;
    }

}
