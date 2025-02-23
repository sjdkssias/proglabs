package se.ifmo.server.file.handlers;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import se.ifmo.server.models.classes.Dragon;

import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

public class XmlHandler implements IOHandler<TreeMap<Integer, Dragon>>{
    @Override
    public TreeMap<Integer, Dragon> read() {
        return null;
    }

    @Override
    public void write(TreeMap<Integer, Dragon> value) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("dragon_collection.xml"), value);
    }

    @Override
    public void close(){

    }
}
