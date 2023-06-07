package media;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    // Constructor Methods
    // Count number of DVD objects
    public DigitalVideoDisc() {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor Method 1: Create a DVD object by title
    public DigitalVideoDisc(String title) {
        this();
        this.title = title;
    }
    // Constructor Method 2: Create a DVD object by category, title and cost
    public DigitalVideoDisc(String category, String title, float cost) {
        this();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    // Constructor Method 3: Create a DVD object by director, category, title and
    // cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    // Constructor Method 4: Create a DVD object by all attributes: title, category,
    // director, length and cost
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - "
                + length + " : " + cost + "$";
    }

    public boolean isMatch(String title) {
        // compare this.title vs title
        return this.title.contains(title);
    }
}


