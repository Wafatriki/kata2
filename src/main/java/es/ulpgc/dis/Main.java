package es.ulpgc.dis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./title.basics.tsv"));
            reader.readLine();
            HashMap<String, Integer> histogram = new HashMap<>();
            while(true) {
                String line = reader.readLine();
                if (line == null) break;
                String[] tokens = line.split("\t");
                histogram.putIfAbsent(tokens[1], 0);
                histogram.compute(tokens[1], (k, v) -> v + 1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
