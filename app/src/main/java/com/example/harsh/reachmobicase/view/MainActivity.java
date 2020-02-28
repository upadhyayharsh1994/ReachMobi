package com.example.harsh.reachmobicase.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.harsh.reachmobicase.Adapter.AdapterDetailsTeam;
import com.example.harsh.reachmobicase.R;
import com.example.harsh.reachmobicase.httpclient.ApiClient;
import com.example.harsh.reachmobicase.httpclient.ApiInterface;
import com.example.harsh.reachmobicase.Adapter.AdapterForNextUpComingEvent;
import com.example.harsh.reachmobicase.model.GetEvent;
import com.example.harsh.reachmobicase.model.GetEventResponse;
import com.example.harsh.reachmobicase.model.GetNextEventResponse;
import com.example.harsh.reachmobicase.model.GetTeamResponse;
import com.example.harsh.reachmobicase.model.NextEvent;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText etTitle;
    private TextView tv_tvResult, tvLastFive, tvNextFive;
    private ImageView ivSearch;
    private ProgressBar progressBar;
    private int mProgressStatus = 0;

    AdapterDetailsTeam adapterDetailsTeam;
    AdapterForNextUpComingEvent adapterForNextUpComingEvent;
    Context context;
    RecyclerView rcvTeamUpcomingEvent, rcvTeamLastEvent;
    List<NextEvent> getNextEvent = new ArrayList<>();
    List<GetEvent> getEvent = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        ivSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Store my last parameter as a time of searching favourite team.
                Editable edi = etTitle.getText();
                String string = "";
                if (edi != null) {
                    string = edi.toString();

                }
                //after pressing image close my virtual keyboard
                hideKeybaord(view);
                String str = "";
                if (string.equals(str)) {
                    Toast.makeText(MainActivity.this, "Please enter valid team", Toast.LENGTH_SHORT).show();
                } else {
                    //calling the search for team by name with passing name as a string
                    getAllTeamApiCall(string);
                }
            }
        });
    }

    private void getAllTeamApiCall(String id) {
        ApiInterface apiService = ApiClient.getApiClient().create(ApiInterface.class);
        Call<GetTeamResponse> call = apiService.getsearchTeam(id);
        call.enqueue(new Callback<GetTeamResponse>() {
            @Override
            public void onResponse(Call<GetTeamResponse> call, Response<GetTeamResponse> response) {
                if (response.body().getTeams() != null) {
                    tv_tvResult.setVisibility(View.VISIBLE);
                    //set up name of the team in Header
                    tv_tvResult.setText(response.body().getTeams().get(0).getStrTeam());

                    //storing id of team to call events by using their id
                    String idTeam = response.body().getTeams().get(0).getIdTeam();

                    //calling two api for showing the list of next and previous matches
                    previousMatchApi(idTeam, apiService);
                    upcomingMatchApi(idTeam, apiService);
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                } else {
                    //If we don't find any team then reset edit text
                    etTitle.setText("");
                }

            }

            @Override
            public void onFailure(Call<GetTeamResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void upcomingMatchApi(String idTeam, ApiInterface apiService) {

        rcvTeamUpcomingEvent.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        adapterForNextUpComingEvent = new AdapterForNextUpComingEvent(context, getNextEvent, apiService);
        rcvTeamUpcomingEvent.setAdapter(adapterForNextUpComingEvent);
        tvNextFive.setVisibility(View.VISIBLE);
        Call<GetNextEventResponse> call = apiService.getNextEventResponse(idTeam);
        call.enqueue(new Callback<GetNextEventResponse>() {
            @Override
            public void onResponse(Call<GetNextEventResponse> call, Response<GetNextEventResponse> response) {
                if (response.isSuccessful()) {

                    adapterForNextUpComingEvent.setItems(response.body().getEvents());
                    adapterForNextUpComingEvent.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<GetNextEventResponse> call, Throwable t) {

            }
        });
    }

    private void previousMatchApi(String idTeam, ApiInterface apiService) {

        rcvTeamLastEvent.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        adapterDetailsTeam = new AdapterDetailsTeam(context, getEvent, apiService);

        rcvTeamLastEvent.setAdapter(adapterDetailsTeam);
        tvLastFive.setVisibility(View.VISIBLE);

        Call<GetEventResponse> call = apiService.getLastEventResponse(idTeam);
        call.enqueue(new Callback<GetEventResponse>() {
            @Override
            public void onResponse(Call<GetEventResponse> call, Response<GetEventResponse> response) {
                if (response.isSuccessful()) {

                    adapterDetailsTeam.setItems(response.body().getGetEvents());
                    adapterDetailsTeam.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<GetEventResponse> call, Throwable t) {

            }
        });
    }

    private void init() {
        etTitle = (EditText) findViewById(R.id.et_title);
        ivSearch = (ImageView) findViewById(R.id.iv_search);
        tv_tvResult = (TextView) findViewById(R.id.tv_result);
        tvLastFive = (TextView) findViewById(R.id.tv_last_five);
        tvNextFive = (TextView) findViewById(R.id.tv_next_five);
        rcvTeamUpcomingEvent = (RecyclerView) findViewById(R.id.rcv_team_upcoming_event);
        rcvTeamLastEvent = (RecyclerView) findViewById(R.id.rcv_team_last_event);
    }

    //Hiding the keyboard
    private void hideKeybaord(View v) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(v.getApplicationWindowToken(), 0);
    }

}
