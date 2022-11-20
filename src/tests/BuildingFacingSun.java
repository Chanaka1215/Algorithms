package tests;

import common.AlgorithmType;
import common.BaseTestRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuildingFacingSun extends BaseTestRunner {
    @Override
    public void run() {
        printDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input building heights as unique..");
        String array = scanner.nextLine();
        String[] buildingsHeight = array.trim().split(" ");
        List<Integer> sum = new ArrayList<>();
        int heightMax = Integer.parseInt(buildingsHeight[0]);
        sum.add(Integer.parseInt(buildingsHeight[0]));

        for (int i = 1; i < buildingsHeight.length; i++) {
            int building = Integer.parseInt(buildingsHeight[i]);
            if (building > heightMax) {
                sum.add(building);
            }
        }

        sum.forEach(s -> System.out.println(s + " "));

    }

    @Override
    public AlgorithmType getId() {
        return AlgorithmType.BUILDING_FACING_SUN;
    }
}
