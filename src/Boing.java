public class Boing extends Flight{

    public Boing() {
    }

    public Boing(int id, String model, String type) {
        this.id = id;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Boing: " +
                "Id = " + id +
                " Model = " + model +
                " Type = " + type;
    }
}
