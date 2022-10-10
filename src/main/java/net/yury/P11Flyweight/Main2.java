package net.yury.P11Flyweight;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Main2 {

    private static class DateUtil {
        private static final ThreadLocal<SimpleDateFormat> local = new ThreadLocal<>();
        private static final String FORMAT = "yyyy-MM-dd";

        public static String format(Date date) {
            SimpleDateFormat formatter = local.get();
            if (formatter == null) {
                formatter = new SimpleDateFormat(FORMAT);
                local.set(formatter);
            }
            return formatter.format(date);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> list = new ArrayList<>(20);
        CountDownLatch count = new CountDownLatch(20);
        for (int i = 0; i < 20; i++) {
            list.add(new Thread(() -> {
                for (int j = 0; j < 20; j++) {
                    System.out.println(DateUtil.format(new Date(System.currentTimeMillis())));
                }
                count.countDown();
            }));
        }
        for (int i = 0; i < 20; i++) {
            list.get(i).start();
        }
        count.await();
        System.out.println("finish");
    }
}


