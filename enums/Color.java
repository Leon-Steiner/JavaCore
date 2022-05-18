/**
 * JavaCore package Homework1
 *
 * @author Leon Steiner
 * version 18.05.2022
 */
package Homework1.enums;

public enum Color {
    WHITE("Белый"),
    BLACK("Черный"),
    BROWN("Коричневый"),
    GRAY("Серый"),
    YELLOW("Желтый"),
    RED("Рыжий");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName()  {
        return name;
    }
}