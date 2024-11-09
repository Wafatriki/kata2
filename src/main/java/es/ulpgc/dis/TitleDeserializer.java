package es.ulpgc.dis;

public class TitleDeserializer {
    public Title deserialize(String data) {
        return deserialize(data.split("\t"))

    }
}
