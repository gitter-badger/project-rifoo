package org.roman.rifoo.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Downloader {

    public static InputStream readStream(URL url) throws IOException {
        return url.openConnection().getInputStream();
    }

    public static byte[] readBytes(URL url) throws IOException {
        InputStream is = readStream(url);
        List<Byte> bytes = new ArrayList<>();
        int c;
        while ((c = is.read()) != -1) {
            bytes.add((byte)c);
        }
        Byte[] data = bytes.toArray(new Byte[0]);
        byte[] ret = new byte[data.length];
        for (int i = 0; i < ret.length; i++) ret[i]=data[i];
        return ret;
    }

    public static String readString(URL url) throws IOException {
        return new String(readBytes(url));
    }
}
