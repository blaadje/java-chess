public class Case
{
    private double positionX;
    private double positionY;
    private String nameOfCase;


    public Case(double posX,double posY)
    {
        this.positionX=posX;
        this.positionY=posY;


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

    public  double getPositionX()
    {
        return this.positionX;
    }
    public  double getPositionY()
    {
        return this.positionY;
    }

    public  String getNameOfCase()
    {
        return this.nameOfCase;
    }

}