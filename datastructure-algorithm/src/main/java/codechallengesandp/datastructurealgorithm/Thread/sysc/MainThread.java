/**
 * 
 */
package codechallengesandp.datastructurealgorithm.Thread.sysc;

import java.util.LinkedList;

/**
 * @author SGaikwad
 *
 */
public class MainThread
{
    LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args)
    {
        MainThread main = new MainThread();
        Thread t1 = new Thread(new Producer(main));
        Thread t2 = new Thread(new Consumer(main));
        
        t1.start();
        t2.start();
    }

    public LinkedList<Integer> getList()
    {
        return list;
    }

    public void setList(LinkedList<Integer> list)
    {
        this.list = list;
    }

}
