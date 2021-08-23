package com.jabeer.coolchat;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserListViewHolder> {

    ArrayList<UserObject> userlist;

    public UserListAdapter(ArrayList<UserObject> userlist){
        this.userlist = userlist;
    }

    @NonNull
    @Override
    public UserListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,null,false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutview.setLayoutParams(lp);

        UserListViewHolder rcv = new UserListViewHolder(layoutview);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull UserListViewHolder holder, int position) {
        holder.mname.setText(userlist.get(position).getName());
        holder.mphone.setText(userlist.get(position).getPhone());

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class UserListViewHolder  extends  RecyclerView.ViewHolder{

        public TextView mname, mphone;

        public UserListViewHolder(View view){
            super(view);
            mname = view.findViewById(R.id.name);
            mphone = view.findViewById(R.id.phone);

        }

    }
}
