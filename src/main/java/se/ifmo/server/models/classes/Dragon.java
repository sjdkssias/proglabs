package se.ifmo.server.models.classes;

import se.ifmo.server.models.enums.DragonCharacter;

import lombok.*;
import se.ifmo.server.models.interfaces.Validatable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dragon implements Comparable<Dragon>, Validatable {
    private static int idCounter = 1;
    @NonNull
    private Integer id;
    @NonNull//Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name;
    @NonNull//Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer oscarsCount; //Значение поля должно быть больше 0, Поле может быть null
    private Double budget; //Значение поля должно быть больше 0, Поле может быть null
//    private Long totalBoxOffice; //Поле не может быть null, Значение поля должно быть больше 0
    private DragonCharacter mpaaRating; //Поле может быть null
    private DragonHead screenwriter;


    @Override
    public int compareTo(Dragon other) {
        return this.id.compareTo(other.id);
    }


    @Override
    public boolean validate() {
        if (id <= 0) return false;
        if (name == null || name.isEmpty()) return false;
        if (creationDate == null) return false;
        if (coordinates == null || !coordinates.validate()) return false;
        return true;
    }
}
