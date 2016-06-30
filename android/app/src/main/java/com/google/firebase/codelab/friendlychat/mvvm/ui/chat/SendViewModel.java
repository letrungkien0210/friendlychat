package com.google.firebase.codelab.friendlychat.mvvm.ui.chat;

import com.google.firebase.codelab.friendlychat.mvvm.model.FriendlyMessage;
import com.google.firebase.codelab.friendlychat.mvvm.ui.base.BaseViewModel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by KEN-LE on 6/26/2016.
 */
public class SendViewModel extends BaseViewModel {

    private static DatabaseReference mFirebaseDatabaseReference;

    public static  void sendMessage(FriendlyMessage friendlyMessage){
        mFirebaseDatabaseReference = FirebaseDatabase.getInstance().getReference();
        mFirebaseDatabaseReference.child(ChatActivity.MESSAGES_CHILD).push().setValue(friendlyMessage);
    }
}
