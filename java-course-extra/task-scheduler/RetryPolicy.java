public class RetryPolicy
{
    int id;
    int waitTime = 0;
    int retryOrNot = 0;

    public RetryPolicy(int id, int waitTime)
    {
        this.id = id;
        if(waitTime!=0)
        {
            this.waitTime = waitTime;
            this.retryOrNot = 1;
        }
    }
    
}
