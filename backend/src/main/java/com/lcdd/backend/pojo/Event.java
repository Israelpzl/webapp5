package com.lcdd.backend.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.lcdd.backend.pojo.User.Basico;



@Entity
public class Event {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@JsonView(Basico.class)
	@ManyToOne
	private Game game;
	@JsonView(Basico.class)
	private String name;
	@JsonView(Basico.class)
	private String place;
	@JsonView(Basico.class)
	private String date;//yyyy-MM-dd
	@JsonView(Basico.class)
	private String time;//hh:mm
	@JsonView(Basico.class)
	private String description;
	@JsonView(Basico.class)
	private boolean isTournament;
	@JsonView(Basico.class)
	private boolean haveImage;
	
	@JsonView(Basico.class)
	@OneToOne(cascade=CascadeType.ALL)
	private Tournament tournament;
	@JsonView(Basico.class)
	private int groupSize;
	@JsonView(Basico.class)
	private float inscriptionFee;
	@JsonView(Basico.class)
	private int maxParticipants;
	
	@JsonIgnore
	@OneToMany(mappedBy="event")
	private List<EventRegister> registrations = new ArrayList<>();
	
	
	protected Event() { 
	}

	public Event(Game game, String description) {
		this.game = game;
		this.description = description;
	}
	
	public Event( String name, Game game, String place, String date, String time, String description,
			boolean isTournament, String reward, int groupSize, float inscriptionFee, int maxParticipants) {
		super();
		
		this.name = name;
		this.game = game;
		this.place = place;		
		this.date = date;
		this.time = time;
		this.description = description;
		this.isTournament = isTournament;
		this.tournament = new Tournament(reward);
		this.groupSize = groupSize;
		this.inscriptionFee = inscriptionFee;
		this.maxParticipants = maxParticipants;
		
		this.haveImage = false;
		
	}
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Game getGame() {
		return game;
	}


	public void setGame(Game game) {
		this.game = game;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean getIsTournament() {
		return isTournament;
	}


	public void setIsTournament(boolean isTournament) {
		this.isTournament = isTournament;
	}

	public float getInscriptionFee() {
		return inscriptionFee;
	}


	public void setInscriptionFee(float inscriptionFee) {
		this.inscriptionFee = inscriptionFee;
	}


	public int getMaxParticipants() {
		return maxParticipants;
	}


	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}


	public List<EventRegister> getRegistrations() {
		return registrations;
	}


	public void setRegistrations(List<EventRegister> registrations) {
		this.registrations = registrations;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Tournament getTournament() {
		return tournament;
	}
	
	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
	
	public int getGroupSize() {
		return groupSize;
	}
	
	public void setGroupSize(int groupSize) {
		this.groupSize = groupSize;
	}
	
	public boolean isHaveImage() {
		return haveImage;
	}
	
	public void setHaveImage(boolean haveImage) {
		this.haveImage = haveImage;
	}

	
}
