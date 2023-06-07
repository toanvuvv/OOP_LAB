package media;

public class DigitalVideoDisc extends Media {
    private static int nbDigitalVideoDiscs = 0;
    
    private String director;
    private int length;
    
    
    // Constructor Methods
    // Count number of DVD objects
    public DigitalVideoDisc() {
        super();
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor Method 1: Create a DVD object by title
    
    // Constructor Method 2: Create a DVD object by category, title and cost
    
    // Constructor Method 3: Create a DVD object by director, category, title and
    // cost
    
    // Constructor Method 4: Create a DVD object by all attributes: title, category,
    // director, length and cost
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }
    public DigitalVideoDisc(String title, String category,  float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
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


