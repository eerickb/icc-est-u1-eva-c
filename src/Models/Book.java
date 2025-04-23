package Models;

public class Book {

    private String name;
    private int year;

    private String name(){
        return name();
    }
    private int year(){
        return year();
    }

    public Book(String string, int i) {
        this.name();
        this.year();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
