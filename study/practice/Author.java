package practice;

public class Author {
    public static void main(String[] args){
        Author anAuthor1 = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(anAuthor1);
    }
    private String name;
    private String email;
    private char gender;
    public Author (String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String newemail){
        email = newemail;
    }
    public String toString() {
        return String.format("%s (%c) at %s%n", name, gender, email);
    }

}
