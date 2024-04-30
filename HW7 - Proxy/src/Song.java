public class Song {
    private String title;
    private String artist;
    private String album;
    private int duration;
    private int id;

    public Song(String title, String artist, String album, int duration, int id) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.id = id;
    }

    public void songDetails() {
        System.out.println("Title: " + title + " | Artist: " + artist +
                " | Album: " + album + " | Duration : " + duration + " | ID: " + id);
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public String getAlbum() {
        return album;
    }
}