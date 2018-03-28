package com.ecom.vendor.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class VendorController 
{
	@RequestMapping("getData")
	public String getData()
	{
		return "test data..";
	}
}
