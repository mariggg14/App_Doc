package com.example.austin.app_doc;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GrpAdaptador extends RecyclerView.Adapter<GrpAdaptador.myViewHolder>{

    Context mContext;
    List<GrpItem> mDate;

    public GrpAdaptador(Context mContext, List<GrpItem> mDate) {
        this.mContext = mContext;
        this.mDate = mDate;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_grp, viewGroup, false);

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {

        myViewHolder.grpEsc.setImageResource(mDate.get(i).getGrpEsc());
        myViewHolder.grpName.setText(mDate.get(i).getGrpName());
    }

    @Override
    public int getItemCount() {
        return mDate.size();
    }

    public  class myViewHolder extends  RecyclerView.ViewHolder{
        ImageView grpEsc;
        TextView grpName;

        public myViewHolder(View itemView){
            super(itemView);
            grpEsc = itemView.findViewById(R.id.grpEsc);
            grpName = itemView.findViewById(R.id.grpDesc);
        }

    }
}
