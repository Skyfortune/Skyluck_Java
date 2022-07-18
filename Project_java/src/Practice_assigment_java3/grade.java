package Practice_assigment_java3;

public class grade {
private int math;
private int science;
private int english;

//private는 클래스 내에서만 접근 가능.
grade(int math, int science, int english){
	this.math = math;
	this.science = science;
	this.english = english;
}

public int average() {
	return(math + science + english) /3;
}

}


