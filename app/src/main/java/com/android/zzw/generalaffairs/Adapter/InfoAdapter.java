package com.android.zzw.generalaffairs.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.zzw.generalaffairs.Bean.mainRecyclerview;
import com.android.zzw.generalaffairs.R;

import java.util.List;

/**
 * Created by zzw on 2017/9/10.
 */

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder>{
    private Context context;
    private List<mainRecyclerview> mInfoList;
    private LayoutInflater inflater;
    private MyItemClickListener mItemClickListener;
    static class ViewHolder extends RecyclerView.ViewHolder{
        View infoview;
        TextView time;

        ImageView img;
        public ViewHolder(View view){
            super(view);
            time= (TextView) view.findViewById(R.id.time);
            img= (ImageView) view.findViewById(R.id.img);
            infoview=view;
        }

    }
    public InfoAdapter(Context context, List<mainRecyclerview> foodList){
        this.context = context;
        mInfoList=foodList;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public InfoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.mian_recyclerview,parent,false);
        final ViewHolder holder =new ViewHolder(view);
        holder.infoview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int postion = holder.getAdapterPosition();
//                mItemClickListener.onItemClick(v,postion);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(final InfoAdapter.ViewHolder holder, int position) {
        final mainRecyclerview info=mInfoList.get(position);

        holder.time.setText(info.getTime());
        holder.img.setImageResource(info.getContent());

    }

    @Override
    public int getItemCount() {
        return mInfoList.size();
    }
    public interface MyItemClickListener {
        void onItemClick(View view,int postion);
    }
    public void setOnItemClickListener(MyItemClickListener listener){
        this.mItemClickListener = listener;
    }
}

