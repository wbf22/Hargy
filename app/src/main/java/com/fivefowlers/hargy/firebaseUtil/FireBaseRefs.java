package com.fivefowlers.hargy.firebaseUtil;

import com.google.firebase.firestore.FirebaseFirestore;

public class FireBaseRefs
{

    private static FirebaseFirestore firestore;

    public static FirebaseFirestore getFireStoreRef(){
        if (firestore == null){
            firestore = FirebaseFirestore.getInstance();
        }
        return firestore;
    }

}
