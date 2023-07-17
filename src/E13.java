public class E13 {
    private int result;

    public E13(){
        result = 1;
    }

    public int seriesMultiplication(int highestNumber){
        for(int loop = 1;loop<=highestNumber;loop++){
            result = result * loop;
        }
        return result;
    }
}
