
//116598178 Henry Ahn
import java.util.ArrayList;

public class Playlist {
    private String playlistTitle;
    private ArrayList<Song> songs;

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return playlistTitle;
    }

    public void setTitle(String newTitle) {
        this.playlistTitle = newTitle;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(String songTitle) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getSongName().equals(songTitle)) {
                songs.remove(i);
                break;
            }
        }
    }

    public void swapSongs(Song song1, Song song2) {
        int index1 = -1, index2 = -1;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).equals(song1))
                index1 = i;
            if (songs.get(i).equals(song2))
                index2 = i;
        }
        if (index1 != -1 && index2 != -1) {
            Song temp = songs.get(index1);
            songs.set(index1, songs.get(index2));
            songs.set(index2, temp);
        }
    }

    public String getTotalDuration() {
        int totalMinutes = 0, totalSeconds = 0;
        for (Song song : songs) {
            String[] parts = song.getDuration().split(":");
            totalMinutes += Integer.parseInt(parts[0]);
            totalSeconds += Integer.parseInt(parts[1]);
        }
        totalMinutes += totalSeconds / 60;
        totalSeconds = totalSeconds % 60;
        return totalMinutes + " min, " + totalSeconds + " sec";
    }

    public void sortSongs() {
        for (int i = 0; i < songs.size() - 1; i++) {
            for (int j = 0; j < songs.size() - i - 1; j++) {
                if (songs.get(j).compareTo(songs.get(j + 1)) > 0) {
                    Song temp = songs.get(j);
                    songs.set(j, songs.get(j + 1));
                    songs.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(playlistTitle).append(" - ").append(getTotalDuration()).append("\n");
        int index = 1;
        for (Song song : songs) {
            sb.append(index++).append(". ").append(song).append("\n");
        }
        return sb.toString().trim();
    }
}
