import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProxySongSearch proxySearch = new ProxySongSearch();

        Song songOne = new Song("take", "hopes n' stuff", "yes", 230, 123);
        Song songTwo = new Song("hardship", "hopes n' stuff", "yes", 300, 124);
        Song songThree = new Song("babylon", "nutcase", "infinitum", 120, 125);
        Song songFour = new Song("yesterday today", "nutcase", "red sky", 450, 289);
        Song songFive = new Song("new world", "zydra", "crescent", 800, 1028);

        Song testSong = null;
        List<Song> testSongCollection = null;

        proxySearch.addSongToCollection(songOne);
        proxySearch.addSongToCollection(songTwo);
        proxySearch.addSongToCollection(songThree);
        proxySearch.addSongToCollection(songFour);
        proxySearch.addSongToCollection(songFive);

        testSong = proxySearch.searchById(123);
        testSong.songDetails();

        testSongCollection = proxySearch.searchByAlbum("infinitum");
        for (Song song : testSongCollection) {
            song.songDetails();
        }

        testSongCollection = proxySearch.searchByTitle("new world");
        for (Song song : testSongCollection) {
            song.songDetails();
        }

        testSong = proxySearch.searchById(289);
        testSong.songDetails();

        testSongCollection = proxySearch.searchByAlbum("yes");
        for(Song song: testSongCollection) {
            song.songDetails();
        }
    }
}