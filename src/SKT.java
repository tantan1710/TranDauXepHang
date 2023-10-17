import java.util.ArrayList;

public class SKT {
    private String name;
    private ArrayList<Figure> figures = new ArrayList<>();

    public SKT(String name, ArrayList<Figure> figures) {
        this.name = name;
        this.figures = figures;
    }
    public static void add(SKT skt) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "SKT{" +
                "name='" + name + '\'' +
                ", figures=" + figures +
                '}';
    }
}
