package se.ifmo.server.models.classes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import se.ifmo.server.models.enums.Color;
import se.ifmo.server.models.enums.DragonCharacter;

import lombok.*;
import se.ifmo.server.models.interfaces.Validatable;

@NoArgsConstructor
@Data
@EqualsAndHashCode
@JacksonXmlRootElement(localName = "dragon")
public class Dragon implements Comparable<Dragon>, Validatable {
    @JsonIgnore
    private long id;
    @NonNull
    private String name;
    @NonNull
    private Coordinates coordinates;
    @NonNull
    @JsonIgnore
    private java.time.LocalDate creationDate;
    @NonNull
    private Boolean speaking;
    @NonNull
    private Color color;
    @NonNull
    private DragonCharacter character; //Поле может быть null
    private DragonHead head;

    @Override
    public int compareTo(Dragon o) {
        return Long.compare(this.id, o.id);
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
