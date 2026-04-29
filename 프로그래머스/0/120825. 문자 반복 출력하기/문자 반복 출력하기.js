function solution(my_string, n) {
    var answer = '';
    let arr = []
    arr = my_string.split("");
    for(let i=0; i<arr.length; i++){
        for(let j=0; j<n; j++){
          answer+= arr[i];
        }
    }
    return answer;
}