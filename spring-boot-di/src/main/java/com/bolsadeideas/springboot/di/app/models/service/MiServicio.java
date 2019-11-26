package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("miServicioSimple")
//@Primary
public class MiServicio implements IServicio{
	
	@Override
	public String operacion(){
		
		return "ejecutando un proceso importante simple";
	}
}
