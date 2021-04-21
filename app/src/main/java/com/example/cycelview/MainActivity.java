package com.example.cycelview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ArrayList<Type> arrayList;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();
        addArr();
        recyclerView = findViewById(R.id.list_store);
        TypeAdapter typeAdapter = new TypeAdapter(MainActivity.this, R.layout.line_item, arrayList);
        recyclerView.setAdapter(typeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void addArr(){
        ArrayList<Store> storeArrayList =  new ArrayList<>();
        storeArrayList.add(new Store(R.drawable.a, "Jinro BBQ Huỳnh Thúc Kháng", "91A Nguyễn Chí Thanh, Đống Đa, Hà nội", "Cả ngày - Giảm 15%", 2));
        storeArrayList.add(new Store(R.drawable.b, "Box BBQ Đỗ Quang", "37 Đỗ Quang, Cầu Giấy, Hà Nội", "Ăn trưa - Giảm 23%", 2));
        storeArrayList.add(new Store(R.drawable.koh_yam,  "Koh Yam - Thai Kitchen & Dessert - Giảng Võ", "122K1 Giảng Võ, Đống Đa, Hà Nội", "Ăn tối - Giảm 15%", 3));
        storeArrayList.add(new Store(R.drawable.lau_phan2, "Lẩu Phan - Buffet Bò Úc - Nguyễn Văn Cừ", "485 Nguyễn Văn Cừ, Long Biên, Hà Nội", " Ăn trưa - Đi 4 tính 3", 1));
        storeArrayList.add(new Store(R.drawable.quan_moc, "Bò Tơ Quán Mộc - Nguyễn Thị Định", "B52 Nguyễn Thị Định, Thanh Xuân, Hà Nội", "Cả ngày - Giảm 50%", 3));
        storeArrayList.add(new Store(R.drawable.lau_thai, "Lẩu Thái Đế Vương - Food House - Thái Hà", "85 Thái Hà, Đống Đa, Hà Nội", "Cả ngày - Giảm 15%", 5));
        storeArrayList.add(new Store(R.drawable.shin_bbq,  "Shin+ BBQ", "22-23 Lô 06 Khu Đô Thị Shophouse, Tố Hữu, Hà Đông","Cả ngày - Đi 4 tính 3", 3));

        arrayList.add(new Type("Cửa hàng được ưa thích nhất", storeArrayList));
        arrayList.add(new Type("Cửa hàng mới tham gia Foody", storeArrayList));
        arrayList.add(new Type("Danh sách của hàng hiện có", storeArrayList));
        arrayList.add(new Type("", storeArrayList));
        arrayList.add(new Type("", storeArrayList));
        arrayList.add(new Type("", storeArrayList));
    }
}