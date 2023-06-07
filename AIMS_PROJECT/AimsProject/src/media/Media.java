package media;
import java.lang.Object;
public class Media {
    
    public int id;
    public String title;
    public String category;
    public float cost;

    
    // Constructor
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Media() {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
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
    
    public float getCost() {
        return cost;
    }
    
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public boolean search(String title) {
        String[] words = title.toLowerCase().split(" ");
        for (String word : words) {
            if (this.title.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nCategory: " + category + "\nCost: " + cost;
    }

    
}
