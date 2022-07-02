import java.util.ArrayList;

public abstract class Pocket {
    private ArrayList<Object> objects;

    public Pocket() {
        this.objects = new ArrayList<>();
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<Object> objects) {
        this.objects = objects;
    }

    public String Сonnect() {
        String showLed = "";
        for (Object obj : this.objects) {
            showLed = showLed + obj.toString() + ", ";
        }
        return showLed;
    }

    public void AddObject(Object object) {
        this.objects.add(object);
    }

    public void RemoveObject(Object object) {
        this.objects.remove(object);
    }

    @Override
    public String toString() {
        return "В кармане лежит: " + objects.size() + " обьектов";
    }
}
