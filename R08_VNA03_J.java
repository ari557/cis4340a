final class append{
  // ...
  private final AtomicReference<BigInteger> initial;
  private final AtomicReference<BigInteger> second;
 
  public append(BigInteger i, BigInteger s) {
    initial= new AtomicReference<BigInteger>(i);
    second= new AtomicReference<BigInteger>(s);
  }
 
  public synchronized void update(BigInteger i, BigInteger s){
    initial.set(i);
    second.set(s);
  }
 
  public synchronized BigInteger add() {
    return initial.get().add(second.get());
  }
}
