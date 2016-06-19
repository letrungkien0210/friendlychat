package com.google.firebase.codelab.friendlychat.mvvm.ui.chat;

import android.databinding.ObservableField;

import com.google.firebase.codelab.friendlychat.mvvm.model.FriendlyMessage;
import com.google.firebase.codelab.friendlychat.mvvm.ui.base.BaseViewModel;

/**
 * Created by VTCA on 6/19/2016.
 */
public class ChatItemViewModel extends BaseViewModel{

    public ObservableField<String> avatar = new ObservableField<>();

    public ObservableField<String> name = new ObservableField<>();

    public ObservableField<String> text = new ObservableField<>();

    public ChatItemViewModel() {
    }

    public void bind(FriendlyMessage message) {
        name.set(message.getName());
        text.set(message.getText());
        avatar.set(message.getPhotoUrl());
    }
}
