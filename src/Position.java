/**
 * classe position servant a representer une coordonnee sur l'echiquier.
 *
 * @author Francois Allard
 */
public class Position {
    /**
     * Numero de la ligne
     */
    private int ligne;
    /**
     * Numero de la colonne
     */
    private int colonne;

    /**
     * Constructeur de la classe position, sert a initialiser les deux parametre
     * d'une position, sa ligne et sa colonne
     *
     * prend en parametre le numero de colonne de la position
     *
     * prend en  parametre le numero de ligne de la position
     *
     */
    public Position(int colonne, int ligne) {
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public int getLigne() {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    public boolean equals(Position position) {
        return position.getColonne() == this.getColonne()
                && position.ligne == this.ligne;
    }

}
