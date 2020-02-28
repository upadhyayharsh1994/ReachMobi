package com.example.harsh.reachmobicase.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.harsh.reachmobicase.R;
import com.example.harsh.reachmobicase.httpclient.ApiInterface;
import com.example.harsh.reachmobicase.model.NextEvent;
import com.example.harsh.reachmobicase.model.ResponseLookupTeam;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdapterForNextUpComingEvent extends RecyclerView.Adapter<AdapterForNextUpComingEvent.ViewHolder>{
    Context context;
    List<NextEvent> getNextEvent;
    ApiInterface mApi;
    public AdapterForNextUpComingEvent(Context context, List<NextEvent> getEventResponses, ApiInterface apiService) {
        this.context = context;
        this.getNextEvent = getEventResponses;
        this.mApi = apiService;
    }
    public void setItems(List<NextEvent> getEventResponses){
        this.getNextEvent = getEventResponses;
    }

    @NonNull
    @Override
    public AdapterForNextUpComingEvent.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_details,parent,false);
        return new AdapterForNextUpComingEvent.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterForNextUpComingEvent.ViewHolder holder, int position) {

        holder.tvDate.setText(getNextEvent.get(position).getDateEvent());
        //holder.tvGoalAway.setText(getEvent.get(position).getStrAwayGoalDetails());
        //holder.tvGoalHome.setText(getEvent.get(position).getStrHomeGoalDetails());
        holder.tvScoreAway.setVisibility(View.GONE);
        holder.tvScoreHome.setVisibility(View.GONE);
        holder.tvTeam.setText(getNextEvent.get(position).getStrEvent());
        callApiLookupItem(getNextEvent.get(position).getIdAwayTeam(), holder.ivAway);
        callApiLookupItem(getNextEvent.get(position).getIdHomeTeam(), holder.ivHome);
    }

    public void callApiLookupItem(String id, final ImageView ivteam) {

        Call<ResponseLookupTeam> api=mApi.getLookupTeam(id);

        api.enqueue(new Callback<ResponseLookupTeam>() {
            @Override
            public void onResponse(Call<ResponseLookupTeam> call, Response<ResponseLookupTeam> response) {

                /*if (response.isSuccessful()){
                    Picasso.get()
                            .load(response.body().getTeams().get(0).getStrTeamBadge())
                            .into(ivteam);
                }*/
                if(response.body()!= null) {
                    Picasso.get()
                            .load(response.body().getTeams().get(0).getStrTeamBadge())
                            .into(ivteam);

                }

            }

            @Override
            public void onFailure(Call<ResponseLookupTeam> call, Throwable t) {
            }
        });

    }

    @Override
    public int getItemCount() {
        return getNextEvent.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTeam;
        TextView tvScoreAway;
        TextView tvScoreHome;
        TextView tvDate;
        ImageView ivHome;
        ImageView ivAway;
        //  View itemView;
        public ViewHolder(@NonNull View view) {
            super(view);
            tvTeam=view.findViewById(R.id.tv_Team);
            tvScoreAway=view.findViewById(R.id.tv_ScoreAway);
            tvScoreHome=view.findViewById(R.id.tv_ScoreHome);
            tvDate=view.findViewById(R.id.tv_Date);
            ivHome=itemView.findViewById(R.id.iv_Home);
            ivAway=itemView.findViewById(R.id.iv_Away);
            // this.itemView=view;
        }
    }

}
