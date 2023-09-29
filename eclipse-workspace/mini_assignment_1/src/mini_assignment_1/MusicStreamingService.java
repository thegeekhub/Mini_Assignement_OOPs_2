package mini_assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Song {
    private String name;
    private String artist;
    private String album;
    private int duration; // Duration in seconds

    public Song(String name, String artist, String album, int duration) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + " by " + artist + " (" + album + ") - " + duration + " seconds";
    }

	public String getName() {
		return name;
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
        System.out.println(song.getName() + " added to " + name + " playlist.");
    }

    public void removeSong(Song song) {
        if (songs.remove(song)) {
            System.out.println(song.getName() + " removed from " + name + " playlist.");
        } else {
            System.out.println(song.getName() + " is not in " + name + " playlist.");
        }
    }

    public void play() {
        System.out.println("Playing " + name + " playlist:");
        for (Song song : songs) {
            System.out.println("Now playing: " + song);
        }
    }

	public String getName() {
		return name;
	}

	public List<Song> getSongs() {
		return songs;
	}

}

public class MusicStreamingService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Playlist> playlists = new ArrayList<>();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Create Playlist");
            System.out.println("2. Add Song to Playlist");
            System.out.println("3. Remove Song from Playlist");
            System.out.println("4. Play Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    playlists.add(new Playlist(playlistName));
                    break;
                case 2:
                    System.out.print("Enter playlist name: ");
                    String playlistToAddTo = scanner.nextLine();
                    Playlist selectedPlaylist = findPlaylist(playlists, playlistToAddTo);
                    if (selectedPlaylist != null) {
                        System.out.print("Enter song name: ");
                        String songName = scanner.nextLine();
                        System.out.print("Enter artist name: ");
                        String artistName = scanner.nextLine();
                        System.out.print("Enter album name: ");
                        String albumName = scanner.nextLine();
                        System.out.print("Enter song duration (in seconds): ");
                        int duration = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        Song newSong = new Song(songName, artistName, albumName, duration);
                        selectedPlaylist.addSong(newSong);
                    } else {
                        System.out.println("Playlist not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter playlist name: ");
                    String playlistToRemoveFrom = scanner.nextLine();
                    Playlist selectedPlaylistToRemoveFrom = findPlaylist(playlists, playlistToRemoveFrom);
                    if (selectedPlaylistToRemoveFrom != null) {
                        System.out.print("Enter song name: ");
                        String songNameToRemove = scanner.nextLine();
                        Song songToRemove = findSong(selectedPlaylistToRemoveFrom, songNameToRemove);
                        if (songToRemove != null) {
                            selectedPlaylistToRemoveFrom.removeSong(songToRemove);
                        } else {
                            System.out.println("Song not found in the playlist.");
                        }
                    } else {
                        System.out.println("Playlist not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter playlist name to play: ");
                    String playlistToPlay = scanner.nextLine();
                    Playlist selectedPlaylistToPlay = findPlaylist(playlists, playlistToPlay);
                    if (selectedPlaylistToPlay != null) {
                        selectedPlaylistToPlay.play();
                    } else {
                        System.out.println("Playlist not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Playlist findPlaylist(List<Playlist> playlists, String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(playlistName)) {
                return playlist;
            }
        }
        return null;
    }

    private static Song findSong(Playlist playlist, String songName) {
        for (Song song : playlist.getSongs()) {
            if (song.getName().equalsIgnoreCase(songName)) {
                return song;
            }
        }
        return null;
    }
}

