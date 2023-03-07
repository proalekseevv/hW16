import java.util.Objects;

public class Author {
    private String name;
    private String lastnames;

    public  Author  (String name, String lastnames) {
        this.name = name;
        this.lastnames = lastnames;
    }

    public String getName () {
        return this.name;
    }
    public String getLastnames () {
        return this.lastnames;
    }
    public String toString(){
        return "Имя " + " " + this.name + " Фамилия " + this.lastnames;
    }

    @Override
    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return name.equals(author.name) && lastnames.equals(author.lastnames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastnames);
    }


}