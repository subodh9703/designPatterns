package net.media.training.live.dip;

import net.media.training.live.dip.Encoder.Base64Encoder;
import net.media.training.live.dip.Reader.MyFileReader;
import net.media.training.live.dip.Reader.MyURLReader;
import net.media.training.live.dip.Writer.DatabaseWriter;
import net.media.training.live.dip.Writer.MyFileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule  = new EncodingModule();
        encodingModule.encode(new MyFileReader(strings.INPUT_FILE()),new Base64Encoder(),new MyFileWriter(strings.OUTPUT_FILE()));
        encodingModule.encode(new MyURLReader(new URL(strings.URL_PROTOCOL(), strings.HOST_NAME(), strings.URL_FILE())),new Base64Encoder(),new DatabaseWriter());
    }
}
