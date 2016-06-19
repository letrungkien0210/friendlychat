package com.google.firebase.codelab.friendlychat.mvvm.ui.chat;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.codelab.friendlychat.R;
import com.google.firebase.codelab.friendlychat.databinding.ItemMessageBinding;
import com.google.firebase.codelab.friendlychat.mvvm.model.FriendlyMessage;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by VTCA on 6/19/2016.
 */
public class ChatItemViewHolder extends RecyclerView.ViewHolder {


    private final ItemMessageBinding mBinding;

    private final ChatItemViewModel mViewModel;

    public ChatItemViewHolder(View itemView) {
        super(itemView);
        mViewModel = new ChatItemViewModel();
        mBinding = DataBindingUtil.bind(itemView);
        mBinding.setViewModel(mViewModel);
    }

    public  void bind(FriendlyMessage message){
        //Model sycn with UI
        mViewModel.bind(message);
    }
}
