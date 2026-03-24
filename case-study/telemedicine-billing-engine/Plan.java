abstract public class Plan {
    private String patientName;
    private int baseFee;

    public int getBaseFee(){
        return baseFee;
    }

    public void setBaseFee(int baseFee){
        this.baseFee = baseFee;
    }

    public String getPatientName(){
        return patientName;
    }

    public void setPatientName(String patientName){
        this.patientName = patientName;
    }

    abstract public void calculateBill();
}
