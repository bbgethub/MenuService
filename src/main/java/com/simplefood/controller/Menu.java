package com.simplefood.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/MenuItem")
public class Menu {

	 @Autowired
	 private MenuService menuService;
	 
	 @GetMapping("/")
	 public List getAll() {
	     List<MenuItem> listMenu = menuService.getAll();
	     return listMenu;
	 }
	 @GetMapping("/{id}")
	 public MenuItem getAll(@PathVariable("id") String id) {
	     MenuItem item= menuService.get(new Long(id));
	     
	     return item;
	 }
}
