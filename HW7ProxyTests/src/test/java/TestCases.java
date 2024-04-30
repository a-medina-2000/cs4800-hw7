
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCases {
    Song testSongOne = new Song("take", "hopes n' stuff", "yes", 230, 123);
    Song testSongTwo = new Song("hardship", "hopes n' stuff", "yes", 300, 124);
    Song testSongThree = new Song("babylon", "nutcase", "infinitum", 120, 125);
    ProxySongSearch testProxySearch = new ProxySongSearch();

    @Test
    public void testIDSearch() {
        testProxySearch.addSongToCollection(testSongOne);
        testProxySearch.addSongToCollection(testSongTwo);
        testProxySearch.addSongToCollection(testSongThree);

        int expected = 123;
        Song songActual = testProxySearch.searchById(123);
        int actual = songActual.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testTitleSearch() {
        List<Song> testMatchingSongs = new ArrayList<>();
        testProxySearch.addSongToCollection(testSongOne);
        testProxySearch.addSongToCollection(testSongTwo);
        testProxySearch.addSongToCollection(testSongThree);

        testProxySearch.searchByTitle("hardship");
        String expected = "hardship";
        testMatchingSongs = testProxySearch.searchByTitle("hardship");
        String actual = testMatchingSongs.get(0).getTitle();
        assertEquals(expected, actual);
    }

    @Test
    public void testAlbumSearch() {
        List<Song> testMatchingSongs = new ArrayList<>();
        testProxySearch.addSongToCollection(testSongOne);
        testProxySearch.addSongToCollection(testSongTwo);
        testProxySearch.addSongToCollection(testSongThree);

        String expected = "yes";
        testMatchingSongs = testProxySearch.searchByAlbum("yes");
        String actual = testMatchingSongs.get(0).getAlbum();
        assertEquals(expected, actual);
    }

}




