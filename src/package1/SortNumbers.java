package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortNumbers {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    Random r = new Random();

    for (int i = 0; i < 20; i++) {
      numbers.add(r.nextInt(100));
    }
    //System.out.println(numbers);
    // Collections.sort(numbers);
    // System.out.println(numbers);

    int velocity1 = 0;
    for (int i = 0; i < numbers.size(); i++) {
      for (int j = 0; j < numbers.size() - 1; j++) {
        velocity1++;
        if (numbers.get(j) > numbers.get(j + 1)) {
          int temp = numbers.get(j);
          numbers.set(j, numbers.get(j + 1));
          numbers.set(j + 1, temp);
        }
      }
    }
    System.out.println(numbers);
    System.out.println("Bubble sort method :" + velocity1);
    
    List<Integer> numbers1 = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      numbers1.add(r.nextInt(100));
    }

    int velocity = 0;
    for (int i = 0; i < numbers1.size(); i++) {
      for (int j = i; j > 0; j--) {
        velocity++;
        if (numbers1.get(j) < numbers1.get(j -1)) {
          int temp = numbers1.get(j);
          numbers1.set(j, numbers1.get(j - 1));
          numbers1.set(j - 1, temp);
        }
      }
    }
    System.out.println(numbers1);
    System.out.println("Insertion sort method :" + velocity);
  }

}
