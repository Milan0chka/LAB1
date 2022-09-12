import java.util.Arrays;
/**
 * Клас який реалізовує об'єкт, що містить ряд фібоначі, та
 * методи для виявлення і виводу чисел, що задовільняють формулу w^2+1, з масиву,
 * а також виводу всього масиву на екран
 * @author Milana Zhuhaievych
 */
public class FibonachiNumbers{
    private long[] numbers;
    FibonachiNumbers(int size){
        if(size == 0){
            System.out.println("Неможливо працювати із 0 числами.");
            System.exit(0);
        }
        numbers = new long[size];
        numbers[0] = 1;
        if (size > 1){
            numbers[1] = 2;
            for(int i =2; i < size; i++)
                numbers[i] = numbers[i-1]+numbers[i-2];
        }
    }

    public void PrintNumbers() {
        System.out.println("Числа Фібоначі, що можна подати у вигляді формули w^2+1 : ");
        System.out.print("[ ");
        for(long number : this.numbers)
            if(isSuitable(number))
                System.out.print(number + " ");
        System.out.print("]");
    }

    public boolean isSuitable(long number){
        double NEWnumber = Math.sqrt(number-1);
        return NEWnumber == Math.round(NEWnumber);
    }

    public void PrintTheArray() {
        System.out.println("Числа Фібоначі, що перевіряються : ");
        System.out.println(Arrays.toString(numbers));
    }
}
