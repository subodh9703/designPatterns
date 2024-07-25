package net.media.training.live.dip.Reader;

import java.io.IOException;
import java.util.List;

public interface Reader {

    List<String> read() throws IOException;
}
