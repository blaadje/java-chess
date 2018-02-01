public class main {

    public static void main(String[] args)
    {

    }
}

class Plateau
{
    public static int SIZE = 8;

    private Case[][] Plateau = new Case[SIZE][SIZE];

    public Plateau () {
        for (int i = 0; i < Plateau.length; i++) {
            for (int j = 0; j < Plateau.length; j++) {
                this.Plateau[i][j] = new Case(i, j);
            }
        }
    }

    public Case getCase (int x, int y) {
        return Case[x][y];
    }
}
