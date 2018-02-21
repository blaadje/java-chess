public class Piece
{
    private String color;
    private String name;
    private Boolean inGame;

    public Piece(String color, String name, Boolean inGame)
    {
        this.color = color;
        this.name = name;
        this.inGame = inGame;
    }

    public boolean isValid () {

    }

    public boolean isIngame () {
        return Ingame;
    }

    public void setIngame (boolean inGame) {
        this.inGame = inGame;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInGame(Boolean inGame) {
        this.inGame = inGame;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getInGame() {
        return inGame;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}