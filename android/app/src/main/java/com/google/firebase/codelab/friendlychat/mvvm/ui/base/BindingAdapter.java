package com.google.firebase.codelab.friendlychat.mvvm.ui.base;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by VTCA on 6/19/2016.
 * keyword: databinding dapter
 */
public class BindingAdapter {

    @android.databinding.BindingAdapter("app:avatar")
    public static void setAvatar(CircleImageView view, String avatar) {
        Glide.with(view.getContext())
                .load(avatar)
                .into(view);
    }
}
