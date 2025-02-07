package se.ifmo.server.models.classes;

import lombok.*;
import se.ifmo.server.models.enums.Color;
import se.ifmo.server.models.interfaces.Validatable;

public class DragonHead {
    private float toothcount;

    public DragonHead(float toothcount) {
        this.toothcount = toothcount;
    }


}
