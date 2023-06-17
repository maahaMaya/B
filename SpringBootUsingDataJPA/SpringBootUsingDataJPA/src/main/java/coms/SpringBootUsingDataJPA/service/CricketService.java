package coms.SpringBootUsingDataJPA.service;

import java.util.List;

import coms.SpringBootUsingDataJPA.model.Cricket;

public interface CricketService {

	public String AddNewCricketer(Cricket crk);
	public List<Cricket> ShowAll();
	public Cricket  Search(int crno);
	public String ModifyCricketer(Cricket crk);
	public void DeleteCricketer(int crno);
}
