package com.example.harsh.reachmobicase.model;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetEventResponse {

        @SerializedName("results")
        private List<GetEvent> getEvents;

        public List<GetEvent> getGetEvents() {
            return getEvents;
        }

        public void setGetEvents(List<GetEvent> getEvents) {
            this.getEvents = getEvents;
        }

}
