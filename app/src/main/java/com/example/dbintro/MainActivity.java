package com.example.dbintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import data.DatabaseHandler;
import model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        Log.d("DB Count :",String.valueOf(db.getContactsCount()));
        //inset Contact
        //Log.d("Insert :","INserting...");
       // db.addContact(new Contact("Aditya","9406308401"));
        //db.addContact(new Contact("Sanjay","9827661111"));
        //db.addContact(new Contact("Ajay","98278474500"));

        //Read them Back
        //Log.d("Read :","Reading All...");
        List<Contact> contactList = db.getAllContact();
        //Contact oneContact = db.getContact(2);
        //db.deleteContact(oneContact);


        for(Contact c : contactList){

            String log = "Id :"+c.getId() +" , Name :"+ c.getName() +" ,Phone :"+c.getPhoneNumber();
            Log.d("Name :",log);
        }

        //Get One Contact
        //Log.d("One Contact :","Name :" + oneContact.getName()+" Phone :"+ oneContact.getPhoneNumber());

        //update Contact
        //oneContact.setName("Adi");
        //oneContact.setPhoneNumber("9828558061");

        //int newContact = db.updateContact(oneContact);
       // Log.d("Update :","ID :"+ String.valueOf(newContact)+" Name :"+oneContact.getName()+" Phone :"+oneContact.getPhoneNumber());



    }
}
