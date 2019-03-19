package com.example.admin.myapplication;



import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;




public class Adapter1 extends RecyclerView.Adapter<Adapter1.viewholder> {
    Context context;
    String s[][];
    public Adapter1(Context context, String s[][]) {
        this.context = context;
        this.s=s;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.cardview, viewGroup,false);
        return new viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final viewholder viewholder,int i) {
        final int p=i;
        viewholder.eventName.setText(s[i][0]);
        viewholder.eventDate.setText(s[i][1]);
        viewholder.eventTime.setText(s[i][2]);
        viewholder.eventFee.setText(s[i][3]);
        viewholder.feeStatus.setText(s[i][4]);

    }

    @Override
    public int getItemCount() {
        return s.length;
    }

    public  class viewholder extends RecyclerView.ViewHolder {
        TextView eventDate, eventTime, eventFee, eventName, feeStatus;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            eventDate = itemView.findViewById(R.id.tv_event_date);
            eventTime = itemView.findViewById(R.id.tv_event_time);
            eventFee = itemView.findViewById(R.id.eventfees);
            eventName = itemView.findViewById(R.id.tv_event_name);
            feeStatus = itemView.findViewById(R.id.iv_event_fees_status);

        }
    }
}