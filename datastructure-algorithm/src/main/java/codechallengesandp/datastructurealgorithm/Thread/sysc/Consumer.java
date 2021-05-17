package codechallengesandp.datastructurealgorithm.Thread.sysc;

public class Consumer implements Runnable
{

    MainThread main = null;

    public Consumer(MainThread main)
    {
        this.main = main;
    }

    @Override
    public void run()
    {
        try
        {
            consume();
        }
        catch (InterruptedException e)
        {
        }
    }

    public void consume() throws InterruptedException
    {
        System.out.println("Consumer Running");
        while (true)
        {
            synchronized (main)
            {

                while (main.getList().size() == 0)
                {
                    System.out.println("Consumer is waiting Size is 0");
                    main.wait();
                }
                int var = main.getList().removeFirst();
                System.out.println("Consumer Consumeed" + var);
                main.notify();
                Thread.sleep(3000);
            }

        }

    }

}
