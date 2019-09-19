package Tutorial2.java;

import java.util.Random;

public class Tutorial2 {

	public static void main(String[] args) {
	
	// TODO Auto-generated method stub

	Random wuerfel =new Random();
	int wert1;
	for (int i=0;i<1;i++) {
		wert1 = 1+ wuerfel.nextInt(6);
	switch(wert1) {
	case 1:{
	System.out.println("wow");
	break;}
	case 2:{
		System.out.println("besser");
		break;}
	case 3:{
		System.out.println("noch besser");
		break;}
	case 4:{
		System.out.println("nicht schlecht");
		break;}
	case 5:{
		System.out.println("krass");
		break;}
	default:{
		System.out.println("boss");
	}
	}
	}
	}
}

	


 



	


 