package homework.week3;

/**
 * Created by ivan on 27.11.15.
 */
public interface IDirector {
    public void showAllArtist();
    public void hire(Artist artist);
    public void showMostDrinkerAcrobat();
    public void forseToWork(int id);
    public void showArtistAct(int id);
    public double ToPayWages(int artistID);
    public void circusChangeLocation(String location);
}
