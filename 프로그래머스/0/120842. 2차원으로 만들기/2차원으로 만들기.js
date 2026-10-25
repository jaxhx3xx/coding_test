function solution(num_list, n) {
    var answer = [];
    let k=0;
    for(let i=0; i<num_list.length/n; i++){
        answer[i] = [];
        for(let j=0; j<n; j++){
            answer[i][j] = num_list[k];
            k++;
        }
    }
    return answer;
}