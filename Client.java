package Clases;

/**
 * Class to store Clients information
 * @author sheilaRodríguez
 */
public class Client extends User
{
    private int rankingPoints;


    public int getRankingPoints()
    {
        return rankingPoints;
    }

    public void setRankingPoints(int rankingPoints)
    {
        this.rankingPoints = rankingPoints;
    }


}
