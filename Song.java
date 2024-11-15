//116598178 Henry Ahn
public class Song implements Comparable<Song> {
    private String songName;
    private String artistName;
    private String duration;

    public Song(String songName, String artistName, String duration) {
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Song other) {
        int nameComparison = this.songName.compareTo(other.songName);
        if (nameComparison == 0) {
            return this.artistName.compareTo(other.artistName);
        }
        return nameComparison;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Song) {
            Song other = (Song) obj;
            return songName.equals(other.songName) && artistName.equals(other.artistName);
        }
        return false;
    }

    public String toString() {
        return songName + " by " + artistName + " (" + duration + ")";
    }
}
