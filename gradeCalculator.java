//Nick Henderson
//10-26-18
//gradeCalculator.java
import java.util.*;
import java.text.DecimalFormat;

class gradeCalculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double currGrade, desiredPercent, percentOfFinal;



		System.out.println("Please input your current grade (%) in the class: ");
		if(sc.hasNextDouble()){
			currGrade = sc.nextDouble();
			if(currGrade<1){
				System.out.println("Please enter a value between 1-100");
				sc.next();
				if(sc.hasNextDouble()){
					currGrade = sc.nextDouble();
				}
			}
		}else{
			System.out.println("You have entered a non numerical field value");
			while(true){
				sc.next();
				System.out.println("Please input your current grade, as a number, in the class: ");
				if(sc.hasNextDouble()){
					currGrade = sc.nextDouble();
					break;
				}else{
					System.out.println("You have entered a non numerical field value");
				}
			} 
		}
		System.out.println("Please input the percent that you would like in the class: ");	
		if(sc.hasNextDouble()){
			desiredPercent = sc.nextDouble();
		}else{
			System.out.println("You have entered a non numerical field value");
			while(true){
				sc.next();
				System.out.println("Please input the percent that you would like in the class: ");
				if(sc.hasNextDouble()){
					desiredPercent = sc.nextDouble();
					break;
				}else{
					System.out.println("You have entered a non numerical field value");
					continue;
				}
			} 
		}

		System.out.println("Please input how much percentage (1-100) your final is worth from your overall grade: ");
		if(sc.hasNextDouble()){
			percentOfFinal = sc.nextDouble();
		}else{
			System.out.println("You have entered a non numerical field value");
			while(true){
				sc.next();
				System.out.println("Please input the percent that you would like in the class: ");
				if(sc.hasNextDouble()){
					percentOfFinal = sc.nextDouble();
					break;
				}else{
					System.out.println("You have entered a non numerical field value");
					continue;
				}
			} 
		}
		
	
		double totalGrade = 1.0;
		currGrade = currGrade/100;
		desiredPercent = desiredPercent/100;
		percentOfFinal = percentOfFinal/100;
		double result = 0;

		double p = totalGrade - percentOfFinal;
		p = p*currGrade;
		p = desiredPercent - p;
		result = p/percentOfFinal;
		result = result*(100);
		desiredPercent = desiredPercent*(100);
		DecimalFormat df = new DecimalFormat("0.00");
		result = Double.valueOf(df.format(result));

		System.out.println("You will need at least a " + result + "% on your final to get a " + desiredPercent + "% overall. Good Luck!");
	}

}
