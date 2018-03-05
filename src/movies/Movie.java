package movies;
import java.util.Scanner;

public class Movie {

    private String nameIs;

    private String categoryOf;

    public Movie(String nameIs, String categoryOf) {
        this.nameIs = nameIs;
        this.categoryOf = categoryOf;
    }

    public String getNameIs() {
        return nameIs;
    }

    public void setNameIs(String nameIs) {
        this.nameIs = nameIs;
    }

    public String getCategoryOf() {
        return categoryOf;
    }

    public void setCategoryOf(String categoryOf) {
        this.categoryOf = categoryOf;
    }

}
