package in.tagglabs.rs_reg;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

//import com.example.rs_reg.R;

public class redeem extends AppCompatActivity {
    ImageButton imageButton;
//    @Bind(R.id.one);
    TextView HyperLink,two,three,four,five,f4,f5;
    Spanned Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/regular.ttf");
        imageButton=(ImageButton)findViewById(R.id.backredeem);
        HyperLink=(TextView)findViewById(R.id.one);
        two=(TextView)findViewById(R.id.two);
        three=(TextView)findViewById(R.id.three);
        four=(TextView)findViewById(R.id.four);
        five=(TextView)findViewById(R.id.five);
        f4=(TextView)findViewById(R.id.f4);
        f5=(TextView)findViewById(R.id.f5);
        Text = Html.fromHtml("1. "+"To be redeemed at "+"<a href='bit.ly/19ESVgv'>bit.ly/19ESVgv</a>");
        HyperLink.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink.setText(Text);
        HyperLink.setTypeface(custom_font);
        two.setTypeface(custom_font);
        three.setTypeface(custom_font);
        four.setTypeface(custom_font);
        five.setTypeface(custom_font);
        f4.setTypeface(custom_font);
        f5.setTypeface(custom_font);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),start.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
