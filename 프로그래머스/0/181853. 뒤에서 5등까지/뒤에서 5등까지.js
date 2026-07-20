function solution(num_list) {
    var answer = [];
    var arr = num_list.sort((a,b)=>{
        return a-b;
    });
    for(let i=0; i<5; i++){
        answer[i] = arr[i];
    }
    return answer;
}