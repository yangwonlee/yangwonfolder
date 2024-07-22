// document.write('head scriptjs파일');
console.log('num1:', num1);
console.log('num2:', num2);

console.log('로그!!!')

console.log('오류~')

// 1. var는 변수명 중복 가능
var num1 = 1 + 2; //var로 변수 선언 (num은 어떠한 데이터 타입도 가능)
var num2 = '1' + '2';
// String str1= '' -> 자바 케이스. 이는 오류

var num = 2 + 3;
var num = 3 + 4;
console.log('num:', num);

// 2. let은 변수명 중복 불가능.
let str = 2 + 3;
// let str = '2' + '3';
console.log('str:', str);

//var는 hoisting(호이스팅)이 가능
// --호이스팅은 변수선언을 나중에 하더라도 다른 코드들에서 읽을 수 있도록 지원
// var num3 = 10;
console.log('num3:', num3);

//let은 hoisting(호이스팅)이 불가능
let num3 = 10;
// var는 호이스팅이 가능

//const는 상수선언
const num4 = 11;
// num4 = 12;  //error -> num4는 상수로 선언되었기 떄문
console.log('num4:', num4);

let num5 = 11;
num5 = 13;
console('num5:' ,num5);

// ==, === 연산자 비교
// == -> 10 == '10' true
// === -> 10 === '10' false
console.log(typeof(10));
console.log(typeof('10'));

