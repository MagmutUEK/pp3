public class Counter
{
    int value = 0;
    
    void increase(){
        value += 1;
    }
    
    void decrease(){
        value -= 1;
    }
    
    void bigIncrease(){
        value += 10;
    }
    
    void bigDecrease(){
        value -= 10;
    }
    
    void reset(){
        value = 0;
    }
}
