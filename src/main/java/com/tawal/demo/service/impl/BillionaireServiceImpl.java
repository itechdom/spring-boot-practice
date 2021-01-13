package com.tawal.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tawal.demo.dao.BillionaireDao;
import com.tawal.demo.model.Billionaire;
import com.tawal.demo.service.BillionaireService;

@Service
public class BillionaireServiceImpl implements BillionaireService {

	@Autowired
	private BillionaireDao BillionaireDao;

	public List<Billionaire> getBillionaires() {
		return BillionaireDao.getBillionaires();
	}

}