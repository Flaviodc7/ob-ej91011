public class Artist {
    private String name;
    private int age;

    private Artist(){}
    public Artist(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
