package design;

public abstract class EmployeeAbstract {
    int rating;
    //abstract method
    public abstract void emphistor();
    //non-abstract method
    public void rating (int rate) {
        this.rating = rate;
    }
}
