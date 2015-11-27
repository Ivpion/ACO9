package Homework.week3;

import java.util.ArrayList;

/**
 * Created by ivan on 25.11.15.
 */
public class Circus {

    private ArrayList<Artist> artists = new ArrayList();
    private String location;

    public Circus(String location) {
        this.location = location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }

    public void addArtist(Artist artist) {
        this.artists.add(artist);
    }

    public ArrayList<Acrobat> getAcrobats() {
        ArrayList<Acrobat> acrobats = new ArrayList<>();
        for (Artist artist : artists) {
            if (artist instanceof Acrobat) {
                acrobats.add((Acrobat) artist);
            }
        }
        return acrobats;
    }

    public Artist fireMostDrinkAcrobat() {
        ArrayList<Acrobat> acrobats = getAcrobats();

        Acrobat drinker = acrobats.get(0);
        for (int i = 0; i < acrobats.size(); i++) {
            if (acrobats.get(i).getPromille() > drinker.getPromille()) {
                drinker = acrobats.get(i);
            }
        }
        if (drinker.getPromille() == 0) {
            return null;
        }
        artists.remove(drinker);
        return drinker;
    }

    public Artist getArtistsByID(int id) {
        for (int i = 0; i < artists.size(); i++) {
            if (artists.get(i).getId() == id) {
                return artists.get(i);
            }
        }
        return null;
    }

    public int showArtistActCoutn(int artistId) {
        Artist artist = getArtistsByID(artistId);
        if (artist == null) {
            return 0;
        }
        return artist.getCountOfAct();
    }

}


