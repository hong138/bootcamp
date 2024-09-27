package com.bootcamp.demo;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.typeCompatibleWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.bootcamp.demo.matcher.UppercaseStringMatcher;

public class HamcrestTest {
  @Test
  void testSum() {
    // MatcherAssert.class
    // Hemcrest Framework design is similar to English sentence
    assertThat(Calculator.sum(1, 2), equalTo(3));
    assertThat(Calculator.sum(3, 4), is(not(equalTo(8))));
    // Junit
    assertEquals(7, Calculator.sum(3, 4));
  }

  @Test
  void testComparison(){
    // Junit5
    assertTrue(Calculator.sum(3, 5) == 8);
    // Hamcrest
    assertThat(Calculator.sum(3, 5), is(greaterThanOrEqualTo(8)));
    assertThat(Calculator.sum(3, 5), is(lessThanOrEqualTo(8)));
    assertThat(Calculator.sum(3, 5), is(lessThan(9)));
    assertThat(Calculator.sum(3, 5), is(greaterThan(8)));
    // <, >, <=, >=

    // check
    String result = null;
    assertThat(result, nullValue());
    assertThat("abc", is(nullValue()));
  }

  @Test
  void testString (){
    // contain
    String s1 = "Hello World";
    assertThat(s1, containsString("Hello"));
    assertThat(s1, not(containsString("World")));
    assertThat(s1, startsWith("Hello"));
    assertThat(s1, not(endsWith("World")));
    }

  @Test
  void testList() {
    List<String> fruits = List.of("apple", "orange", "cherry");
    assertThat(fruits, hasItem("apple"));
    assertThat(fruits, not(hasItem("banana")));
    assertThat(fruits, hasItems("apple", "orange"));
    assertThat(fruits, not(hasItems("apple", "banana", "cherry")));
    assertThat(fruits, hasSize(3));
    // !!! contains - includes all items with ordering
    assertThat(fruits, contains("apple", "orange", "cherry"));
    assertThat(fruits, not(contains("apple", "orange")));
    assertThat(fruits, not(contains("apple", "cherry", "orange")));
    // !!! containsInAnyOrder - includes all items without ordering
    assertThat(fruits, containsInAnyOrder("apple", "orange", "cherry"));

    // Check empty List
    List<String> emptyList = new LinkedList<>();
    assertThat(emptyList, hasSize(0));
    assertThat(emptyList, is(empty()));
  }

  @Test
  void testObjectType() {
    assertThat(new Student(18, "John"), instanceOf(Person.class));
    // test if Student.class is extending Person.class
    assertThat(Student.class, typeCompatibleWith(Person.class));
    assertThat(Person.class, not(typeCompatibleWith(Student.class)));
  }

  @Test
  void testCustomMatcher() {
    assertThat("ABC", UppercaseStringMatcher.create());
    assertThat("ABC", not(UppercaseStringMatcher.create()));
  }
}
