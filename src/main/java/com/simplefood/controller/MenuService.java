package com.simplefood.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MenuService {

	 @Autowired
	private MenuRepository repo;
	public List<MenuItem> getAll() {
        return repo.findAll();
    }
     
    public void save(MenuItem item) {
        repo.save(item);
    }
     
    public MenuItem get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
