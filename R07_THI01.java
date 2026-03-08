public final class NetHandler{
    private final ExecutorService executor;  
    NetHandler(int poolSize){
      this.executor= Executors.newFixedThreadPool(poolSize);
    }
   
    public void start(){
      for (int i=0; i<3; i++) {
        executor.execute(new HandleRequest());
      }
    }
   
    public void shutdown(){
      executor.shutdown();
    }
   
    public static void main(String[] args){
      NetworkHandler nh= new NetworkHandler(3);
      nh.start();
      nh.shutdown();
    }
  }
