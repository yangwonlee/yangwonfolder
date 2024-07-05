package sec04;

public class RectangleCalculator {
	// 정사각형의 넓이.
	double areaRectangle(double width) {//실수타입 너비를 실수타입 사각형면적 함수에 대입.
		return width * width; // 너비제곱을 반환하라. =너비 제곱은 정사각형 면적.
	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) { //실수타입 너비와 높이를
		// 실수타입 사각형 면적 함수에 대입하라..
		return width * height; // 너비곱하기 높이의 값을 반환하라.
	}
}
