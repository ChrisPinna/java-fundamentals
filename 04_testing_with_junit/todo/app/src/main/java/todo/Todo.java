package todo;

import java.util.ArrayList;

public class Todo {

  ArrayList<String> todoList = new ArrayList<String>();

  public void addTask( String task) {
    todoList.add(task);
  }

  public ArrayList<String> getTask() {
    return todoList;
  }

  public static void main(String[] arg) {

  }
}

