package com.bawei.test.week3.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bawei.test.week3.R;
import com.bawei.test.week3.bean.Recy_Bean;

import java.util.List;

/**
 * Created by asus on 2016/11/21.
 */
public class Recy_Adpater extends RecyclerView.Adapter<Recy_Adpater.MyViewHolder> {

    private Context context;
    private List<Recy_Bean.ResultBean.DataBean> data;

    public Recy_Adpater(Context context, List<Recy_Bean.ResultBean.DataBean> data) {
        this.context = context;
        this.data = data;
    }

    /**
     * 创建viewholder*/
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(R.layout.recy_item, parent,
                false));
        return holder;
    }
    /**
     * 进行更新子控件数据*/
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
holder.tv_n.setText(data.get(position).getContent());
        holder.tv_t.setText(data.get(position).getUpdatetime());
    }
    /**
     * 获取条目的数据 */
    @Override
    public int getItemCount() {
        return data.size();
    }
    /**
     * 创建一个类，调用ViewHolder*/
    class  MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_n,tv_t;
       public MyViewHolder(View itemView) {
           super(itemView);
            tv_n = (TextView)itemView.findViewById(R.id.tv_name);
           tv_t= (TextView)itemView.findViewById(R.id.tv_time);
       }
   }
}
