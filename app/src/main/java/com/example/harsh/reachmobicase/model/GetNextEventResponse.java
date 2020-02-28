package com.example.harsh.reachmobicase.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetNextEventResponse {
    @SerializedName("events")
    @Expose
    private List<NextEvent> events = null;

    public List<NextEvent> getEvents() {
        return events;
    }

    public void setEvents(List<NextEvent> events) {
        this.events = events;
    }
}
