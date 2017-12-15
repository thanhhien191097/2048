package linhmil.oop.hcmiu.rescuepets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity implements View.OnClickListener {

    Button bMenuPlay, bStore, bMenuSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bMenuPlay = (Button) findViewById(R.id.bMenuPlay);
        bMenuSetting = (Button) findViewById(R.id.bMenuSetting);
        bStore = (Button) findViewById(R.id.bStore);

        bMenuSetting.setOnClickListener(this);
        bMenuPlay.setOnClickListener(this);
        bStore.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bMenuPlay:
                Intent iPlay=new Intent(this, PlayActivity.class);
                startActivity(iPlay);
                break;
            case R.id.bStore:
                //Intent iStore=new Intent(this, StoreActivity.class);
                //startActivity(iStore);
                break;
            //case R.id.bMenuSetting:
                //break;
        }
    }
}
