import Piece;

public class Case {
    private int positionX;
    private int positionY;
    private String nameOfCase;
    private Piece piece;

    public Case(int posX, int posY) {
        this.positionX = posX;
        this.positionY = posY;
    }

    public void setPositionX(double positionX1)
    {
        this.positionX= positionX1;
    }

    public void setPositionY(double positionY1)
    {
        this.positionY= positionY1;
    }
    public void setNameOfCase(String nameOfCase1)
    {
        this.nameOfCase=nameOfCase1;

    }

    public double getPositionX()
    {
        return this.positionX;
    }
    public double getPositionY()
    {
        return this.positionY;
    }

    public String getNameOfCase()
    {
        return this.nameOfCase;
    }

    /**
     * Methode estOccupe servant a savoir si la case est occupe ou non.
     *
     */
    public boolean estOccupe()
    {
        return (piece != null);
    }

    /**
     * Methode estOccupe servant a savoir si la case est occupe ou non d'une piece d'une couleur entrer en parametre.
     *
     */
    public boolean estOccupe(String couleur)
    {
        if (piece == null)
            return false;
        else
            return (piece.getColor().equals(couleur));
    }

}