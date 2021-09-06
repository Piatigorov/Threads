import java.io.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {
    public static int added = 0;
    public static int polled = 0;
    public static volatile boolean producerAlive = true;


    public static void main(String[] args) {
        ArrayBlockingQueue<Sales> priorityBlockingQueue = new ArrayBlockingQueue<>(1000);

        //Producer thread
        Thread ProducerThread = new Thread(() ->
        {
            String file = "src\\50000 Sales Records.csv";
            String line = "";

            try (BufferedReader reader = new BufferedReader(new FileReader(file)))
            {

                while ((line = reader.readLine()) != null){

                    String[] row = line.split(",");
                    Sales a = new Sales(row[0],row[1],row[2],row[3],row[4],row[5],row[6],row[7],
                            row[8],row[9],row[10],row[11],row[12],row[13]);

                    priorityBlockingQueue.put(a);
                    added++;

                }

            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }

            producerAlive = false;

        });

        //Consumer thread
        Thread ConsumerThread = new Thread(() ->
        {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\test.csv")))
            {
                while (producerAlive || !priorityBlockingQueue.isEmpty())
                {

                    Sales poll = priorityBlockingQueue.take();
                    writer.write(poll.toString());
                    polled++;
                    System.out.println("Polled : " + poll + " add№ " + added + " poll№ " + polled);

                }

            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        });

        ProducerThread.start();
        ConsumerThread.start();

    }
}
