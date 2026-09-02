function solution(myString) {
    var answer = "";
    for(let x of myString){
        if(x <'l')  answer+="l";
        else answer+= x;
    }
    return answer;
}