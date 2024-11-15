
//116598178 Henry Ahn
import java.util.ArrayList;

public class User {
    private String userName;
    private ArrayList<Playlist> playlists;

    public User(String userName) {
        this.userName = userName;
        this.playlists = new ArrayList<>();
    }

    public String getUsername() {
        return userName;
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void removePlaylist(String playlistTitle) {
        playlists.removeIf(playlist -> playlist.getTitle().equals(playlistTitle));
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public Playlist getPlaylist(String playlistTitle) {
        for (Playlist playlist : playlists) {
            if (playlist.getTitle().equals(playlistTitle)) {
                return playlist;
            }
        }
        return null;
    }

    public void makeCollaborativePlaylist(String playlistTitle, User friend) {
        Playlist playlist = getPlaylist(playlistTitle);
        if (playlist != null) {
            friend.addPlaylist(playlist);
        }
    }

    public String toString() {
        return userName + "'s playlists: " + playlists;
    }
}
