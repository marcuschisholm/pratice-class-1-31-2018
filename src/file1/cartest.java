package file1;

public class cartest {
	public static void main(String []args){
		car car=new car ("toyta",1500,1992);
		System.out.println(car.carbrand);
		car cars =new car("nissan",1800,2000);
		System.out.println(cars.carbrand);
		cars.carbrand="ford";
	}

}
