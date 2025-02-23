package se.ifmo.server.models.id;
import java.util.HashSet;
import java.util.Set;

public class IdGenerator {
    private static final Set<Integer> dragonsIds = new HashSet<>();

    public static int generateId() {
        int id;
        do {
            id = (int) (Math.random() * 100000);
        } while (dragonsIds.contains(id));
        dragonsIds.add(id);
        return id;
    }
}
