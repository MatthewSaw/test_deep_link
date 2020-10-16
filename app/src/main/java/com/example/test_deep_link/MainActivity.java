package com.example.test_deep_link;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String deepLink = "http://matthewsaw.github.io/items";
    private static final String deepLinkMatch = "http://matthewsaw.github.io/items";
    private Button deepLinkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deepLinkButton = findViewById(R.id.deepLinkButton);

        deepLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (deepLink.equalsIgnoreCase(deepLinkMatch)) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(deepLink));
                    intent.putExtra("SESSION_ID","123456789ABCDEFGH");
                    startActivity(intent);
                }
            }
        });
        // ATTENTION: This was auto-generated to handle app links.
//        Intent appLinkIntent = getIntent();
//        String appLinkAction = appLinkIntent.getAction();
//        Uri appLinkData = appLinkIntent.getData();
    }
}