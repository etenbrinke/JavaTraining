package www3.ntu.edu;

/**
 * Created by etenbrinke on 23/11/15.
 * https://www3.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
 */

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString()
    {
        return name + " (" + gender + ") at " + email;
    }
}
