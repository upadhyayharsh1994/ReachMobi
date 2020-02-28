package com.example.harsh.reachmobicase.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseLookupTeam {

	@SerializedName("teams")
	private List<TeamsItem> teams;

	public void setTeams(List<TeamsItem> teams){
		this.teams = teams;
	}

	public List<TeamsItem> getTeams(){
		return teams;
	}

}