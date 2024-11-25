package ie.atu.productv4;

public class Tv extends Product{
    private String size;
    private String manufacture;

    Tv(){
        super();
        size = "";
        manufacture = "";
    }

    public void setSize(String size){
        this.size = size;
    }

    public void setManufacture(String manufacture){
        this.manufacture = manufacture;
    }

    public String getSize(){
        return size;
    }

    public String getManufacture(){
        return manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacture + "\nScreen size is: " + size;
    }

}
