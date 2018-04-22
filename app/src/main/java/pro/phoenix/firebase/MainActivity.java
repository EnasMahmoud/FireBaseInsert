package pro.phoenix.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        //DatabaseReference myRef = database.getReference("fir-e7e01");
        //DatabaseReference myRef = database.getReferenceFromUrl("https://fir-e7e01.firebaseio.com/");
        //myRef.setValue("Hello, World!");

        DatabaseReference myRef = database.getReference();
        //myRef.child("100").setValue("Ahmed");

        /*myRef.child("100").child("Name").setValue("Ahmed");
        myRef.child("100").child("Job").setValue("Developer");

        myRef.child("101").child("Name").setValue("Mohamed");
        myRef.child("101").child("Job").setValue("Designer");*/

        String ID= myRef.push().getKey();

        myRef.child(ID).child("ID").setValue("100");
        myRef.child(ID).child("Name").setValue("Ahmed");
        myRef.child(ID).child("Class").setValue("1/a");
        myRef.child(ID).child("Age").setValue("5");

        ID= myRef.push().getKey();
        myRef.child(ID).child("ID").setValue("101");
        myRef.child(ID).child("Name").setValue("Mohamed");
        myRef.child(ID).child("Class").setValue("2/a");
        myRef.child(ID).child("Age").setValue("8");

        ID= myRef.push().getKey();
        myRef.child(ID).child("ID").setValue("102");
        myRef.child(ID).child("Name").setValue("Mahmoud");
        myRef.child(ID).child("Class").setValue("3/a");
        myRef.child(ID).child("Age").setValue("20");





    }
}
