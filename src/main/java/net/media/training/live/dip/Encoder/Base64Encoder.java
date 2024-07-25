package net.media.training.live.dip.Encoder;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Base64Encoder implements Encoder{
    public List<String> encode(List<String> lines){
        List<String> encodedLines = new ArrayList<>();
        for (String line : lines) {
            String encodedLine = Base64.getEncoder().encodeToString(line.getBytes());
            encodedLines.add(encodedLine);
        }
        return encodedLines;
    }
}
