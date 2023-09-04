public class Main {
    public static void main(String[] args) {
        int a = 52;
        boolean prime = false;
        if (a > 0)
            if(a % a == 0 && a%1 == 0)
                if (a > 3)
                    if(a % 2 != 0 && a % 3 != 0)
                        prime = true;

        else if (a > 0 && a<=3)
            prime = true;
        System.out.println(prime);
    }
}