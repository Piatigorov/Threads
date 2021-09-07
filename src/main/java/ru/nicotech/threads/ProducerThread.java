package ru.nicotech.threads;

import lombok.Getter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

//Producer thread
public class ProducerThread implements Runnable{

    @Getter private static long start = 0;
    @Getter private static int intProducerTimeout;
    @Getter private static int added = 0;
    @Getter private static volatile boolean producerAlive = true;
    private final ArrayBlockingQueue<Sales> priorityBlockingQueue;

    public ProducerThread(ArrayBlockingQueue<Sales> priorityBlockingQueue) {
        this.priorityBlockingQueue = priorityBlockingQueue;
    }

    @Override
    public void run() {
        String file = "C:\\Users\\Vadim\\Desktop\\2m Sales Records.csv";
        String line = "";

        start = System.currentTimeMillis();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {

                String[] row = line.split(",");
                Sales a = new Sales(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7],
                        row[8], row[9], row[10], row[11], row[12], row[13]);


                if (!(priorityBlockingQueue.offer(a, 1, TimeUnit.MICROSECONDS))) {
                    priorityBlockingQueue.put(a);
                    intProducerTimeout++;
                }
                added++;
            }

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        producerAlive = false;
    }

}
