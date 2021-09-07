package ru.nicotech.threads;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayBlockingQueueExample {

    public static long finish = 0;

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Sales> priorityBlockingQueue = new ArrayBlockingQueue<>(1000);

        ProducerThread producerThread = new ProducerThread(priorityBlockingQueue);
        ConsumerThread consumerThread = new ConsumerThread(priorityBlockingQueue, producerThread);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(producerThread);
        executorService.submit(consumerThread);

        while(consumerThread.isConsumerThreadAlive()){
            Thread.sleep(10);
        }

        executorService.shutdown();

        finish = System.currentTimeMillis();
        long elapsed = finish - ProducerThread.getStart();
        System.out.println("Прошло времени, мс: " + elapsed);
        System.out.println("Объектов добавлено в очередь: " + ProducerThread.getAdded());
        System.out.println("Объектов взято из очереди: " + ConsumerThread.getPolled());
        System.out.println("Суммарная задержка на чтение из файла / запись в очередь, мкс: " + ProducerThread.getIntProducerTimeout());
        System.out.println("Суммарная задержка на запись в файл / чтение из очереди, мкс: " + ConsumerThread.getIntConsumerTimeout());
    }
}
