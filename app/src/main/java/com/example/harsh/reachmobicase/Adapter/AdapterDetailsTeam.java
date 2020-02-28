package com.example.harsh.reachmobicase.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.harsh.reachmobicase.R;
import com.example.harsh.reachmobicase.httpclient.ApiInterface;
import com.example.harsh.reachmobicase.model.GetEvent;
import com.example.harsh.reachmobicase.model.ResponseLookupTeam;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdapterDetailsTeam extends RecyclerView.Adapter<AdapterDetailsTeam.ViewHolder>{

    Context context;
    List<GetEvent> getEvent;
    ApiInterface mApi;
    public AdapterDetailsTeam(Context context, List<GetEvent> getEventResponses, ApiInterface apiService) {
        this.context = context;
        this.getEvent = getEventResponses;
        this.mApi = apiService;
    }
    public void setItems(List<GetEvent> getEventResponses){
        this.getEvent = getEventResponses;
    }

    @NonNull
    @Override
    public AdapterDetailsTeam.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_details,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvDate.setText(getEvent.get(position).getDateEvent());
        holder.tvScoreAway.setText(getEvent.get(position).getIntAwayScore());
        holder.tvScoreHome.setText(getEvent.get(position).getIntHomeScore());
        //holder.tvGoalAway.setText(getEvent.get(position).getStrAwayGoalDetails());
        //holder.tvGoalHome.setText(getEvent.get(position).getStrHomeGoalDetails());
        holder.tvTeam.setText(getEvent.get(position).getStrEvent());
        callApiLookupItem(getEvent.get(position).getIdAwayTeam(), holder.ivAway);
        callApiLookupItem(getEvent.get(position).getIdHomeTeam(), holder.ivHome);
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
        return getEvent.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTeam;
        TextView tvScoreAway;
        TextView tvGoalAway;
        TextView tvGoalHome;
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
