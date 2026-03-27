class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price>=100000 && price<300000){
            price -= price*((double)5/100);
        }
        else if(price>=300000 && price<500000){
            price -= price*((double)10/100);
        }
        else if(price>=500000){
            price -= price*((double)20/100);
        }
        return price;
    }
}