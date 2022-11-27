package tests;

import common.AlgorithmType;
import common.BaseTestRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindLeadersInArray extends BaseTestRunner {
    @Override
    public void run() {
        printDetails();
        System.out.println("Please input array...");
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String[] items = input.strip().split(" ");
        int n = items.length;
        List<Integer> leaders = new ArrayList<>();
        int rightMost = Integer.parseInt(items[n-1]);
        leaders.add(rightMost);

        for (int i = n -2; i >= 0; i--){
            System.out.println("executing " + items[i]);
            int n1 = Integer.parseInt(items[i]);
            if(n1 > rightMost){
                rightMost = n1;
                leaders.add(rightMost);
            }
        }

        leaders.stream().forEach(s -> System.out.print(s + " "));

    }

    @Override
    public AlgorithmType getId() {
        return AlgorithmType.FIND_LEADERS;
    }
}
