package se.ifmo.server;

import java.util.TreeMap;
import se.ifmo.server.file.handlers.XmlHandler;
import se.ifmo.server.models.classes.Dragon;


public class CollectionManager {
    private static CollectionManager instance;

    private final TreeMap<Integer, Dragon> dragons = new TreeMap();


    private CollectionManager() {
        load();
    }

    public static synchronized CollectionManager getInstance() {
        if (instance == null) {
            instance = new CollectionManager();
        }
        return instance;
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
}
