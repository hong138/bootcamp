
public class DemoMathOperation {

    public static void main(String[] args) {
        int x = 10 + 3;
        System.out.println(x); //13

        x = x + 3 - 9;
        System.out.println(x); //7

        x = x - 5 * 2;
        System.out.println(x); //-3

        x = (x - 1) / 2;
        System.out.println(x); //-2

        // Speical operator -> %
        int remainder = 5 % 2;
        System.out.println(remainder); //1

        int remainder2 = 10 % 2;
        System.out.println(remainder2); //0

        System.out.println(0 / 10); //0
        // System.out.println(10 / 0);
        // as developer, you should avoid divided by zero

        int j = 2;
        System.out.println(10 / j); // 5
        // you should avoid j become 0, before you decided "10/j"

        // double
        // +, -, *, /, %
        // / zero
        double c = 1.5 + 9.5 - (8.5 * 9.5 / 6.5) % 4;
        System.out.println(c);

        double d1 = 10.6 / 0;
        System.out.println(d1); // Infinity

        //  + 1 operations
        int a = 1;
        a = a + 1;
        a++;
        ++a;
        a += 1; // equals to " a = a + 1"
        System.out.println(a); // 5

        //  + 2 opeartions
        int b = 1;
        b = b + 3;
        b += 3;
        System.out.println(b); // 7

        //  - 1 operations
        int d = -1;
        d = d - 1;
        d--;
        --d;
        d -= 1;
        System.out.println(d); // -5

        //  * 2 opeartions
        int e = 1;
        e = e * 3;
        e *= 3;
        System.out.println(e); // 9

        //  / 2 opeartions
        int f = 20;
        f = f / 2;
        f /= 2;
        System.out.println(f); // 5

        //  Example 1
        int apples = 3;
        int oranges = 10;

        double pricePerApple = 3.3;
        double pricePerOrange = 5.5;

        // code
        double total = (apples * pricePerApple) + (oranges * pricePerOrange);
        System.out.println(total);

        // Example 2
        int maths = 90;
        int english = 78;
        int history = 62;

        double averageScore = (maths + english + history) / 3.0;
        System.out.println(averageScore); // 76
        // (int + int + int) / int
        // int / int -> int
        // 230 / 3 -> 76.666

        // 3 is int value while 3.0 is double value
        // ++x, x++, --x, x--
        int k = 0;
        int o = k++ + 3;
        // 1. k + 3 
        // 2. Assignment (assign to o)
        // 3. k + 1
        System.out.println(o); //3
        System.out.println(k); //1

        int u = 0;
        int g = ++u + 3;
        // 1. u + 1
        // 2. u + 3
        // 3. Assignment (assign to g)
        System.out.println(g); //4
        System.out.println(u); //1

        // Practice x-- and --x
        int p = 0;
        int q = p-- - 3;
        System.out.println(p); //-1
        System.out.println(q); //-3

        int p1 = 0;
        int q1 = --p1 - 3;
        System.out.println(p1); //-1
        System.out.println(q1); //-4
    }
}
