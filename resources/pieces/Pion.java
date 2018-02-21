package pieces;

public class Pion extends Piece
{
    public Pion(String color,String name,Boolean inGame)
    {
        super(color, name, inGame);
    }


    public boolean estValide(Deplacement deplacement) {
		/*Verifie premierement que le deplacementX est bien nul, ensuite selon la couleur du pion, vérifie que son deplacementY
		 * est egal à un ou deux en fonction de la position du pion. (les operateurs <= et >= servent a valider le cas que le pion
		 * avancent d'une seule case et ce même s'il est sur la ligne de depart.
		 */
    if (deplacement.getDeplacementX() == 0)
        if (this.getCouleur().equals("noir")){
				/*si le deplacementY est plus petit ou egal a 2 si la ligne de depart est egal  a 1 si la ligne de depart
				 * n'est pas egal  à 1, et que le déplacement n'est pas inférieur  à 0 (que le pion ne recule pas). Si le pion est
				 * Blanc, les conditions mais sont adaptes a un mouvement negatif et à une ligne de depart egal à 6.
				 */
            return deplacement.getDeplacementY() <= (deplacement.getDepart().getLigne() == 1 ? 2 : 1) && deplacement.getDeplacementY() > 0;
        }
        else
            return deplacement.getDeplacementY() >= (deplacement.getDepart().getLigne() == 6 ? -2 : -1) && deplacement.getDeplacementY() < 0;
    return false;
}
}

