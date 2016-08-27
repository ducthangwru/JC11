package org.jc4.ducthangwru.lesson2;

import java.io.*;

public class FileSplitter {
    public boolean splitter(String path, int numberOfFile) throws IOException {
        File file = new File(path);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));

        long size = file.length();

        byte[] buffer = new byte[(int) size / numberOfFile];

        int i = 1;
        while(bufferedInputStream.read(buffer) != -1 && i <= numberOfFile) {
            File newFile = new File(file.getParent(), file.getName() + i++);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFile));
            bufferedOutputStream.write(buffer);
            bufferedOutputStream.close();
        }

        bufferedInputStream.close();
        return true;
    }
}
