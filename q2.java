
import java.util.ArrayList;
import java.util.List;

class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }
}

class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public List<Song> getSongs() {
        return songs;
    }
}

public class q2 {// this main because file name is change
    public static void main(String[] args, int duration) {
        
        Playlist myPlaylist = new Playlist("My Favorite Songs");

        
        Song song1 = new Song("zama ashna", "pata neshta", duration:1660);
        Song song2 = new Song("love hogaya", "gul khan", 200);
        Song song3 = new Song("hello ", "khan jan", 1800);

        // Add songs to the playlist
        myPlaylist.addSong(song1);
        myPlaylist.addSong(song2);
        myPlaylist.addSong(song3);

        // Print the current songs in the playlist
        System.out.println("Current songs in the playlist:");
        for (Song song : myPlaylist.getSongs()) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

        
        myPlaylist.removeSong(song2);

        
        System.out.println("\nSongs in the playlist after removal:");
        for (Song song : myPlaylist.getSongs()) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
    }
}
