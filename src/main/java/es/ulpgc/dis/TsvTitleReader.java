package es.ulpgc.dis;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TsvTitleReader implements TitleReader {

    private final File file;

    public TsvTitleReader(File file) {
        this.file = file;
    }

    public List<Title> readTitle() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./title.basics.tsv"));
            reader.readLine();
            return readWith(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Title> readWith(BufferedReader reader) throws IOException {
        TsvTitleDeserializer deserializer = new TsvTitleDeserializer();
        List<Title> result = new ArrayList<Title>();
        while(true) {
            String line = reader.readLine();
            if (line == null) break;
            Title title = deserializer.deserialize(line);
            result.add(title);

        }

        return result;
    }
}
