//Class is thread-safe
public final class hitCounts{
    private static int count;
    private static final Object lock= new Object();
    public void increaseCount(){
      synchronized (lock){
        count++;
      }
    }
  }
