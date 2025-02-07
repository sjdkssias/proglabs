package se.ifmo.server;
import java.util.TreeSet;

import se.ifmo.server.models.classes.Dragon;


public class CollectionManager {
    private static CollectionManager instance;

    private final TreeSet<Dragon> movies = new TreeSet<>();;

    private CollectionManager() {
        clearCollection();
    }

    public static synchronized CollectionManager getInstance() {
        if (instance == null) {
            instance = new CollectionManager();
        }
        return instance;
    }


    public void addMovie(Dragon movie){
        if (movie.validate()){
            movies.add(movie);
        } else {
            throw new IllegalArgumentException("Нельзя ввести такой фильм");
        }
    }
    public void removeMovie(Dragon movie){
        movies.remove(movie);

    }
    public void clearCollection(){
        movies.clear();
    }
    
}
