package hk.edu.polyu.comp.comp2021.assignment1;
public class SpecialNumber {
	public static boolean isSpecial(int num) {
		// Task 3: Return true if and only if 'num' is special
		int a = 2;// be the div number
		int b = 0;// be the number count 2,3,4,5
		num = 2*num;
		int c = num/4;
		int d = 0;
		if (num <= 0) {
			return false;
		}
		while (num > 1) {
			if(a > c){
				break;
			}
			if (num % a == 0) {
				while (num % a == 0) {
					num = num / a;
				}
				b++;
				}
			a++;
			}
		int e = b;
		d = e;
		if (d != 3)
		{return false;}
		if( d==3 ){return true;}

		return false;
	}
}

