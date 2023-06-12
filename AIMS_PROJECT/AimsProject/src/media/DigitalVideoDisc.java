package media;


public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String string, String string2, String string3, int i, float f) {
        super(string, string2, string3, i, f);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public String toString() {
        return "(Digital Dvd): " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - "
                + this.getLength() + " : " + this.getCost() + "$";
    }

}