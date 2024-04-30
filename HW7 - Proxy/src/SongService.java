import java.util.*;

public interface SongService {
    Song searchById(int songId);
    List<Song> searchByTitle(String title);
    List<Song> searchByAlbum(String album);
}


class SongSearch implements SongService {
    List<Song> songGroup = new ArrayList<Song>();

    public void addSongToCollection(Song song) {
        songGroup.add(song);
    }

    public Song searchById(int songId) {
        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {};

        Song song = null;
        for (int i = 0; i < songGroup.size(); i++) {
            if (songGroup.get(i).getId() == songId) {
                song = songGroup.get(i);
            }
        }
        return song;
    }

    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {};

        List<Song> matchingSongs = new ArrayList<>();

        for (int i = 0; i < songGroup.size(); i++) {
            if (songGroup.get(i).getTitle() == title) {
                matchingSongs.add(songGroup.get(i));
            }
        }
        return matchingSongs;
    }

    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {};

        List<Song> albumSongs = new ArrayList<>();

        for (int i = 0; i < songGroup.size(); i++) {
            if (songGroup.get(i).getAlbum() == album) {
                albumSongs.add(songGroup.get(i));
            }
        }
        return albumSongs;
    }
}
