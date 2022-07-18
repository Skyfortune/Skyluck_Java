package Practice_assigment_java3;

public class Rectangle {
int x;
int y;
int width;
int height;
//int x,y; 이렇게 써도 된다.

Rectangle(int x, int y, int width, int height) {
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	
}

public void show2() {
	System.out.println
	("(" + x + ","+ y +")에서 크기가"+width+"x"+height+"인 사각형");
}

public int square() {
	return(width*height);
}
boolean contains(Rectangle r) {
	if(x < r.x && y < r.y)
        if((width+x) > (r.x+r.width) && (height+y) > (r.y+r.height))
           return true;
     return false;
}
}
