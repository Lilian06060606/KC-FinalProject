package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Arrays;

public class Content extends AppCompatActivity {
ArrayList<Universities> universitieslist = new ArrayList<>();


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
ImageView home = findViewById(R.id.imageView2);


        Universities oxfordd = new Universities("University Of Oxford","https://www.ox.ac.uk/",R.drawable.u1,R.drawable.oxford,"▪️التصنيف : الثانية على المملكة المُتحدة والرابعة عالميًّا حسب تصنيف QS الدولي لعام ٢٠٢٢م.");
        Universities campridge = new Universities("University Of Campridge","https://www.cam.ac.uk//",R.drawable.u2,R.drawable.cam,"▪️التصنيف: الأولى على المملكة المتحدة والثانية عالميًّا حسب تصنيف QS الدولي لعام ٢٠٢٢م.");
     Universities IC = new Universities("Imperial College London","https://www.imperial.ac.uk/",R.drawable.u3,R.drawable.imperial,"▪️التصنيف: الثالثة على المملكة المُتحدة ، والسادسة عالميًّا حسب تصنيف QS الدولي لعام ٢٠٢٢م.");
    Universities uc = new Universities("University College London ","https://www.ucl.ac.uk/",R.drawable.u10,R.drawable.cl,"▪️التصنيف: الرابعة على المملكة المتحدة،  والثامنة عالميًّا حسب تصنيف QS الدولي.");
    Universities lse = new Universities("LSE ","https://www.lse.ac.uk/",R.drawable.u4,R.drawable.poltical,"▪ التصنيف: الثامنة على المملكة المُتحدة ال٤٩ عالميًّا حسب تصنيف QS الدولي لعام٢٠٢٢م.");
    Universities ue = new Universities("Univesity Of Edinburg ","https://www.ed.ac.uk/",R.drawable.u5,R.drawable.ed,"▪️التصنيف: الخامسة على المملكة المتحدة ، وال١٥ عالميًّا حسب تصنيف QS الدولي لعام ٢٠٢٢م.");
    Universities kc = new Universities("King's College London ","https://www.kcl.ac.uk/",R.drawable.u6,R.drawable.kings,"▪️التصنيف: السابعة على المملكة المتحدة،  وال٣٥ عالميًّا حسب تصنيف QS الدولي لعام ٢٠٢٢م.");
    Universities um = new Universities("University Of Manchester ","https://www.manchester.ac.uk/",R.drawable.u9,R.drawable.manchester,"لتصنيف:السادسة على المملكة المُتحدة،  وال٢٨ عالميًّا حسب تصنيف QS الدولي لعام ٢٠٢٢م.");
    Universities ub = new Universities("University Of Bristol ","https://www.bristol.ac.uk/",R.drawable.bristo,R.drawable.bristol,"▪️التصنيف: التاسعة على المملكة المُتحدة،  وال٦٢ عالميًّا حسب تصنيف QS الدولي لعام ٢٠٢٢م.");
    Universities ug = new Universities("University Of Glasgow ","https://www.gla.ac.uk/",R.drawable.u8,R.drawable.glas,"▪️التصنيف: الحادي عشر على المملكة المُتحدة،  وال٧٣ش عالميًّا حسب تصنيف QS الدولي لعام ٢٠٢٢م.");
    Universities uw = new Universities("Universitiy Of Warwick","https://warwick.ac.uk/",R.drawable.u7,R.drawable.warwick,"▪️التصنيف: العاشرة على المملكة المُتحدة،  وال٦١ عالميًّا حسب تصنيف QS الدولي لعام ٢٠٢٢م.");
        universitieslist.add(campridge);
        universitieslist.add(oxfordd);
        universitieslist.add(IC);
        universitieslist.add(uc);
        universitieslist.add(ue);
        universitieslist.add(um);
        universitieslist.add(kc);
        universitieslist.add(lse);
        universitieslist.add(ub);
        universitieslist.add(uw);
        universitieslist.add(ug);
UniversitiesA universitiesA = new UniversitiesA(this,0,universitieslist);

ImageView imageView = findViewById(R.id.imageView11);
        ListView listView3 = findViewById(R.id.listview);
        listView3.setAdapter(universitiesA);


        home.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent4 = new Intent(Content.this,Home.class);
               startActivity(intent4);
               overridePendingTransition(R.anim.anim5,R.anim.anim4);
               finish();}});




}
}