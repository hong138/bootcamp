package com.bootcamp.demo;

import java.util.LinkedList;
import java.util.List;

public class Exam {
  private List<Integer> score;

  public Exam(){
    this.score = new LinkedList<>();
  }

  public void addScore(int score){
    this.score.add(score);
  }

  // !!! Exam Object -> instance method (highestScore()) -> Calculator static method
  public int highestScore() {
    // call Calculator.findMax()

    // List<Integer> -> int[]
    int[] arr = this.score.stream().mapToInt(i -> i).toArray();
    // int[] arr = this.score.toArray(new Integer[this.score.size()]);
    return Calculator.findMax(arr);
  }
  public static void main(String[] args) {
    // Exam maths = new Exam();
    // maths.addScore(10);
    // maths.addScore(90);
    // maths.addScore(75);
    // System.out.println(maths.highestScore());

  }
}
