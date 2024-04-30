import java.util.ArrayList;
import java.util.List;

public class ProxySongSearch implements SongService {
    private SongSearch realSongSearch;

    public void addSongToCollection(Song song) {
        if(realSongSearch == null) {
            realSongSearch = new SongSearch();
        }
        realSongSearch.addSongToCollection(song);
    }

    public Song searchById(int songId) {
        Song song = null;
        if(realSongSearch == null) {
            realSongSearch = new SongSearch();
        }
        song = realSongSearch.searchById(songId);
        return song;
    }

    public List<Song> searchByTitle(String title) {
        List<Song> matchingSongs = new ArrayList<>();
        if(realSongSearch == null) {
            realSongSearch = new SongSearch();
        }
        matchingSongs = realSongSearch.searchByTitle(title);
        return matchingSongs;
    }

    public List<Song> searchByAlbum(String album) {

        List<Song> albumSongs = new ArrayList<>();
        if(realSongSearch == null) {
            realSongSearch = new SongSearch();
        }
        albumSongs = realSongSearch.searchByAlbum(album);
        return albumSongs;
    }
}
