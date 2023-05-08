
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared){
        // compare variables location
        if (this == compared){
            return true;
        }
        //compare the objects
        if (!(compared instanceof Book)){
            return false;
        }
        //compare the variables
        Book comparedBook = (Book)compared;
        if (this.name.equals(comparedBook.name) &&
            this.publicationYear == comparedBook.publicationYear ){
            return true;
        }
        return false;
    }

}
