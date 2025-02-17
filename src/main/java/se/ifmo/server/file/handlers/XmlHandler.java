package se.ifmo.server.file.handlers;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import se.ifmo.server.models.classes.Dragon;

import java.util.TreeMap;

public class XmlHandler implements IOHandler<TreeMap<Integer, Dragon>>{
    private final XmlMapper xmlMapper = new XmlMapper();


    @Override
    public TreeMap<Integer, Dragon> read() {
        return null;
    }

    @Override
    public void write(TreeMap<Integer, Dragon> value) {

    }

    @Override
    public void close(){

    }
}
