package Week2.Day3.Book;

public class Author {
    String name;
    char gender;

    public Author(String name, char gender) {
        setName(name);
        setGender(gender);
    }

    public Author() {
        this("Anonymous", 'm');
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ((gender != 'm' && gender != 'f')) {
            this.gender = 'm';
            return;
        }
        this.gender = gender;
    }

}
