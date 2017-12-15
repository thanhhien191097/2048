package linhmil.oop.hcmiu.rescuepets.entities.model;

/**
 * Created by Admin on 12/10/2017.
 */

public class Pets {
    private int id;
    private String name;
    private int pic;

    public Pets(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Pets() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public void assign(Pets p) {
        id=p.getId();
        pic=p.getPic();
        name=p.getName();
    }
}
