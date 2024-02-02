import java.util.Scanner;
public class GradeCalc {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		int numStudents=sc.nextInt();
		int[]grades=new int[numStudents];
		for(int i=0;i<numStudents;i++)
		{
			System.out.println("Enter grade for student"+(i+1+":"));
			grades[i]=sc.nextInt();
		}
		int sum=0;
		int highest=grades[0];
		int lowest=grades[0];
		for(int grade:grades)
		{
			sum += grade;
			if(grade>highest)
			{
				highest=grade;
			}
			if(grade<lowest)
			{
				lowest=grade;
			}
		}
		
		double average=(double)sum/numStudents;
		System.out.println("\nResults:");
		System.out.println("Average Score:"+average);
		System.out.println("Highest Score:"+highest);
		System.out.println("Lowest Score:"+lowest);
		
		sc.close();

	}

}
