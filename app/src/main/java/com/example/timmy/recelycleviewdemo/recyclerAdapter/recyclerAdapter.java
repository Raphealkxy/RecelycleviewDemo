package com.example.timmy.recelycleviewdemo.recyclerAdapter;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.timmy.recelycleviewdemo.R;

import java.util.ArrayList;

/**
 * Created by Timmy on 2017/7/10.
 */

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHodler> {


    private final Context context;
    private ArrayList<String> datas;
    public recyclerAdapter(Context context, ArrayList<String> datas) {
        this.context=context;
        this.datas=datas;
    }

    //相当于getview方法中创建view和ViewHolder的部分
    @Override
    public MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =View.inflate(context, R.layout.itemview_recyclerview,null);
        return new MyViewHodler(itemView);
    }


    //数据和view绑定
    @Override
    public void onBindViewHolder(MyViewHodler holder, int position) {

        String data =datas.get(position);
        holder.tv_title.setText(data);

    }


    //得到总条数
    @Override
    public int getItemCount() {
        return datas.size();
    }

    class MyViewHodler extends RecyclerView.ViewHolder{

           private ImageView iv_icon;
           private TextView tv_title;
        public MyViewHodler(View itemView) {
            super(itemView);
            iv_icon= (ImageView) itemView.findViewById(R.id.iv_icon);
            tv_title= (TextView) itemView.findViewById(R.id.text_title);

        }
    }
}
