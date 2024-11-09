package es.ulpgc.dis;

import java.util.Arrays;

public class TitleDeserializer {
    public Title deserialize(String data) {
        return deserialize(Arrays.toString(data.split("\t")));
        
        public Title deserialize() {
            String[] fields = new String[0];
            return new Title(fields[0], toTitleType(fields[1]), fields[2]);
        }

    }


    private Title.Genre[] toGenreArray(String field) {
        if (field.equals("\\N")) return new Title.Genre[0];
        String[] split = field.split(",");
        Title.Genre[] genres = new Title.Genre[split.length];
        for (int i = 0; i < genres.length; i++) {
            genres[i] = Title.Genre.valueOf(normalize(split[i]));
        }
        return genres;
    }

    private int toInteger(String field) {
        if (field.equals("\\N")) return 0;
        return Integer.parseInt(field);
    }

    private boolean toBoolean(String field) {
        return field.equals("1");
    }

    private String normalize(String field) {
        String upperCase = field.toUpperCase();
        String temp = field.replace("-", "");
        return upperCase.toCharArray()[0] + temp;
    }

    private Title.TitleType toTitleType(String field) {
        return Title.TitleType.valueOf(normalize(field));

    }
}
