import java.util.*;

public class Calculate_ClassGradeAverage {

    public static void main(String[] args) {

        int physics,chemistry,turkish,history,music,average;

        Scanner Input = new Scanner(System.in);

        System.out.print("Please enter your Physics grade : ");
        physics = Input.nextInt();
        System.out.print("Please enter your Chemistry grade : ");
        chemistry = Input.nextInt();
        System.out.print("Please enter your Turkish grade : ");
        turkish = Input.nextInt();
        System.out.print("Please enter your History grade : ");
        history = Input.nextInt();
        System.out.print("Please enter your Music grade : ");
        music = Input.nextInt();

        average = (physics+chemistry+turkish+history+music)/5;

        System.out.print(average>=60?"Your average is : "+average+" Passed":"Your average is : "+average+" Failed");



    }
}