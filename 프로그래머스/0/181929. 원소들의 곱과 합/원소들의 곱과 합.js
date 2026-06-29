function solution(num_list) {
    var answer = 0;
    let mul =1; 
    let pow = 0;
    for(let x of num_list){
        mul *=x;
        pow+= x;
    }
    if(mul <pow**2){
        answer = 1;
    }else answer=0;
    return answer;
}