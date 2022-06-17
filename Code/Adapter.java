public class Adapter {

    private Service adapter;

    public Adapter(Service adapter) {
        this.adapter = adapter;
    }

    public Service getAdapter() {
        return adapter;
    }

    public void setAdapter(Service adapter) {
        this.adapter = adapter;
    }

}
