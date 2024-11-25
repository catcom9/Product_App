package ie.atu.productv4;

public class Music extends Product{
    private String artist;
    private String label;

    public Music(){
        super();
        artist = "";
        label = "";
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public String getArtist(){
        return artist;
    }

    public String getLabel(){
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist + "\nPart of the " + label;
    }



}
