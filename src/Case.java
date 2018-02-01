public class Case
{
    private double position;
    private String nameOfCase;

    public Case(double pos , String name)
    {
        this.position=pos;
        this.nameOfCase=name;
    }

    public void setPosition(double position1)
    {
        this.position= position1;
    }
    public void setNameOfCase(String nameOfCase1)
    {
        this.nameOfCase=nameOfCase1;

    }

    public  double getPosition()
    {
        return this.position;
    }

    public  String getNameOfCase()
    {
        return this.nameOfCase;
    }

}