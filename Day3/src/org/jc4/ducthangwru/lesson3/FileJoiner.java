package org.jc4.ducthangwru.lesson3;

import java.io.*;

public class FileJoiner {
    public boolean joiner (String listPath) throws IOException {
        String[] path = listPath.split(";");
        File file = new File(path[0].substring(0, path[0].indexOf(".")));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        for(int i = 0; i < path.length; i++) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path[i]));
            byte[] buffer = new byte[path[i].length()];
            while(bufferedInputStream.read(buffer) != -1) {
                bufferedOutputStream.write(buffer);
            }
            bufferedInputStream.close();
        }
        bufferedOutputStream.close();
        return true;
    }
}
