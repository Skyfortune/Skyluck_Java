package Practice_assigment_java3;

public class TV {
String name;
int date;
int inch;

TV(String name, int date, int inch){
	this.name = name;
	this.date = date;
	this.inch = inch;
}
public void show() {
	System.out.println(name + "에서 만든" + date +"년형"+ inch +"인치 TV" );
}



}
