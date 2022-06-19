public class Tu154 extends Flight{

    public Tu154() {
    }

    public Tu154(int id, String model, String type) {
        this.id = id;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tu154: " +
                "Id = " + id +
                " Model = " + model +
                " Type = " + type;
    }
}
