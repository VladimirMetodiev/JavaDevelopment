package comparatorExercises.workers;

public class Worker {
    private String name;
    private int service;

    public Worker(String name, int service) {
        this.name = name;
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public int getService() {
        return service;
    }

    @Override
    public String toString() {
        return name + " " + service;
    }
}
