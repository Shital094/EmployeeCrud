package com.cjc.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.crud.servicei.EmployeeServiceI;

@RestController
public class EmployeeController {
 @Autowired
 EmployeeServiceI esi;
 
}
