import java.util.Scanner;
/**
 * ХУй
 * @author Milana Zhuhaievych
 */
public class Main {
    public static void main(String[] args) {
        if(args.length==0) {
            Scanner ScannerInputSize = new Scanner(System.in);
            System.out.print("Уведіть к-сть елементів : ");
            int size = ScannerInputSize.nextInt();

            FibonachiNumbers numbers= new FibonachiNumbers(size);
            numbers.PrintTheArray();
            numbers.PrintNumbers();
        }
        else{
            FibonachiNumbers numbers= new FibonachiNumbers(Integer.parseInt(args[0]));
            numbers.PrintTheArray();
            numbers.PrintNumbers();
        }
    }
}