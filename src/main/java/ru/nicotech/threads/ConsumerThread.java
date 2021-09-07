package ru.nicotech.threads;

import lombok.Getter;
import java.io.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

//Consumer thread
public class ConsumerThread implements Runnable{

    @Getter private static int intConsumerTimeout;
    @Getter private static int polled = 0;
    @Getter private volatile boolean consumerThreadAlive = true;
    private final ArrayBlockingQueue<Sales> priorityBlockingQueue;

    public ConsumerThread(ArrayBlockingQueue<Sales> priorityBlockingQueue, ProducerThread producerThread) {
        this.priorityBlockingQueue = priorityBlockingQueue;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\main\\java\\test.csv"))) {
            while (ProducerThread.isProducerAlive() || !priorityBlockingQueue.isEmpty()) {

                Sales poll = priorityBlockingQueue.poll(1, TimeUnit.MICROSECONDS);
                if (poll != null) {
                    writer.write(poll.toString());
                    polled++;
                } else {
                    intConsumerTimeout++;
                }
            }

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        consumerThreadAlive = false;
    }
}
