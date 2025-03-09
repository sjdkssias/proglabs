package se.ifmo.server;

import java.util.*;

import se.ifmo.server.file.handlers.XmlHandler;
import se.ifmo.server.models.classes.Dragon;
public class CollectionManager {
    private static CollectionManager instance;

    private final TreeMap<Integer, Dragon> dragons = new TreeMap();


    private CollectionManager() {
        load();
    }

    public static CollectionManager getInstance() {
        if (instance == null) {
            instance = new CollectionManager();
        }
        return instance;
    }

    public int generateId(){
        Random random = new Random();
        int newId;
        do {
            newId = random.nextInt(Integer.MAX_VALUE);
        } while (dragons.containsKey(newId)); // Генерируем, пока не получим уникальный id
        return newId;
    }

    public void load(){
        try (XmlHandler xmlHandler = new XmlHandler()) {
            dragons.clear();
            dragons.putAll(xmlHandler.read());
            System.out.printf("loaded %d elements%n", dragons.size());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void save(){
        try (XmlHandler xmlHandler = new XmlHandler()){
            xmlHandler.write(dragons);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void clear(){
        try (XmlHandler xmlHandler = new XmlHandler()){
            dragons.clear();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public List<Integer> getIds(){
        return new ArrayList<>(dragons.keySet());
    }


    public boolean containsId(int id) {
        return dragons.containsKey(id);
    }

    public void removeById(int id){
        dragons.remove(id);
    }

    public void add(Dragon dragon){
        int k = generateId();
        dragons.put(k, dragon);
        dragon.setId(k);
    }

    public List<Dragon> getMaxByKey() {
        if (dragons.isEmpty()) {
            return Collections.emptyList();
        }
        int maxKey = dragons.lastKey();
        return List.of(dragons.get(maxKey));
    }

}
