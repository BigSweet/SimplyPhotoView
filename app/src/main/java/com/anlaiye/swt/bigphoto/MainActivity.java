package com.anlaiye.swt.bigphoto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private String img = "http://pic.anlaiye.com.cn/6a143da5964749ab990343091ce3a0be_799x1066.png";
    private String img1 = "http://pic.anlaiye.com.cn/7e6f898d8ed14d00a7b2b844c7dccfe0_799x1422.png";
    private List<String> mlist = new ArrayList<>();
    private CstImage image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (CstImage) findViewById(R.id.cstimage);
        mlist.add(img);
        mlist.add(img1);
        image.setImgs(mlist);
        image.setOnChildItemClickListener(new CstImage.OnChlidItemClickListener() {
            @Override
            public void onClick(int position, List<String> imgs) {
                Intent intent = new Intent(MainActivity.this, BigImageActivity.class);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("tulist", (ArrayList<String>) mlist);
                bundle.putInt("pos", position);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
