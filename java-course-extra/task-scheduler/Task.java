class Task
{
    int ID;
    String NAME;
    int BURST_TIME;
    int ARRIVAL_TIME;
    int WAIT_TIME;
    enum STATUS{
        READY,
        WAITING,
        SUCCESS,
        FAILURE,
        TERMINATED
    }
    RetryPolicy retryPolicy;

    public Task(int ID, String NAME, int BURST_TIME, int ARRIVAL_TIME, int WAIT_TIME){
        this.ID = ID;
        this.NAME = NAME;
        this.BURST_TIME = BURST_TIME;
        this.ARRIVAL_TIME = ARRIVAL_TIME;
        this.WAIT_TIME = WAIT_TIME;
        retryPolicy = new RetryPolicy(ID, WAIT_TIME);
    }
}
