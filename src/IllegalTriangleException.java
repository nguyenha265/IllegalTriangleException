import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh A ");
        float canhA = scanner.nextFloat();
        System.out.println("nhap canh B");
        float canhB = scanner.nextFloat();
        System.out.println("nhap canh C");
        float canhC = scanner.nextFloat();
        boolean kiemtra = true;
        try {
            if (canhA < 0 || canhB < 0 || canhC < 0 || canhA + canhB < canhC || canhB + canhC < canhA || canhA + canhC < canhB) {
                throw new Exception("dieu kien tam giac sai");


            }
            else {
                System.out.println("day la tam giac");
            }

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}