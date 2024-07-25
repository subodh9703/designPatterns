package net.media.training.live.dip.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MyURLReader implements Reader{
    private final URL url;

    public MyURLReader(URL url){
        this.url=url;
    }
    public List<String> read() throws MalformedURLException {
        List<String> lines = new ArrayList<>();
        try (InputStream in = url.openStream();
             InputStreamReader reader = new InputStreamReader(in);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
