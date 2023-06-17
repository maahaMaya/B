package coms.SpringBootUsingDataJPA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CricketInfo")
public class Cricket {

	@Id
	@GeneratedValue
	private int crid;

	private String crkname;
	private String game;
	private int runs;

	public int getCrid() {
		return crid;
	}

	public void setCrid(int crid) {
		this.crid = crid;
	}

	public String getCrkname() {
		return crkname;
	}

	public void setCrkname(String crkname) {
		this.crkname = crkname;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
}
