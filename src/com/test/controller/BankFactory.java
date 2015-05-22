package com.test.controller;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;

public class BankFactory implements javax.naming.spi.ObjectFactory{

	@Override
	public Object getObjectInstance(Object obj, Name name, Context nameCtx,
			Hashtable<?, ?> environment) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
