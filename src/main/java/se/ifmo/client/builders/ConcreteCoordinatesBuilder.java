package se.ifmo.client.builders;

import se.ifmo.server.models.classes.Coordinates;

public class ConcreteCoordinatesBuilder implements CoordinatesBuilder{
    private Coordinates coordinates;
    public ConcreteCoordinatesBuilder(){
        coordinates = new Coordinates();
    }

    @Override
    public CoordinatesBuilder setX(Float x) {
        coordinates.setX(x);
        return this;
    }

    @Override
    public CoordinatesBuilder setY(Long y) {
        coordinates.setY(y);
        return this;
    }

    public Coordinates getResult(){
        return coordinates;
    }
}
