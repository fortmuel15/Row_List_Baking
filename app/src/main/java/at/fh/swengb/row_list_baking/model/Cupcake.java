package at.fh.swengb.row_list_baking.model;

import java.io.Serializable;

/**
 * Created by 2540p on 22.11.2016.
 */

public class Cupcake implements Serializable {

    private String Name;
    private String Taste;
    private Integer Calories;
    private String colorCupcakeCase;

    public Cupcake() {
    }

    public Cupcake(String name, String taste, Integer calories, String colorCupcakeCase) {
        Name = name;
        Taste = taste;
        Calories = calories;
        this.colorCupcakeCase = colorCupcakeCase;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTaste() {
        return Taste;
    }

    public void setTaste(String taste) {
        Taste = taste;
    }

    public Integer getCalories() {
        return Calories;
    }

    public void setCalories(Integer calories) {
        Calories = calories;
    }

    public String getColorCupcakeCase() {
        return colorCupcakeCase;
    }

    public void setColorCupcakeCase(String colorCupcakeCase) {
        this.colorCupcakeCase = colorCupcakeCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cupcake cupcake = (Cupcake) o;

        if (Name != null ? !Name.equals(cupcake.Name) : cupcake.Name != null) return false;
        return Taste != null ? Taste.equals(cupcake.Taste) : cupcake.Taste == null;

    }

    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + (Taste != null ? Taste.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cupcake{");
        sb.append("Name='").append(Name).append('\'');
        sb.append(", Taste='").append(Taste).append('\'');
        sb.append(", Calories=").append(Calories);
        sb.append(", colorCupcakeCase='").append(colorCupcakeCase).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
