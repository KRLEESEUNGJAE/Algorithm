function solution(nums) {
    let answer = 0;
    let maxNumb = 0;
    let maxType = 0;
    
    maxNumb = nums.length / 2;
    console.log(maxNumb);
    
    const set = new Set(nums);
    const uniqueArr = [...set];
    
    maxType = uniqueArr.length;
    console.log(maxType);
    
    if(maxType > maxNumb){
        answer = maxNumb;
    }else{
        answer = maxType;
    }
    
    return answer;
}