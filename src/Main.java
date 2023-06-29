public class Main {
    public static void main(String []args){
        Artists artists = new Artists();
        artists.create(new Artist("Charly Garcia", 71));
        artists.create(new Artist("Fito Paez", 60));
        artists.create(new Artist("Roger Waters", 79));
        artists.create(new Artist("Nick Mason", 79));

        while (artists.hasMore()){
            Artist artist = artists.next();
            System.out.println("The artist is: " + artist.getName() + " and his current age is: " + artist.getAge());
        }

        artists.reset();
    }
}