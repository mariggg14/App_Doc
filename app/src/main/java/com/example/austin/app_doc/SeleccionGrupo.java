package com.example.austin.app_doc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SeleccionGrupo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_grupo);

        //OCULTAR ACTIONBAR
        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById(R.id.grpListItem);
        List<GrpItem> grpItemList = new ArrayList<>();

        grpItemList.add(new GrpItem(R.drawable.grp1, "8ª Grupo |4K|"));
        grpItemList.add(new GrpItem(R.drawable.grp2, "8ª Grupo |4K|"));
        grpItemList.add(new GrpItem(R.drawable.grp3, "8ª Grupo |4K|"));
        grpItemList.add(new GrpItem(R.drawable.grp3, "8ª Grupo |4K|"));
        grpItemList.add(new GrpItem(R.drawable.grp4, "8ª Grupo |4K|"));

        GrpAdaptador adaptador = new GrpAdaptador(this, grpItemList);
        recyclerView.setAdapter(adaptador);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
