public class TheadInterrupt extends Thread  
{    
	static TheadInterrupt thread;
    public void run()  
    {    
        try  
        {    
            Thread.sleep(1000);    
            System.out.println("javatpoint");    
        }catch(InterruptedException e){    
            throw new RuntimeException("Thread interrupted..."+e);  
              
        }    
    }    
    public static void main(String args[])  
    {    
    	thread = new TheadInterrupt();    
    	thread.start();    
        try  
        {    
        	thread.interrupt();    
        }catch(Exception e){System.out.println("Exception handled "+e);}    
        System.out.println("check==="+thread);
    }    
}  