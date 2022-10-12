package net.yury.P04Builder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder builder = new ProcessBuilder();
        var process = builder
                .command("cmd.exe", "/c", "ping -n 10 www.baidu.com")
                .directory(new File("D:/java/DesignPattern"))
                .redirectOutput(new File("D:\\java\\DesignPattern\\nohup.out"))
                .start();
        System.out.println(process.pid());
        process.waitFor();
        System.out.println(process.exitValue());
        System.out.println("finish");
    }

    public final static class Main2 {
        public static void main(String[] args) {
            fibonancci(50);
        }

        public static void fibonancci(int n) {
            List<Long> list = new ArrayList<>(n);
            if (n >= 1) {
                list.add(0L);
            }
            if (n >= 2) {
                list.add(1L);
            }
            if (n >= 3) {
                long last1 = list.get(1);
                long last2 = list.get(0);
                for (int i = 2; i < n; i++) {
                    long v = last1 + last2;
                    last2 = last1;
                    last1 = v;
                    list.add(v);
                }
            }
            System.out.println(list.toString());
        }
    }
}

