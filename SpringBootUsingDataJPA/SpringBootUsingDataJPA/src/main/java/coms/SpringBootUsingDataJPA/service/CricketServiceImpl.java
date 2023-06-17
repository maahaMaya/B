package coms.SpringBootUsingDataJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.SpringBootUsingDataJPA.model.Cricket;
import coms.SpringBootUsingDataJPA.repository.CricketRepo;

@Service
public class CricketServiceImpl implements CricketService {

	@Autowired
	CricketRepo  cr;
	
	@Override
	public String AddNewCricketer(Cricket crk) {
		String res = "err";
		if(crk!=null)
		{
			cr.save(crk);  // add
			res = "Success";
		}
		return res;
	}

	@Override
	public List<Cricket> ShowAll() {
		List<Cricket>  crkall = cr.findAll();
		return crkall;
	}

	@Override
	public Cricket Search(int crno) {
		Optional<Cricket> crk = cr.findById(crno); 
		if(crk.isPresent())
			return crk.get();
		
		return null;
	}

	@Override
	public String ModifyCricketer(Cricket crk) {
		String res = "err";
		if(crk!=null)
		{
			cr.saveAndFlush(crk);  // modify
			res = "Success";
		}
		return res;
	}

	@Override
	public void DeleteCricketer(int crno) {
		cr.deleteById(crno);
	}

	
}
