package net.media.training.live.dip;


import net.media.training.live.dip.Encoder.Encoder;
import net.media.training.live.dip.Reader.MyURLReader;
import net.media.training.live.dip.Reader.Reader;
import net.media.training.live.dip.Writer.Writer;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
    public void encode(Reader reader, Encoder encoder, Writer writer) throws IOException {
        List<String> lines=reader.read();
        lines=encoder.encode(lines);
        writer.write(lines);
    }
}

