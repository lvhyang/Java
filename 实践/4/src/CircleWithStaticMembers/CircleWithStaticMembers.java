package CircleWithStaticMembers;

public class CircleWithStaticMembers {
	double radius;
	// TODO Auto-generated method stub
	/** The number of objects created*/
	static int numberOfObjects = 0;
	/** Construct a circle with radius 1*/
	CircleWithStaticMembers(){
		radius = 1;
		numberOfObjects++;
	}
	/** Construct a circle with a specified radius*/
	CircleWithStaticMembers(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}
	/** Return numberofobjects*/
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	/** Return the area of this circle*/
	double getArea(){
		return radius * radius* Math. PI;
	}

}
