package com.fivefowlers.hargy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fivefowlers.hargy.firebaseUtil.FireBaseRefs;
import com.fivefowlers.hargy.firebaseUtil.User;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class NewConnectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_connection);

        FirebaseFirestore db = FireBaseRefs.getFireStoreRef();
        DocumentReference docRef = db.collection("users").document(userId);
        docRef.get().addOnSuccessListener(documentSnapshot ->
        {
            User user = documentSnapshot.toObject(User.class);

        });
    }
}