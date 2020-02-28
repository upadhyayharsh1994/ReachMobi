package com.example.harsh.reachmobicase.httpclient;

import com.example.harsh.reachmobicase.model.GetEventResponse;
import com.example.harsh.reachmobicase.model.GetNextEventResponse;
import com.example.harsh.reachmobicase.model.GetTeamResponse;
import com.example.harsh.reachmobicase.model.ResponseLookupTeam;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("searchteams.php")
    Call<GetTeamResponse> getsearchTeam(@Query("t") String id);


    @GET("eventsnext.php")
    Call<GetNextEventResponse> getNextEventResponse(@Query("id") String id);

    @GET("eventslast.php")
    Call<GetEventResponse> getLastEventResponse(@Query("id") String id);

    @GET("lookupteam.php?")
    Call<ResponseLookupTeam> getLookupTeam(@Query("id") String id);
}
