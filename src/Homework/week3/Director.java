package Homework.week3;

import java.util.ArrayList;

/**
 * Created by ivan on 25.11.15.
 */
public class Director implements IDirector {

    private Circus circus = new Circus("Old locatoin");


    public void showAllArtist() {
        ArrayList<Artist> artists = circus.getArtists();
        System.out.println("Artists: ");
        for (Artist artist : artists) {
            System.out.println(artist);
        }
    }

    public void hire(Artist artist) {
        circus.addArtist(artist);
    }

    public void showMostDrinkerAcrobat() {
        Artist drinkAcrobat = circus.fireMostDrinkAcrobat();
        if (drinkAcrobat == null) {
            System.out.println("Alcoholics aren't  our target!");
        } else {
            System.out.println(drinkAcrobat);
        }
    }

    public void forseToWork(int id) {
        if (circus.getArtistsByID(id) == null) {
            System.out.println("You don't have this artist!!");
        } else {
            circus.getArtistsByID(id).act();
        }
    }

    public void showArtistAct(int id) {
        Artist artist = circus.getArtistsByID(id);
        if (artist == null){
            System.out.println("This artist dosn't resist" + id);
        } else {
            System.out.println("Today " + artist.getName() + " artist have " + artist.getCountOfAct() + " acts");
        }
    }

    public double ToPayWages(int artistID) {
        Artist artist = circus.getArtistsByID(artistID);
        if (artist instanceof Acrobat ){
            artist.reciveSalary(12);
        } else {
            artist.reciveSalary(10);
        }
        return artist.getMoney();
    }

    public void circusChangeLocation(String location) {
        circus.setLocation(location);
    }

    public void showStatus(){
        showAllArtist();
        for (Artist artist : circus.getArtists()) {
            showArtistAct(artist.getId());
        }
        System.out.println(circus.getLocation());

    }
}
