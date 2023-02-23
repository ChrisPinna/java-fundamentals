package todo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TodoTest {
  @Test public void addTask() {
    Todo todo = new Todo();
    assertEquals("todo list is empty", 0, todo.todoList.size());
    todo.addTask("Go to the supermaket");
    assertEquals("todo list has 1 string", 1, todo.todoList.size());
  }

  @Test public void getTask() {
    Todo todo = new Todo();
    todo.addTask("program to the music of rockie");
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("program to the music of rockie");
    ArrayList<String> actual = todo.getTask();
    assertEquals("todo returns our task", expected, actual);
  }
}