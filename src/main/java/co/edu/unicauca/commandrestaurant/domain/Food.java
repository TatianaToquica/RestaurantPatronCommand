package co.edu.unicauca.commandrestaurant.domain;

/**
 * Representa una comida del restaurante de cualquier tipo: Entrada, principio,
 * carne, postre
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class Food {

    private int id;
    private String name;
    private FoodTypeEnum type;

    public Food(int id, String name, FoodTypeEnum type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

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

    public FoodTypeEnum getType() {
        return type;
    }

    public void setType(FoodTypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Food{" + "id=" + id + ", name=" + name + ", type=" + type + '}';
    }

}
