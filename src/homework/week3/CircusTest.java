package homework.week3;

/**
 * Created by ivan on 25.11.15.
 */
public class CircusTest {
    public static void main(String[] args) {
        Director director = new Director();

        director.hire(new Mage(1, "Cherepok", 10));
        director.hire(new Acrobat(2, "Vasia", 10, 0));
        director.hire(new Acrobat(3, "Anton", 20, 0));
        director.showAllArtist();
        director.showMostDrinkerAcrobat();
        director.showAllArtist();
        director.forseToWork(1);
        director.showArtistAct(10);
        System.out.println(director.ToPayWages(1));
        director.showAllArtist();
        director.circusChangeLocation("New locatoin");
        director.showStatus();
    }
}
