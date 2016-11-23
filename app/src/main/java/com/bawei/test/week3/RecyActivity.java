package com.bawei.test.week3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.bawei.test.week3.adapter.Recy_Adpater;
import com.bawei.test.week3.bean.Recy_Bean;
import com.bawei.test.week3.utils.OkHttp;
import com.bawei.test.week3.utils.RecyclerViewClickListener;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Request;

public class RecyActivity extends AppCompatActivity {
    List<Recy_Bean.ResultBean.DataBean> data;
    private RecyclerView recyclerView;
private String path="http://japi.juhe.cn/joke/content/list.from?key= 874ed931559ba07aade103eee279bb37 &page=2&pagesize=10&sort=asc&time=1418745237";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recy);
        //获得控件
        inittCtrl();
//网络请求
        initOkhttp();
        //布局管理器
      recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
//rRecyclerView监听事件
        recyclerView.addOnItemTouchListener(new RecyclerViewClickListener(this, recyclerView, new RecyclerViewClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(RecyActivity.this,""+data.get(position).getContent(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        }));

    }

    private void initOkhttp() {
        OkHttp.getAsync(path, new OkHttp.DataCallBack() {
            @Override
            public void requestFailure(Request request, IOException e) {

            }

            @Override
            public void requestSuccess(String result) throws Exception {
                Gson gson = new Gson();
                Recy_Bean rb = gson.fromJson(result,Recy_Bean.class);
                data =  rb.getResult().getData();
                Recy_Adpater mAdapter = new Recy_Adpater(RecyActivity.this,data);
                recyclerView.setAdapter(mAdapter);

            }
        });
    }

    private void inittCtrl() {
        recyclerView = (RecyclerView)findViewById(R.id.recy);
    }
}
