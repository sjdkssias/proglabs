package se.ifmo.server.file.handlers;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import se.ifmo.server.models.classes.Dragon;

import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

public class XmlHandler implements IOHandler<TreeMap<Integer, Dragon>>{
    private final File file = new File("dragon_collection.xml");
    private final XmlMapper xmlMapper = new XmlMapper();
    @Override
    public TreeMap<Integer, Dragon> read() {
        try {
            return xmlMapper.readValue(file, xmlMapper.getTypeFactory().constructMapType(TreeMap.class, Integer.class, Dragon.class));
        } catch (IOException e) {
            System.err.println("Ошибка при чтении XML-файла: " + e.getMessage());
            return new TreeMap<>();
        }
    }

    @Override
    public void write(TreeMap<Integer, Dragon> value) throws IOException {
        xmlMapper.writeValue(file, value);
    }

    @Override
    public void close(){

    }
}
