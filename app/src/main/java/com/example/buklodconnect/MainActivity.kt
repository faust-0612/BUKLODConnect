package com.example.buklodconnect

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.buklodconnect.databinding.ActivityMainBinding
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.ktx.messaging
import com.google.firebase.perf.FirebasePerformance
import com.google.firebase.perf.metrics.Trace

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var db: FirebaseFirestore
    private lateinit var perf: FirebasePerformance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ---------- Initialize Firebase Firestore with offline caching ----------
        db = Firebase.firestore
        val settings = FirebaseFirestoreSettings.Builder()
            .setPersistenceEnabled(true) // Offline cache
            .build()
        db.firestoreSettings = settings

        // ---------- Initialize Firebase Analytics ----------
        val analytics = Firebase.analytics
        analytics.logEvent("app_opened", null)

        // ---------- Initialize Firebase Performance ----------
        perf = FirebasePerformance.getInstance()
        val trace: Trace = perf.newTrace("main_activity_trace")
        trace.start()

        // ---------- Example Firestore write with optimized listener ----------
        db.collection("users")
            .limit(10) // Pagination: limit to 10 documents for performance
            .get()
            .addOnSuccessListener { snapshot ->
                Log.d("Firestore", "Loaded ${snapshot.size()} users")
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error loading users", e)
            }

        // ---------- Firebase Cloud Messaging: get device token ----------
        Firebase.messaging.token.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                Log.d("FCM Token", task.result)
            }
        }

        trace.stop()
    }
}
