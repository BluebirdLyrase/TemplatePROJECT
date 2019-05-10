public class calRound{
    private int size;
    private int volume;

    public int roundCount(int volume,int size){
        this.size=size;
        this.volume=volume;
        int round = this.size-this.volume;
        if(round<0){ 
            round=round*(-1);
        }
        return round; 
    }

}