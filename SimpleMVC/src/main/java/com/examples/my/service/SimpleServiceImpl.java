package com.examples.my.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class SimpleServiceImpl implements SimpleService {

	@Override
	public String getMessage() {
		return "Hello.  Welcome to Spring world. Current Time :"+ new SimpleDateFormat("yyyy MMMMM dd E HH:mm:ss").format(new Date());
	}
}
