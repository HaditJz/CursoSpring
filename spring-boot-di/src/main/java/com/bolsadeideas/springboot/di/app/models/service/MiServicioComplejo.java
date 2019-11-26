package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio{
	
	@Override
	public String operacion(){
		
		return "ejecutando un proceso importante complicado";
	}
}
