/**
 * 
 */
package codechallengesandp.datastructurealgorithm.Thread.sysc;

/**
 * @author SGaikwad
 *
 */
public class Producer implements Runnable
{
    MainThread main = null;

    Integer capacity = 1;

    public Producer(MainThread main)
    {
        this.main = main;
    }

    @Override
    public void run()
    {
        try
        {
            produce();
        }
        catch (InterruptedException e)
        {

        }
    }

    private void produce() throws InterruptedException
    {
        System.out.println("Producer Running");
        int var = 0;

        while (true)
        {

            synchronized (main)
            {
                while (main.getList().size() == capacity)
                {
                    System.out.println("Produder capacity is full " + capacity);
                    main.wait();
                }

                int e = var++;
                System.out.println("Producer Produced " + e);
                main.getList().add(e);
                main.notify();
                Thread.sleep(3000);

            }
        }

    }

}
