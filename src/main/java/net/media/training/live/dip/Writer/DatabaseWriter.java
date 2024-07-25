package net.media.training.live.dip.Writer;

import net.media.training.live.dip.MyDatabase;

import java.util.List;

public class DatabaseWriter implements Writer{
    public void write(List<String> lines){
        MyDatabase database = new MyDatabase();
        for (String line : lines) {
            database.write(line);
        }
    }
}
