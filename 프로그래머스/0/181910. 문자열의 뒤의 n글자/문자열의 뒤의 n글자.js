function solution(my_string, n) {
    var answer = '';
    var a = my_string.length-n;
    answer+= my_string.slice(a);
    return answer;
}