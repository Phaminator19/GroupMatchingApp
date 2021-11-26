package com.example.project_1;

import static android.content.ContentValues.TAG;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class Group {
    HashMap<String, String> groupMap;
    private DatabaseReference reference;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance("https://groupmatchproject-default-rtdb.firebaseio.com");
    private String GroupName;
    private String GroupInterest;
    private String GroupBios;

    public Group() {
        groupMap = new HashMap<>();
    }

    private void setGroupName (String GroupName) {
         this.GroupName = GroupName;
    }

    public String getGroupName () {
        return GroupName;
    }

    public String getGroupInterest() {
        return GroupInterest;
    }

    private void setGroupInterest(String groupInterest) {
        GroupInterest = groupInterest;
    }

    public String getGroupBios() {
        return GroupBios;
    }

    private void setGroupBios(String groupBios) {
        GroupBios = groupBios;
    }

    public void editTheGroupName(DatabaseReference ref, String group_name, String new_name) {
       Query groupQuery = ref.orderByChild("Group").equalTo(group_name);
        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot ds : snapshot.getChildren()) {
                    Map<String, Object> map = new HashMap<>();
                    map.put("Group Name", new_name);
                    ds.getRef().updateChildren(map);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.d(TAG, error.getMessage());
            }
        };
        groupQuery.addListenerForSingleValueEvent(valueEventListener);
    }


}