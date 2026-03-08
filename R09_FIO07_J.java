public class Exeception{
  public static void main(String args[])
                          throws IOException, InterruptedException{
    ProcessBuilder pb= new ProcessBuilder("notemaker");
    pb= pb.redirectErrorStream(true);
    Process proc= pb.start();
    InputStream is= proc.getInputStream();
    int c;
    while ((c=is.read()) != -1){
      System.out.print((char) c);
    }
    int exitVal = proc.waitFor();
  }
}
