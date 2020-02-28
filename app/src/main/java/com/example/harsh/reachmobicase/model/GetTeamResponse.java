package com.example.harsh.reachmobicase.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetTeamResponse {

    @SerializedName("teams")
    @Expose
    private List<GetTeam> teams = null;

    public List<GetTeam> getTeams() {
        return teams;
    }

    public void setTeams(List<GetTeam> teams) {
        this.teams = teams;
    }
}
