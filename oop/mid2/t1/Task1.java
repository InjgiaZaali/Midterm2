package oop.mid2.t1;

import java.util.ArrayList;
import java.util.List;

/**
 * Task1 - List Manipulation Program
 * This comprehensive Java program demonstrates advanced list manipulation techniques
 * by transforming integer values into corresponding string values using a mathematical
 * formula, followed by systematic element deletion.
 *
 * <h2>Program Overview:</h2>
 * The program operates on two predefined lists:
 * <ul>
 *   <li>list1: Contains integer values [7, 9, 7, 5, 6, 8, 6, 8, 5, 3, 5, 9, 3]</li>
 *   <li>list2: Contains string values for transformation lookup</li>
 * </ul>
 *
 * <h2>Algorithm Steps:</h2>
 * <ol>
 *   <li><b>Data Initialization:</b> Creates and populates two lists with predefined values</li>
 *   <li><b>Formula Application:</b> Transforms integers using formula: index = value × 2 - 1</li>
 *   <li><b>Result Generation:</b> Maps transformed indices to corresponding strings</li>
 *   <li><b>Element Deletion:</b> Removes ceil(originalSize/2.0) elements using fixed indexing</li>
 * </ol>
 *
 * <h2>Key Features:</h2>
 * <ul>
 *   <li>Robust error handling for out-of-bounds indices</li>
 *   <li>Detailed step-by-step output for transformation tracking</li>
 *   <li>Systematic element removal with mathematical calculation</li>
 *   <li>Generic list printing utility method</li>
 * </ul>
 *
 * <h2>Deletion Strategy:</h2>
 * The program removes elements using a critical deletion pattern where it removes
 * elements at fixed positions (0, 1, 2, ...) but the list shrinks after each removal,
 * creating a specific deletion pattern rather than removing consecutive elements.
 *
 * @author Zaali injgia
 */

public class Task1 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(9);
        list1.add(7);
        list1.add(5);
        list1.add(6);
        list1.add(8);
        list1.add(6);
        list1.add(8);
        list1.add(5);
        list1.add(3);
        list1.add(5);
        list1.add(9);
        list1.add(3);


        List<String> list2 = new ArrayList<>();
        list2.add("CzD");
        list2.add("zSz34");
        list2.add("MTF6");
        list2.add("Th14Q");
        list2.add("1nY");
        list2.add("HQC");
        list2.add("NqckV");
        list2.add("YEC1");
        list2.add("WsR");
        list2.add("jgtQ");
        list2.add("P8r");
        list2.add("fd00");
        list2.add("eYR5");
        list2.add("VlITy");
        list2.add("pqi");
        list2.add("FWS");
        list2.add("oE7");
        list2.add("tU1a");

        System.out.println("Initial List1 (integers):");
        System.out.println(list1);

        System.out.println("\nInitial List2 (strings):");
        System.out.println(list2);

        List<String> resultList = applyFormula(list1, list2);

        System.out.println("\nApplying formula and showing results based on original List1:");
        for (int i = 0; i < list1.size(); i++) {
            int value = list1.get(i);
            int index = value * 2 - 1;
            String result = resultList.get(i);
            System.out.printf("Position %d: Value %d → Index %d → String \"%s\"%n",
                    i, value, index, result);
        }
        System.out.println("\nResult List after using formula:");
        System.out.println(resultList);

        System.out.println("\nResults after deleting numbers:");

        int initialList1Size = list1.size();
        int numberOfElementsToRemove = (int) Math.ceil(initialList1Size / 2.0);

        for (int i = 0; i < numberOfElementsToRemove; i++) {
            list1.remove(i);
            resultList.remove(i);}
        System.out.println(resultList);
    }
    public static List<String> applyFormula(List<Integer> list1, List<String> list2) {
        List<String> result = new ArrayList<>();

        for (Integer value : list1) {
            int index = value * 2 - 1;
            try {
                if (index >= 0 && index < list2.size()) {
                    result.add(list2.get(index));
                } else {
                    result.add("Index " + index + " out of bounds");
                }
            } catch (IndexOutOfBoundsException e) {
                result.add("Index " + index + " out of bounds");
            }
        }

        return result;
    }
}
