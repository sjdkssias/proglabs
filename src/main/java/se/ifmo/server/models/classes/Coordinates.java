package se.ifmo.server.models.classes;
import lombok.*;
import se.ifmo.server.models.interfaces.Validatable;


@Getter
@Setter
@RequiredArgsConstructor
public class Coordinates implements Validatable {
    @NonNull
    private Double x;
    @NonNull
    private Double y; //Поле не может быть null

    @Override
    public boolean validate() {
        if (x <= 0 || y <= 0) {
            return false;
        }
        return true;
    }
}
