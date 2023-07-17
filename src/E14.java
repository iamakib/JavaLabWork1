public class E14 {
    private float initialBalance,interest;


    public E14(){
        initialBalance = 1000;
        interest = 0.05f;
    }
    public float finalBalance(){
        float finalBalance;
        finalBalance = 1000;
        for(int i=0;i<3;i++){
           finalBalance = finalBalance + (initialBalance*interest);
        }
        return finalBalance;
    }
}
