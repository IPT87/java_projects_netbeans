
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        
        if (!(object instanceof Song)) {
            return false;
        }
        
        Song song = (Song) object;
        
        if (this.artist.equals(song.artist) &&
                this.name.equals(song.name) &&
                this.durationInSeconds == song.durationInSeconds) {
            return true;
        }
        
        return false;
    }


}
