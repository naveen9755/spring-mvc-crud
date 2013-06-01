package me.ucheng.todo.service;

import java.util.List;

import me.ucheng.todo.domain.ToDo;

public interface ToDoService {

	public void save(ToDo todo);
	public void update(ToDo todo);
	public void delete(ToDo todo);
	public List<ToDo> getAll();
}
