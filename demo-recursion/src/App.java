public class App {
    public static void main(String[] args) throws Exception {
    // 1 + 2 + 3 + 4 + 5
    int sum = 0;
    for (int i = 1; i <= 5; i++) {
        sum += i;
    }
    System.out.println(sum);

    // recursion

    System.out.println(sumToFive(20));

    System.out.println(sumEvenNumber(10)); // 30
    System.out.println(sumEvenNumber(100)); // 2550
    System.out.println(sumEvenNumber(11)); // 11

    System.out.println(sequence(8)); // 13
    System.out.println(sequence(10)); // 34

    // Advantanges of Recursion
    // 1. Better Space Complexity

    // Typical Scenario that we need Recursion
    // 1. DFS (Depth First Search)
}

    public static int sumToFive(int x){
        if (x >= 5) // base case
            return x;
        return x + sumToFive(x + 1);// never end
    }
    // 1. 1 + sumToFive(2), this is waiting the result of sumToFive
    // 2. 2 + sumToFive(3)
    // 3. 3 + sumToFive(4)
    // 4. 4 + sumToFive(5)
    // 5. 5 
    // 6. 4 + 5
    // 7. 3 + 9
    // 8. 2 + 12
    // 9. 1 + 14
    // 10. return 15

    // 10 + 8 + 6 + 4 + 2
    // 100 + 98 + 96 ...
    public static int sumEvenNumber(int head){
        if (head % 2 == 0 && head > 0)
            return head + sumEvenNumber(head - 2);
        return head;
    }
    // 1. 10 + sumEvenNumber(8)
    // 2. 8 + sumEvenNumber(6)
    // 3. 6 + sumEvenNumber(4)
    // 4. 4 + sumEvenNumber(2)
    // 5. 2 
    // 6. 4 + 2
    // 7. 6 + 6
    // 8. 8 + 12
    // 9. 10 + 20
    // 10. 30
    

    // 0 1 1 2 3 5 8 13 21 34 ...
    // sequence(6) -> 5
    public static int sequence(int numberOfElement){
        if (numberOfElement == 1)
            return 0;
        if (numberOfElement == 2)
            return 1;
        return sequence(numberOfElement - 1) + sequence(numberOfElement - 2);
    }

    // sequence(1) -> 0
    // sequence(2) -> 1
    // sequence(3) -> 1
    // sequence(4) -> 2
    // sequence(5) -> 3
}
