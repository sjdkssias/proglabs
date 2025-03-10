package se.ifmo.server;

import lombok.Getter;
import se.ifmo.server.file.handlers.XmlHandler;
import se.ifmo.server.models.classes.Dragon;

import java.io.IOException;
import java.util.*;

@Getter
public class CollectionManager {
    private static CollectionManager instance;

    private final TreeMap<Long, Dragon> dragons = new TreeMap<>();


    private CollectionManager() {
        load();
    }

    public static CollectionManager getInstance() {
        if (instance == null) {
            instance = new CollectionManager();
        }
        return instance;
    }

    public int generateId() {
        Random random = new Random();
        int newId;
        do {
            newId = random.nextInt(Integer.MAX_VALUE);
        } while (dragons.containsKey(newId)); // Генерируем, пока не получим уникальный id
        return newId;
    }

    public void load() {
        try (XmlHandler xmlHandler = new XmlHandler()) {
            dragons.clear();
            dragons.putAll(xmlHandler.read());
            System.out.printf("loaded %d elements%n", dragons.size());
        } catch (NullPointerException e) {
        }
    }

    public void save() {
        try (XmlHandler xmlHandler = new XmlHandler()) {
            xmlHandler.write(dragons);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    public List<Long> getIds() {
        return new ArrayList<>(dragons.keySet());
    }


    public boolean containsId(long id) {
        return dragons.containsKey(id);
    }

    public void removeById(long id) {
        dragons.remove(id);
    }

    public void add(Dragon dragon) {
        long k = generateId();
        dragons.put(k, dragon);
        dragon.setId(k);
    }

    public List<Dragon> getMaxByKey() {
        if (dragons.isEmpty()) {
            return Collections.emptyList();
        }
        long maxKey = dragons.lastKey();
        return List.of(dragons.get(maxKey));
    }

}
