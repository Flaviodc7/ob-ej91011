import java.util.LinkedList;

public class Artists implements IteratorArtist {
    private LinkedList<Artist> artists = new LinkedList<>();
    private int position = 0;

    public void create(Artist artist){
        artists.add(artist);
    }
    @Override
    public Artist next(){
        Artist artist = this.artists.get(position);
        position++;
        return artist;
    }

    @Override
    public boolean hasMore(){
        return position < artists.size();
    }

    @Override
    public void reset() {
        position = 0;
    }
}
