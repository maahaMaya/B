package coms.SpringBootUsingDataJPA.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import coms.SpringBootUsingDataJPA.model.Cricket;
import coms.SpringBootUsingDataJPA.service.CricketService;



@Controller
public class CricketController {

	@Autowired
	CricketService cs;

	@GetMapping(value = "/")
	public String DefaultPage(Model m) {
		List<Cricket> crkAll = cs.ShowAll();
		m.addAttribute("call", crkAll);
		return "ViewAllCricketers";
	}

	@GetMapping(value = "/add")
	public String NewCricketer(Model m) {
		return "AddCricketer";
	}

	@PostMapping(value = "/addn")
	public String NewCricketer(@RequestParam("txtcrName") String cname, @RequestParam("ddlGame") String game,
			@RequestParam("txtruns") int runs, Model m) {
		Cricket crk = new Cricket();
		crk.setCrkname(cname);
		crk.setGame(game);
		crk.setRuns(runs);

		if (cs.AddNewCricketer(crk).equals("Success"))
			m.addAttribute("msg", "Details are Added...");

		return "AddCricketer";
	}

	@GetMapping(value = "/vall")
	public String ViewAll(Model m) {
		List<Cricket> crkAll = cs.ShowAll();
		m.addAttribute("call", crkAll);
		return "ViewAllCricketers";
	}

	@GetMapping(value = "/search")
	public String SearchCriketer(Model m) {
		return "SearchCrk";
	}

	@PostMapping(value = "/fetchInfo")
	public String SearchCriketer(@RequestParam("txtCid") int cid, Model m) {
		Cricket crk = cs.Search(cid);
		if (crk != null)
			m.addAttribute("crk", crk);
		else
			m.addAttribute("msg", "Cricketer Not Found...");
		return "SearchCrk";
	}

	@GetMapping(value = "/del")
	public String DelCriketer(Model m) {
		return "DeleteCrk";
	}

	@PostMapping(value = "/delInfo")
	public String DelCriketer(@RequestParam("txtCid") int cid, Model m) {
		Cricket crk = cs.Search(cid);
		if (crk != null) {
			cs.DeleteCricketer(cid);
			m.addAttribute("msg", "Cricketer Deleted...");
		} else
			m.addAttribute("msg", "Cricketer Not Found...");
		return "DeleteCrk";
	}

	@GetMapping(value = "/mod")
	public String UpdateCriketer(Model m) {
		return "ModifyCrk";
	}

	@PostMapping(value = "/fetchMod")
	public String SearchCriketers(@RequestParam("txtCid") int cid, Model m) {
		Cricket crk = cs.Search(cid);
		if (crk != null)
			m.addAttribute("crk", crk);
		else
			m.addAttribute("msg", "Cricketer Not Found...");
		return "ModifyCrk";
	}

	@PostMapping(value = "/modn")
	public String ModifyCricketer(@RequestParam("txtcrName") String cname, @RequestParam("ddlGame") String game,
			@RequestParam("txtruns") int runs, @RequestParam("txtcid") int cid, Model m) {
		Cricket crk = new Cricket();
		crk.setCrid(cid);
		crk.setCrkname(cname);
		crk.setGame(game);
		crk.setRuns(runs);

		if (cs.ModifyCricketer(crk).equals("Success"))
			m.addAttribute("msg", "Details are Modified...");

		return "ModifyCrk";
	}
}
