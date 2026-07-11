function solution(num_list) {
    var answer = -1;
    var count=0;
    for(let x of num_list){
        if(x<0) {
            answer = count;
            break;
        }
        count++;
    }
    return answer;
}